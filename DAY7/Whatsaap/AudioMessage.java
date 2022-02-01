import java.util.Date;

public class AudioMessage extends Message {
	
	private float maxFileSizeInMB = 13; // MAximum size of the Audio
	private float maxFileLengthInMinutes = 3; //To see the maximum size of the Audio
	private float fileSizeInMB; //To hold the file size
	private float fileLengthInMinutes; //To hold the file length
	public AudioMessage(String content, Date dateAndTime, float fileSizeInMB, float fileLengthInMinutes) { //Constructor
		super(content, "audio", dateAndTime);
		this.fileSizeInMB = fileSizeInMB;
		this.fileLengthInMinutes = fileLengthInMinutes;
	}
	
}
