package week11;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	Song() {
		title = null;
		artist = null;
		album = null;
		composer = null;
		year = 0;
	}
	Song (String title, String artist, String album, String[] composer, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
	}
	public void show() {
		System.out.println("�뷡 ���� : " + title);
		System.out.println("���� : " + artist);
		System.out.println("�ٹ� : " + album);
		System.out.print("�۰ : ");
		for (int i=0; i<composer.length; i++) {
			 System.out.print(composer[i]);
			 if (i+1 == composer.length)
				 System.out.println();
			 else
				 System.out.print(", ");
		}
		System.out.println("�⵵ : " + year);
	}

}