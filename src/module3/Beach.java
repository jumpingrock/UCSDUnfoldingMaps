package module3;

//import java.util.List;

//Processing library
import processing.core.PApplet;
import processing.core.PImage;
import java.sql.Timestamp;
import java.text.DateFormat;
//Parsing library
//import parsing.ParseFeed;



public class Beach extends PApplet{
	private String url = "https://images.pexels.com/photos/457878/pexels-photo-457878.jpeg?cs=srgb&dl=beach-calm-clouds-coconut-trees-457878.jpg&fm=jpg";
	private PImage backgroundImg;
//	private Timestamp timestamp = new Timestamp(System.currentTimeMillis());

	public void setup () {
		size(200, 200);
		backgroundImg = loadImage(url,"jpg");
	}
	
	public void draw () {
//		for(int i=0; i<10000; i++) {
//			System.out.println(System.currentTimeMillis());
//		}
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
		fill(255,209,0);
		ellipse(width/4, height/5, width/5, height/5);
//
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
