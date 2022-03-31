package MySpring;

public class Book {
String bookId;
int price;
String bookname;
String authorName;
float version;

public void setbookId(String bookId) {
	this.bookId=bookId;
	}
public void bookId() {
	System.out.println(bookId);
	}
public void setbookName(String bookName) {
	this.bookname=bookName;
	}
public void bookName() {
	System.out.println(bookname);
	}
public void setprice(int price) {
	this.price=price;
	}
public void Bookprice() {
	System.out.println(price);
	}
public void setauthorName(String authorName) {
	this.authorName=authorName;
	}
public void authorName() {
	System.out.println(authorName);
	}
public void version(float version) {
	this.version=version;
	}
public void version() {
	System.out.println(version);
	}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", price=" + price + ", bookname=" + bookname + ", authorName=" + authorName
			+ ", version=" + version + "]";
}
}
