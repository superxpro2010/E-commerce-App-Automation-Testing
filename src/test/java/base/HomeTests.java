package base;

import org.testng.annotations.Test;
import pages.ShoesSubcategoryPage;

public class HomeTests extends BaseTests {



    @Test
    public void testChangeCurrency() throws InterruptedException {
//        homePage.selectCustomerCurrency("Euro");
//        Thread.sleep(1000);
//        System.out.println(homePage.getSelectedCurrency());
        homePage.hoverOverComputerCategory();
        homePage.hoverOverApparelCategory();
        Thread.sleep(1000);
        ShoesSubcategoryPage shoesSubcategoryPage = homePage.clickShoesSubcategory();
        Thread.sleep(2000);
    }
    @Test
    public void testAddItemsToCompareList() throws InterruptedException {
        homePage.clickBuilOwnComputerComparelist();
        Thread.sleep(2000);
        homePage.clickAppleMacbookComparelist();
        Thread.sleep(2000);
        homePage.clickHtcOneComparelist();
        Thread.sleep(2000);


    }
}
