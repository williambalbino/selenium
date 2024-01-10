package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.GitHubPage;

class GithubWDMPageTest extends BaseTest{

    @Test
    public void getTitleTest() {
        GitHubPage page = new GitHubPage();
        Assert.assertEquals("DEMOQA", BaseTest.driver.getTitle());
    }
}
