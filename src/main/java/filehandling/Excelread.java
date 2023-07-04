package filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Excelread {
	String filepath = "C:\\Users\\Abhinav Prabhu\\eclipse-workspace\\Selenium\\src\\filehandling\\Inputdata";
	String filename="Readdata.xlsx";
	
	public void Readdata() throws IOException
	{
		File F= new File(filepath+filename);
		FileInputStream FS = new FileInputStream(F);
		XSSFWorkbook workbook=new XSSFWorkbook(FS);
	
       Sheet sheet= workbook.getSheet("family");
	   int totalRows = sheet.getPhysicalNumberOfRows();
	for(int i=0;i<totalRows;i++)
	{
	    Row row = sheet.getRow(i);
	    int totalcolumn = row.getLastCellNum();
	    for(int j=0;j<totalcolumn;j++)
	    {
	    	Cell eachcell=row.getCell(j);
	    	System.out.print(eachcell.getStringCellValue());
	    	System.out.print("\t");
	    	
	    }

	    System.out.print(" ");
	}

	}
	
	
	
	public static void main(String[] args) throws IOException
	{
		
// TODO Auto-generated method stub
		Excelread E= new Excelread();
		E.Readdata();
		

	}

}

