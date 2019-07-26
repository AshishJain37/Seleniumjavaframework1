package excel;

import org.omg.CORBA.Object;
import org.testng.annotations.DataProvider;

public class Excldataprovder {
	static String path;

	public static void main(String[] args) {

		path="C:\\Users\\jaashish\\eclipse-workspace\\seleniumframework\\Excl\\excldata.xlsx";
		Excldataprovder.testdata(path,"Sheet1");
	}


	public static void testdata(String path, String sheet) {

		Exclbase ex= new Exclbase(path, sheet); 
		int row=Exclbase.getrowcount();
		int coloum= Exclbase.getcoloumcount();

		for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++) {
				System.out.println(Exclbase.getcelldataString(i, j));
				System.out.println();
			}

		}
	}
    @DataProvider(name="testdata")
	public Object[][] dataprovid(){
		Exclbase ex= new Exclbase(path, "Sheet1");
		int row=Exclbase.getrowcount();
		int coloum= Exclbase.getcoloumcount();
		Object [][]obj= new Object[row][coloum];
		for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++) {
				String n=Exclbase.getcelldataString(i, j);
			
				obj[i][j]=n;
			}

	}return obj;




}
}
