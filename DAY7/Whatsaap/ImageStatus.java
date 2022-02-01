import java.util.*;

public class ImageStatus extends Status {
	
	private double sizeInKB; // Size of the image
	private String format;  // Format of the image
	
	ImageStatus(String content, Date dateAndTime, double sizeInKB, String format){
		super(content, "image", dateAndTime);
		this.sizeInKB = sizeInKB;
		this.format = format;
	}

}
