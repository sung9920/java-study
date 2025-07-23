package chapter03.ex13;

public class Song {

		private String title;
		private String artist;		
		private String album; 
		private String composer; 
		private int year; 
		private int track;
		
		public Song(String title, String artist) {
			this(title, artist, "", "", 0, 0);
//			this.title = title;
//			this.artist = artist;
//			System.out.println("some code1");
//			System.out.println("some code2");
//			System.out.println("some code3");
//			System.out.println("some code4");
//			System.out.println("some code5");
		}
		
		public Song(String title, String artist, String composer, String album, int year, int track) {
			this.title = title;
			this.artist = artist;
			this.composer = composer;
			this.album = album;
			this.year = year;
			this.track = track;
		}
		

		public void show() {
			System.out.println(
				artist   + " " +
				title    + " (" +
				album    + ", " + 
				year     + ", " + 
				track    + "번 track, " + 
				composer + " 작곡)"
			);
		}
		
}
