package base;

import org.testng.annotations.Test;
import pages.ShoesSubcategoryPage;

public class ShoesSubCategoryTests extends BaseTests {


    @Test
    public void filterByColorTest() throws InterruptedException {
        homePage.hoverOverApparelCategory();
        ShoesSubcategoryPage shoesSubcategoryPage=homePage.clickShoesSubcategory();
        shoesSubcategoryPage.filterByBlue();
        Thread.sleep(1000);
    }

    @Test
    public void filterByTagTest() throws InterruptedException {
        homePage.hoverOverApparelCategory();
        ShoesSubcategoryPage shoesSubcategoryPage=homePage.clickShoesSubcategory();
        shoesSubcategoryPage.filterByApparelTag();
        Thread.sleep(1000);
        shoesSubcategoryPage.filterByAwesomeTag();
        Thread.sleep(1000);
        shoesSubcategoryPage.filterByCoolTag();
    }
}
