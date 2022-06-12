package task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static FileInputStream fis= null;
	public FileInputStream getFileInputStream() 
	{
		String filepath = System.getProperty("user.dir")+"/src/test/java/task1/googleData.xlsx";
		File srcFile = new File(filepath);

		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found treminating Process!! : Check file  path of TestData");
			System.exit(0);
		}

		return fis; 
	
	}
	public Object [][] getExcelData() throws IOException
	{
		fis = getFileInputStream();
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int totalNuOfRows= (sheet.getLastRowNum()+1);
		int totalNuOfCols= 2;

		String [][]arrayExeclOfData = new String[totalNuOfRows][totalNuOfCols];

		for( int i=0; i<totalNuOfRows; i++)
		{
			for (int j = 0; j < totalNuOfCols; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayExeclOfData[i][j] = row.getCell(j).toString();
			}
		}

		wb.close();
		return arrayExeclOfData;
	}
	

}
