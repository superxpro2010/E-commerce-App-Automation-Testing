package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage {
    private WebDriver driver;
    private By logOutButton = By.linkText("Log out");
    private By searchItem = By.id("small-searchterms");
    private By searchButton = By.xpath("//button[@type=\"submit\"]");
    private By customerCurrency = By.id("customerCurrency");
    private By addBuildComputerToWishList = By.xpath("//*[text()=\"Add to wishlist\"]");
    private By addBuildComputerToCompareListbtn =By.xpath("//a[text()=\"Build your own computer\"]//../..//*[text()=\"Add to compare list\"]");
    private By addAppleMacBookToCompareListbtn =By.xpath("//a[text()=\"Apple MacBook Pro 13-inch\"]//../..//*[text()=\"Add to compare list\"]");
    private By addHtcOneToCompareListbtn =By.xpath("//a[text()=\"HTC One M8 Android L 5.0 Lollipop\"]//../..//*[text()=\"Add to compare list\"]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage clickLogInLink() {
        clickLink("Log in");
        return new LoginPage(driver);
    }
    public ShoppingCartPage clickShopingCart(){
        clickLink("Shopping cart");
        return new ShoppingCartPage(driver);
    }

    public AppleMackBookPage clickAppleMacBookItem (){
        clickLink("Apple MacBook Pro 13-inch");
        return new AppleMackBookPage(driver);
    }

    public BuildYourOwnComputerPage clickBuildYourOwnComputerItem (){
        clickLink("Build your own computer");
        return new BuildYourOwnComputerPage(driver);
    }
    public HtcOnePage clickHtcOneItem (){
        clickLink("HTC One M8 Android L 5.0 Lollipop");
        return new HtcOnePage(driver);
    }

    public void hoverOverComputerCategory() {
        hoverOverCategory("Computers");
    }

    public void hoverOverApparelCategory() {
        hoverOverCategory("Apparel");
    }


    public NotebooksSubcategoryPage clickNotebooksSubCategory() {
        clickLink("Notebooks");
        return new NotebooksSubcategoryPage(driver);
    }

    public ShoesSubcategoryPage clickShoesSubcategory() {
        clickLink("Shoes");
        return new ShoesSubcategoryPage(driver);
    }

    public void selectCustomerCurrency(String text) {
        findDropDownElement().selectByVisibleText(text);
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(customerCurrency));
    }

    public List<String> getSelectedCurrency() {
        List<WebElement> selectedElements =
                findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
        //return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void enterSearchItem(String value) {
        driver.findElement(searchItem).sendKeys(value);
    }

    public SearchResultPage clickSearchButton() {
        driver.findElement(searchButton).click();
        return new SearchResultPage(driver);
    }

    public RegistrationPage clickRegisterLink() {
        clickLink("Register");
        return new RegistrationPage(driver);
    }

    public void clickLogoutButton() {
        driver.findElement(logOutButton).click();
    }

    public Boolean checkLogoutIsDisplayed() {
        boolean result = driver.findElement(logOutButton).isDisplayed();
        return result;
    }

//    public WishListPage clickWishListLink() {
//        clickLink("Wishlist");
//        return new WishListPage(driver);
//    }
    public void clickBuilOwnComputerComparelist(){
        driver.findElement(addBuildComputerToCompareListbtn).click();
    }
    public void clickAppleMacbookComparelist(){
        driver.findElement(addAppleMacBookToCompareListbtn).click();
    }
    public void clickHtcOneComparelist(){
        driver.findElement(addHtcOneToCompareListbtn).click();
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    private void hoverOverCategory(String linkText) {
        WebElement category = driver.findElement(By.linkText(linkText));

        Actions categoryList = new Actions(driver);
        categoryList.moveToElement(category).perform();
    }

}
