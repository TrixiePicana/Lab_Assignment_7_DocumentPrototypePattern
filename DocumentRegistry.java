package labassignment7_DocumentPrototypePattern;

import java.util.HashMap;
import java.util.Map;

class DocumentRegistry 
{
    private Map<String, Document> prototypes = new HashMap<>();

    public DocumentRegistry() 
    {
        PdfDocument pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "PDF Prototype");
        prototypes.put("pdf", pdfPrototype);
        System.out.println("Creating a PDF Document prototype.");

        TextDocument textPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);
        prototypes.put("text", textPrototype);
        System.out.println("Creating a Text Document prototype.");

        SpreadsheetDocument spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
        prototypes.put("spreadsheet", spreadsheetPrototype);
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public Document getPrototype(String type) 
    {
        return prototypes.get(type).clone();
    }
}