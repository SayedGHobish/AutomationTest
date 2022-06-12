package downloads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExeclRead {
	static FileInputStream fis= null;
	public FileInputStream getFileInputStream() 
	{
		String filepath = System.getProperty("user.dir")+"/zData/Downloads/gantt-chart_L.xlsx";
		File srcFile = new File(filepath);

		try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found treminating Process!! : Check file  path of TestData");
			System.exit(0);
		}

		return fis; 

	}

	public Object [] getExcelData() throws IOException
	{
		fis = getFileInputStream();
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int totalNuOfRows= (sheet.getLastRowNum()+1);

		String[]arrayExeclOfData = new String[totalNuOfRows];
		for (int i = 0; i <= arrayExeclOfData.length; i++) 
		{
			if(i>9)
			{
				XSSFRow row= sheet.getRow(i);
			  System.out.println(row.getRowNum());
			}
			
		}
		wb.close();
		return arrayExeclOfData;

	}

}
