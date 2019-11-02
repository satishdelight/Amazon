package com.amazon.tests.home;

import org.testng.Assert;
import org.testng.annotations.*;

import com.amazon.common.utils.BaseTest;
import com.amazon.common.utils.CommonMethods;
import com.amazon.pages.login.HomePage;
import com.amazon.pages.login.SearchPage;

public class SearchMultipleProduct extends BaseTest{
	
	
	
	CommonMethods commonMethodObj=new CommonMethods();
	
    @DataProvider(name = "SEARCH_PRODUCT")
    public Object[][] createData1() throws Exception{
        Object[][] retObjArr=commonMethodObj.getTableArray("test-data\\AmazonTestData.xls",
                "Products", "searchProduct");
        return(retObjArr);
    }
	
	public SearchMultipleProduct() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dataProvider="SEARCH_PRODUCT")
	public void validateNoResult(String searchText){
		SearchPage searchPageObj=new SearchPage(driver);
		HomePage homePageObj=new HomePage(driver);
		homePageObj.searchBox(searchText);
		String text=searchPageObj.noResultFound();
		String expectedText="Your search \""+searchText+"\" did not match any products.";
		Assert.assertEquals(text, expectedText);
	}
	
	
}
