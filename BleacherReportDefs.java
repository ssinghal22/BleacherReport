package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;
import static org.assertj.core.api.Assertions.assertThat;


public class BleacherReportDefs {
    @Given("^I open BR home page$")
    public void iOpenBRHomePage() throws InterruptedException {
        getDriver().get("https://bleacherreport.com/");
        Thread.sleep(3000);
    }

    @Then("^header displays$")
    public void headerDisplays() {
        boolean header = getDriver().findElement(By.xpath("//header")).isDisplayed();
        assertThat(header).isTrue();
    }

    @And("^a big image displays$")
    public void aBigImageDisplays() {
        boolean centerImage = getDriver().findElement(By.xpath("//img[@itemprop='contentUrl'][@width = '970'][@height = '500']")).isDisplayed();
        assertThat(centerImage).isTrue();
    }

    @And("^a video plays in background$")
    public void aVideoPlaysInBackground() {
        boolean video = getDriver().findElement(By.xpath("//div[@id='Button_ButtonModule_28_650159634']")).isDisplayed();
        assertThat(video).isTrue();
    }

    @Then("^I click close button on video$")
    public void iClickCloseButtonOnVideo() {
        getDriver().findElement(By.xpath("//div[@id='Button_ButtonModule_42_697453435']")).click();
    }

    @And("^My Teams displays$")
    public void myTeamsDisplays() {
        boolean myTeams = getDriver().findElement(By.xpath("//h1[text() = 'My Teams']")).isDisplayed();
        assertThat(myTeams).isTrue();
    }

    @And("^Edit Teams displays$")
    public void editTeamsDisplays() {
        boolean editTeams = getDriver().findElement(By.xpath("//div/a[text() = 'Edit Teams']")).isDisplayed();
        assertThat(editTeams).isTrue();
    }

    @And("^Headlines displays$")
    public void headlinesDisplays() {
        boolean headlines = getDriver().findElement(By.xpath("//h1[text()= 'headlines']")).isDisplayed();
        assertThat(headlines).isTrue();
    }

    @And("^Trending displays$")
    public void trendingDisplays() {
        boolean trending = getDriver().findElement(By.xpath("//h1[text() = 'Trending']")).isDisplayed();
        assertThat(trending).isTrue();
    }

    @And("^Exclusive displays$")
    public void exclusiveDisplays() {
        boolean exclusive = getDriver().findElement(By.xpath("//h1[text() = 'Exclusive']")).isDisplayed();
        assertThat(exclusive).isTrue();
    }

    @And("^Social icons display in footer$")
    public void socialIconsDisplayInFooter() {
        boolean social = getDriver().findElement(By.xpath("//div/ul[@class = 'social']")).isDisplayed();
        assertThat(social).isTrue();
    }

    @And("^Links display in footer$")
    public void linksDisplayInFooter() {
        boolean links = getDriver().findElement(By.xpath("//div/ul[@class='links']")).isDisplayed();
        assertThat(links).isTrue();
    }
}
