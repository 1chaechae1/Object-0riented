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
		return "������ : " + title + "\n�������� : " + pages + "\n���� :" + writer;
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
		return super.toString() + "\n�߸��� : " + date;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Magazine mA = new Magazine("����A", 100, "�̼���", "2020�� 6�� 1��");
		Magazine mB = new Magazine("����B", 200, "ȫ�浿", "2020�� 7�� 1��");
		
		System.out.println(mA);
		System.out.println("");
		System.out.println(mB);
	}
}