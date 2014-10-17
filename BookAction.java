package book;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookAction {
	private List<Book> books =new ArrayList<Book>();
	private String searchkey;
	private int auid;
	private String auname;
	private int auage;
	private String aucountry;
	
	
	public List<Book> getBooks(){
		return books;
	}
	
	public String execute(){
		Statement stmt;
		DBConnection db=new DBConnection();
		ResultSet rs;
		Book booktemp;
		try {
			stmt = db.dbConn.createStatement();
			
			String sql ="select * from my_author where my_author.Name='"+searchkey+"'";
			
			rs = stmt.executeQuery(sql);
			if (rs.next()){
			    auid=rs.getInt(1);
			    auname=rs.getString(2);
			    auage=rs.getInt(3);
			    aucountry=rs.getString(4);
			    
			sql="select * from my_book where my_book.AuthorID='"+String.valueOf(auid)+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()){
				booktemp=new Book(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
				books.add(booktemp);
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
	
	public String getSearchkey() {
		return searchkey;
	}
	public void setSearchkey(String searchkey) {
		this.searchkey = searchkey;
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
