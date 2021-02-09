

public class TabSeparatedFile extends SuperFile
{

	public TabSeparatedFile (String file, int size)
	{
		super(file, size, "\t");
	}
	
	public String printTab() {
		return this.getSeperator();
	}

}
