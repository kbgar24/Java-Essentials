public class UWFLTranslator
{
	private String vowels;
	
	public UWFLTranslator()
	{
		this.vowels = "aeiou";
	}
	
	public UWFLTranslator(String vowels)
	{
		this.vowels = vowels.toLowerCase();
	}
	
	public String translateString(String str)
	{
		String newString = "";
		
		String[] arrOfStr = str.toLowerCase().split(" ");
		
		for (String word : arrOfStr) {
			String newWord = translateWord(word);
			newString += " " + newWord;
		}
		
		return newString.trim();
	}
	
	public String translateWord(String word)
	{
		String newWord = "";
		String prefix = "";
		String suffix = "uwf";
		
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			Boolean isVowel = this.vowels.indexOf(c) > -1;
			
			if (i == 0) {
				if (isVowel) {
					prefix += ("h" + c);
				} else {
					suffix = "argo";
					newWord = word;
					break;
				}
			} else {
				if (isVowel) {
					
					Boolean hasEmptyPrefix = prefix.isEmpty();
					
					if (hasEmptyPrefix) {
						prefix += "h";
					}
					
					prefix += c;
				} else {
					newWord += c;
				}
			}
		}
		
		newWord = prefix + newWord + suffix;
		
		return newWord.trim();
	}
	
	public String getVowels() {
		return this.vowels;
	}
	
	public void setVowels(String v) {
		this.vowels = v;
	}

}
