package autotest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class subtractTest {
   
	@DataProvider(name="sub")
    public Object[][] num(){
		return new Object[][] {
			{8,3,5},
			{17,6,11},
		};
	}
    
	
	@Test(dataProvider="sub")
	public void subTest(int input1,int input2,int expect) {
		assertEquals(expect, new math().subtract(input1, input2));
	}
	
}