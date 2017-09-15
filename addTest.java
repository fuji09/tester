package autotest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class addTest {
   
	@DataProvider(name="add")
    public Object[][] num(){
		return new Object[][] {
			{2,3,5},
			{5,6,11},
			{2,6,9},
		};
	}
    
	
	@Test(dataProvider="add")
	public void adTest(int input1,int input2,int expect) {
		assertEquals(expect, new math().add(input1, input2));
	}
	
}