package labassignment7_DocumentPrototypePattern;

public class SpreadsheetDocument implements Document
{
	private String spreadsheetName;
	private int rowCount;
	private int columnCount;
	
	public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount)
	{
		this.spreadsheetName = spreadsheetName;
		this.rowCount = rowCount;
		this.columnCount = columnCount;
	}
	
	public String getspreadsheetName()
	{
		return spreadsheetName;
	}
	
	public int getrowCount()
	{
		return rowCount;
	}
	
	public int getcolumnCount() 
	{
		return columnCount;
	}
	
	@Override 
	public SpreadsheetDocument clone()
	{
		try
		{
			return(SpreadsheetDocument) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new AssertionError();
		}
	}
	
	@Override
	public void open()
	{
		System.out.printf("Opening Spreadsheet Document: %s (%d rows, %d columns)%n", spreadsheetName, rowCount, columnCount);
        System.out.printf("Type: Spreadsheet, Name: %s, Rows: %d, Columns: %d%n%n", spreadsheetName, rowCount, columnCount);
	}
	
	@Override
	public String getType()
	{
		return "Spreadsheet";
	}
}
