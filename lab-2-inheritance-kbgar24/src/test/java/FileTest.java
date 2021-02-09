import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileTest
{
	@Test
	public void Test_CSV ()
	{
		CommaSeparatedFile csv = new CommaSeparatedFile("foo.txt", 1234);
		assertEquals("foo.txt", csv.getFilename());
		assertEquals(1234, csv.getFileSize());
		assertEquals(",", csv.printComma());
	}

	@Test
	public void Test_TSV ()
	{
		TabSeparatedFile tsv = new TabSeparatedFile("bar.baz", 9876543);
		assertEquals("bar.baz", tsv.getFilename());
		assertEquals(9876543, tsv.getFileSize());
		assertEquals("\t", tsv.printTab());
	}
}