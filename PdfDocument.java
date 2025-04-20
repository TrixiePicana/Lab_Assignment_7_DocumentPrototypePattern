package labassignment7_DocumentPrototypePattern;

public class PdfDocument implements Document
{
	private String filename;
	private String author;
	private int pageCount;
	private String name;
	
	public PdfDocument (String filename, String author, int pageCount, String name) 
	{
		this.filename = filename;
		this.author = author;
		this.pageCount = pageCount;
		this.name = name;
	} 
	
	public String getfilename() 
	{
		return filename;
	}
	
	public String getauthor() 
	{
		return author;
	}
	
	public int getpageCount() 
	{
		return pageCount;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setfilename(String filename)
	{
		this.filename = filename;
	}
	
	public void setauthor(String author)
	{
		this.author = author;
	}
	
	public void setpageCount(int pageCount)
	{
		this.pageCount = pageCount;
	}
	
	public void setname(String name) 
	{
		this.name = name;
	}
	
	@Override
	public PdfDocument clone()
	{
		try 
		{
			return (PdfDocument) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new AssertionError();
		}
	}
	
	@Override
	public void open()
	{
		System.out.printf("Opening PDF Document: %s by %s (%d pages)%n", filename, author, pageCount);
        System.out.printf("Type: PDF, File: %s, Author: %s, Pages: %d%n%n", filename, author, pageCount);
	}
	
	@Override
	public String getType()
	{
		return "PDF";
	}
}
