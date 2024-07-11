package main.java.weblocators;

public interface LoginPage {
    final String userName = "";
    final String password = "";
    final String loginBtn = "";

    public void login(String name,String password){
        driver.findElement(LoginPage.userName).sendKeys(name);
        driver.findElement(LoginPage.password).sendKeys(password);
        driver.findElement(LoginPage.loginBtn).click();
    }
}
