public class ShuffleCipher implements MessageEncoder{

	private int shift;
	public ShuffleCipher(int shift)
	{
		this.shift=shift;
	}
	public String encode(String Text)
	{
		int i=0;
		String encodedText="";
		for(i=0;i<Text.length();i++)
		{
				encodedText+=(char)(Text.charAt(i)+shift);	
		}
		return encodedText;
	}	
}
