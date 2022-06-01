package base;

import org.testng.annotations.Test;
import pages.SearchResultPage;

public class SearchPageTests extends BaseTests {



    @Test
    public void testSearch() throws InterruptedException {
        homePage.enterSearchItem("Build your own computer");
        Thread.sleep(1000);
        SearchResultPage searchResultPage = homePage.clickSearchButton();
        Thread.sleep(1000);
        softAssert.assertEquals(searchResultPage.getSearchResult(),"Build your own computer");
        softAssert.assertAll();
    }
}
