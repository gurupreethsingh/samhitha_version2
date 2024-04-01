package generic;

public class FetchDataExcel 
{
  public String getData(String path, String sheetname, int rownumber, int cellnumber)
  {
	  String value =null;
	  try
	  {
		  File f = new File(path);
		 FileInputStream fis = new FileInputStream(f);
		  Workbook wb = WorkbookFactory.create(fis);
		  
		  value =  wb.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
	  }
	  catch(Exception ex)
	  {
		  ex.printStackTrace();
	  }
	  return value;
  }  
}
