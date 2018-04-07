
public class SubstitutionCipher {

	private int shift;
	public SubstitutionCipher(int shift)
	{
		this.shift=shift;
	}
	public String encode(String plainText)
	{
		int i=0;
		String encodedText="";
		for(i=0;i<plainText.length();i++)
		{
				encodedText+=(char)(plainText.charAt(i)+shift);	
		}
		return encodedText;
	}	
}
