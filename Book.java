package book;
//I make changes here

public class Book {
	private String isbn;
	private String title;
	private int authorID;
	private String publisher;
	private String publishDate;
	private String price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAuthorID() {
		return authorID;
	}
	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
    
	public Book(String isbn,String title,int authorID,String publisher,String publishDate,String price){
		
		this.isbn=isbn;
		this.title=title;
		this.authorID=authorID;
		this.publisher=publisher;
		this.publishDate=publishDate;
		this.price=price;
	}
	public Book(){
	}
	
}
