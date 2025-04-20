package labassignment7_DocumentPrototypePattern;

public class TextDocument implements Document
{
	private String filePath;
	private String encoding;
	private int wordCount;
	
	public TextDocument(String filePath, String encoding, int wordCount) 
	{
		this.filePath = filePath;
		this.encoding = encoding;
		this.wordCount = wordCount;
	}
	
	public String getfilePath()
	{
		return filePath;
	}
	
	public String getencoding()
	{
		return encoding;
	}
	
	public int getwordCount()
	{
		return wordCount;
	}
	
	@Override
	public TextDocument clone() 
	{
		try
		{
			return (TextDocument) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new AssertionError();
		}
	}
	
	@Override
	public void open()
	{
		System.out.printf("Opening Text Document: %s with encoding: %s (%d words)%n", filePath, encoding, wordCount);
        System.out.printf("Type: Text, Path: %s, Encoding: %s, Words: %d%n%n", filePath, encoding, wordCount);
	}
	
	@Override
	public String getType()
	{
		return "Text";
	}
}
