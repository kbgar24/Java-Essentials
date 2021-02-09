import java.util.Scanner;

public class UWFLTranslatorTester
{
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		UWFLTranslator myTranslator;
		String str = "exit";
		String vowels = "";
		String translatedString = "";
		
		System.out.println("Welcome to the UWF Language Translator");
		System.out.println("Enter a String to translate: ");
		
		if (input.hasNextLine()) {
			str = input.nextLine().toLowerCase();
		}
		
		while (str.equalsIgnoreCase("exit")) {
			
			System.out.println("Enter a String to represent vowels:");
			
			if (input.hasNextLine()) {
				vowels = input.nextLine();
			} else {
				break;
			}
			
			if (vowels.equalsIgnoreCase("exit"))
			{
				break;	
			}
			
			if (vowels.isEmpty()){
				myTranslator = new UWFLTranslator();
			} else {
				myTranslator = new UWFLTranslator(vowels);
			}
			
			translatedString = myTranslator.translateString(str);
			
			System.out.println("Translated String: " + translatedString);
			
			System.out.println("Enter a String to translate: ");
			
			if (input.hasNextLine()) {
				str = input.nextLine();
			} else {
				break;
			}
			
			}
			System.out.println("Goodbye!");
		
		}
	
	
}
