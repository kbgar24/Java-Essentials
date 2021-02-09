public class SuperFile
{
	private String fileName;
	private String separator;
	private int fileSize;

	public SuperFile (String file, int size, String seperator)
	{
		this.separator = seperator;
		this.fileName = file;
		this.fileSize = size;
	}

	public String getFilename ()
	{
		return this.fileName;
	}

	public int getFileSize ()
	{
		return this.fileSize;
	}

	public String getSeperator ()
	{
		return this.separator;
	}
}
