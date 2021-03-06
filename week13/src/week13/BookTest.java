package week13;

class Book {
	private String title;
	private int pages;
	private String writer;
	
	public Book(String title, int pages, String writer) {
		super();
		this.title = title;
		this.pages = pages;
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "잡지명 : " + title + "\n페이지명 : " + pages + "\n저자 :" + writer;
	}
}

class Magazine extends Book{
	private String date;

	public Magazine(String title, int pages, String writer, String date) {
		super(title, pages, writer);
		this.date = date;
	}

	@Override
	public String toString() {
		return super.toString() + "\n발매일 : " + date;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Magazine mA = new Magazine("잡지A", 100, "이순신", "2020년 6월 1일");
		Magazine mB = new Magazine("잡지B", 200, "홍길동", "2020년 7월 1일");
		
		System.out.println(mA);
		System.out.println("");
		System.out.println(mB);
	}
}