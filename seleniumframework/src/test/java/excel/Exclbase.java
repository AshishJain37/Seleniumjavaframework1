package excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exclbase {

	static XSSFWorkbook wrk;
	static XSSFSheet sht;

	Exclbase(String path, String Sheetname){
		try {
			wrk= new XSSFWorkbook(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sht=wrk.getSheet(Sheetname);
		System.out.println(sht.getPhysicalNumberOfRows());

	}
	
public static int getrowcount() {
	return sht.getPhysicalNumberOfRows();
		
		
		
	}

public static int  getcoloumcount() {
	return sht.getRow(0).getPhysicalNumberOfCells();
	
	
}



	public static String getcelldataString(int r,int c) {

		return (sht.getRow(r).getCell(c).getStringCellValue());
		

	}
	public static void getcelldataint() {

		//System.out.println(sht.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sht.getRow(0).getCell(1).getStringCellValue());

	}
	

}


