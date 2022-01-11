package practise.AppiumFramework;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="InputData")
	public Object[][] getDataforEditField()
	{
		//2 sets of data, "hello" , "!@#$$"
		Object[][] obj=new Object[][]       // int degil object kullandigimiz icin string int hepsini kabul ediyor
				{
			
			{"hello"}, {"@#$%"}   // ilk senaryoda hello ile baslayip bitecek ikinci senaryo da @#$% bununla ve böyle devam edecek(ayni senaryo iki defa kosulacak sadece biri hello digeri baska bir sey olacak
			                       
				};
				
				return obj;
				
	}

}
