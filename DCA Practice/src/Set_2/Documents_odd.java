package Set_2;

import java.util.Scanner;

public class Documents_odd {
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
		Document[] doc = docsWithOddPages(docs);
		for(int i = 0; i<doc.length; i++) {
			System.out.println();
		System.out.print(doc[i].getId());
		System.out.print(" "+doc[i].getTitle());
		System.out.print(" "+doc[i].getfolderName());
		System.out.print(" "+doc[i].getpages());
		}
		
		
	}
	public static Document[] docsWithOddPages(Document[] docs) {
		Document[] doc = null;
		int n = 0;
		
		for(int i = 0; i<docs.length; i++) {
			if(docs[i].getpages()%2 == 1) {
				n++;
			}
		}
		doc = new Document[n];
		n=0;
		for(int i = 0; i<docs.length; i++) {
			if(docs[i].getpages()%2 == 1) {
				doc[n++] = docs[i];
			}
		}
		
		for(int i = 0; i<doc.length-1; i++) {
			for(int j = i+1; j<doc.length; j++) {
				if(docs[i].getId()>docs[j].getId()) {
					Document temp = doc[i];
					doc[i] = doc[j];
					doc[j] = temp;
				}
			}
		}
		
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

