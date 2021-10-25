package Set_3;
import java.util.*;

public class Books_price {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Book[] b = new Book[4];
		for(int i = 0; i<b.length; i++) {
			int id = sc.nextInt(); sc.nextLine();
			String title = sc.nextLine();
			String author = sc.nextLine();
			double price = sc.nextInt();
			b[i] = new Book(id, title, author, price);
		}
		sc.close();
		Book[] bb = sortBookByPrice(b);
		for(Book p:bb) {
			System.out.println(p.getId() + " " + p.getTitle() + " " + p.getAuthor() + " " + p.getPrice());
		}
		
		
	}
	public static Book[] sortBookByPrice(Book b[]) {
		for(int i = 0; i<b.length; i++) {
			for(int j = i+1; j<b.length; j++) {
				if(b[i].getPrice()>b[j].getPrice()) {
					Book temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		
		
		return b;
	}

}
class Book{
	int id;
	String title;
	String author;
	double price;
	public Book(int id,
	String title,
	String author,
	Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	
}
