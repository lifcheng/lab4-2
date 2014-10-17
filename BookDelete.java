package book;
//I make changes here
import java.sql.SQLException;
import java.sql.Statement;

public class BookDelete {
	private String isbn;
	public String execute(){
		Statement stmt;
		DBConnection db=new DBConnection();
		
		try {
			stmt = db.dbConn.createStatement();
			
			String sql ="delete from my_book where my_book.ISBN='"+isbn+"'";
			int rs=stmt.executeUpdate(sql);
			if (rs==0){
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
	
	
	

}
