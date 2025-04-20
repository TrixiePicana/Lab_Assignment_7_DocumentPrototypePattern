package labassignment7_DocumentPrototypePattern;

public class ProcessedDocument 
{
	public static void main(String[] args) 
	{
		DocumentRegistry registry = new DocumentRegistry(); 

        PdfDocument pdfDocument1 = (PdfDocument) registry.getPrototype("pdf"); //Get and open PDF Prototype
        pdfDocument1.open();

        TextDocument textDocument1 = (TextDocument) registry.getPrototype("text"); //Get and open Text Prototype
        textDocument1.open();

        SpreadsheetDocument spreadsheetDocument1 = (SpreadsheetDocument) registry.getPrototype("spreadsheet"); //Get and open Spreadsheet Prototype
        spreadsheetDocument1.open();
        
        PdfDocument pdfDocument2 = (PdfDocument) registry.getPrototype("pdf");
        pdfDocument2.setfilename("summary_report.pdf");
        pdfDocument2.setauthor("Acme Corp");
        pdfDocument2.setpageCount(30);
        pdfDocument2.open();
        
	}

}
