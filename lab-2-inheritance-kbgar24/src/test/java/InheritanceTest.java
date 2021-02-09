import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InheritanceTest
{
	@Test
	public void Test_CSV ()
	{
		CommaSeparatedFile csv = new CommaSeparatedFile("foo.txt", 1234);
		assertNotEquals("java.lang.Object", csv.getClass().getSuperclass().getName());
	}

	@Test
	public void Test_TSV ()
	{
		TabSeparatedFile tsv = new TabSeparatedFile("bar.baz", 9876543);
		assertNotEquals("java.lang.Object", tsv.getClass().getSuperclass().getName());
	}
}
