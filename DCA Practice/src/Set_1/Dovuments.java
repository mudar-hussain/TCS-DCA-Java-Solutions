package Set_1;
import java.util.*;

public class Dovuments {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Document[] docs = new Document[4];
		
		for(int i = 0; i<docs.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String title = sc.nextLine();
			String folderName = sc.nextLine();
			int pages = sc.nextInt();
			docs[i] = new Document(id,title,folderName,pages);
		}
		sc.close();
		Document doc = combineDocs(docs);
		System.out.println(doc.getId());
		System.out.println(doc.getTitle());
		System.out.println(doc.getfolderName());
		System.out.println(doc.getpages());
		
		
		
	}
	public static Document combineDocs(Document[] docs) {
		int maxID = docs[0].getId();
		String title = docs[0].getTitle();
		String folderName = docs[0].getfolderName();
		int pages = docs[0].getpages();
		
		for(int i = 1; i<docs.length; i++) {
			if(maxID<docs[i].getId()) {
				maxID = docs[i].getId();
			}
			title += "#"+docs[i].getTitle();
			folderName += "@"+docs[i].getfolderName();
			pages += docs[i].getpages();
		}
		
		Document doc = new Document(++maxID, title, folderName, pages);
		
		return doc;
	}
}
class Document{
	private int id;
	private String title;
	private String folderName;
	private int pages;
	public Document(int id, String title, String folderName, int pages){
		this.id = id;
		this.title = title;
		this.folderName = folderName;
		this.pages = pages;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getfolderName() {
		return folderName;
	}
	public int getpages() {
		return pages;
	}
	
	
}
