package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.Hooks;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage {
    protected WebDriver driver= Hooks.driver;
    protected By logOutButton = By.linkText("Log out");
    protected By searchItem = By.id("small-searchterms");
    protected By searchButton = By.xpath("//button[@type=\"submit\"]");
    protected By customerCurrency = By.id("customerCurrency");
    protected By addBuildComputerToWishList = By.xpath("//*[text()=\"Add to wishlist\"]");
    protected By addBuildComputerToCompareListbtn =By.xpath("//a[text()=\"Build your own computer\"]//../..//*[text()=\"Add to compare list\"]");
    protected By addAppleMacBookToCompareListbtn =By.xpath("//a[text()=\"Apple MacBook Pro 13-inch\"]//../..//*[text()=\"Add to compare list\"]");
    protected By addHtcOneToCompareListbtn =By.xpath("//a[text()=\"HTC One M8 Android L 5.0 Lollipop\"]//../..//*[text()=\"Add to compare list\"]");


    public HomePage(WebDriver driver) {
        this.driver = Hooks.driver;
    }

    public LoginPage clickLogInLink() {

        if(Hooks.isLogin == false) {
            clickLink("Log out");
            clickLink("Log in");
        }else{
        clickLink("Log in");
        }
        return new LoginPage(driver);
    }
    public ShoppingCartPage clickShopingCart(){
        clickLink("Shopping cart");
        return new ShoppingCartPage(Hooks.driver);
    }

    public AppleMackBookPage clickAppleMacBookItem (){
        clickLink("Apple MacBook Pro 13-inch");
        return new AppleMackBookPage(Hooks.driver);
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
    public WebElement searchField ()
    {
        WebElement searchField= Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
        return searchField;
    }
    public WebElement searchButton ()
    {
        WebElement searchButton= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
        return searchButton;
    }
    public Select switchCurrencies()
    {
        WebElement switchCurrencies= Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
        Select Currencies = new Select(switchCurrencies);
        return Currencies;
    }
    public List<WebElement> productPrices ()
    {
        List <WebElement> productPrices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return productPrices;
    }
    public List<WebElement> categories ()
    {
        List <WebElement> categories = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]/li/a"));
        return categories;
    }
    public List<WebElement> categoriesHaveSub ()
    {
        List <WebElement> categoriesHaveSub = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]//li //a //following-sibling::div //preceding-sibling::a"));
        return categoriesHaveSub;
    }
    public List<WebElement> allSubCategories ()
    {
        List <WebElement> allSubCategories = Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]//li//ul//li//a"));
        return allSubCategories;
    }
    public WebElement apparelCategory ()
    {
        WebElement apparelCategory= Hooks.driver.findElement(By.xpath("(//div[@class=\"header-menu\"] //child::ul[@class=\"top-menu notmobile\"]//li //a //following-sibling::div //preceding-sibling::a)[3]"));
        return apparelCategory;
    }
    public WebElement shoesSubCategory ()
    {
        WebElement shoesSubCategory= Hooks.driver.findElement(By.xpath("((//div[@class=\"header-menu\"] //child::ul[@class=\"top-menu notmobile\"]//li //a //following-sibling::div //preceding-sibling::a) [3] //following-sibling::ul //child::li) [1]//a"));
        return shoesSubCategory;
    }
    public WebElement login ()
    {
        WebElement login= Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
        return login;
    }
    

}
