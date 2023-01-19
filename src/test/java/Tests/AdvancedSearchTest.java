package Tests;

import Pages.CatalogSearchAdvancedPage;
import Pages.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSearchTest {

    private WebDriver driver = new ChromeDriver();

    @Before
    public void Driver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void AdvancedSearch() {
        HomePage homePage = new HomePage(driver);
        CatalogSearchAdvancedPage searchAdvancedPage = new CatalogSearchAdvancedPage(driver);

        homePage.clickAdvancedSearch();
        searchAdvancedPage.setTheNameProduct("ROCHIE OFFICE BELLA DONNA");
        searchAdvancedPage.setTheDescriptionProduct("Rochie office din jerse cu guler si" +
                " mansete. Are guler ascutit, maneci lungi, croi tip A si buzunare functionale. Compozitie:" +
                " 85% Poliester, 5% Viscoza, 10% Elastan Instructiuni de intretinere: Curatare-uscata " +
                "Nu uscati automat Temp max-120grade Albirea interzisa Spalare automata-30g " +
                "*Va rugam verificati eticheta produsului inainte de curatare! *Va rugam sa " +
                "retineti ca o usoara discrepanta de culoare ar trebui sa fie acceptabila datorita " +
                "luminii si luminozitatii ecranului. Created by: Florina H");
        searchAdvancedPage.setThePriceProduct("50");
        searchAdvancedPage.setThePriceTo("300");
        searchAdvancedPage.setTheProductColor();
        searchAdvancedPage.setTheProductSize();
        searchAdvancedPage.setTheProductGender();
        searchAdvancedPage.clickSearchButton();









    }

//    @After
//    public void closeDriver(){
//        driver.close();
//    }
}