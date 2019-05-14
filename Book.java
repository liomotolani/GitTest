import java.util.*;
public class Book{
	private String author;
	private String genre;
	private String title;
	private int numberOfPages;
	private boolean isHardCover;

	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return author;
	}
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	public String getGenre(){
		return genre;
	}

}