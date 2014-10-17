package book;
//I make changes here
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookInfo {
	private String isbn;
	private Book bookinfo;
	private int auid;
	private String auname;
	private int auage;
	private String aucountry;
	
	public String execute(){
		Statement stmt;
		DBConnection db=new DBConnection();
		ResultSet rs;
		try {
			stmt = db.dbConn.createStatement();
			
			String sql ="select * from my_book where my_book.ISBN='"+isbn+"'";
			
			rs = stmt.executeQuery(sql);
			if (rs.next()){
				bookinfo=new Book(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
			    
			sql="select * from my_author where my_author.AuthorID='"+String.valueOf(bookinfo.getAuthorID())+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()){
				auid=rs.getInt(1);
			    auname=rs.getString(2);
			    auage=rs.getInt(3);
			    aucountry=rs.getString(4);
			}
			else{
				return "error";
			}
			}
			else{
				return "error";
			}
			
			stmt.close();
			db.dbConn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		return "success";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Book getBookinfo() {
		return bookinfo;
	}

	public void setBookinfo(Book bookinfo) {
		this.bookinfo = bookinfo;
	}

	public String getAuname() {
		return auname;
	}

	public void setAuname(String auname) {
		this.auname = auname;
	}

	public int getAuage() {
		return auage;
	}

	public void setAuage(int auage) {
		this.auage = auage;
	}

	public String getAucountry() {
		return aucountry;
	}

	public void setAucountry(String aucountry) {
		this.aucountry = aucountry;
	}

	public int getAuid() {
		return auid;
	}

	public void setAuid(int auid) {
		this.auid = auid;
	}

}
