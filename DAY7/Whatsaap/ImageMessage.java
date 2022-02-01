import java.util.Date;

public class ImageMessage extends Message {
	
	private String format; // Format of the image
	private String maxSizeInKB;  // Maximum Size of the image
	
	public ImageMessage(String content, Date dateAndTime, String format, String maxSizeInKB) { //Constructor
		super(content, "image", dateAndTime);
		this.format = format;
		this.maxSizeInKB = maxSizeInKB;
	}
}
