package week11;

public class SongManager {
	public static void main(String args[]) {
		Song s1 = new Song("Bohemian Rhapsody", "Queen", "A Night at the Opera",
				new String[]{"Freddie Mercury"}, 1975);
		Song s2 = new Song("Persona", "BTS", "Map of the soul",
				new String[]{"Hiss Noise", "�ǵ�"}, 2019);

		s1.show();
		System.out.println("");		
		s2.show();

	}
}
