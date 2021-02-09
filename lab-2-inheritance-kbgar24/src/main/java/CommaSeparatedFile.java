public class CommaSeparatedFile extends SuperFile
{

	public CommaSeparatedFile (String file, int size)
	{
		super(file, size, ",");
	}


	public String printComma() {
		return this.getSeperator();
	}
}
