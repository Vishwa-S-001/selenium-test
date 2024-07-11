package main.java.weblocators.AgentPortal;

public interface StatusesPage {

    //List of available status (Status Listing).
    final String statusName = "";

    // Add Status Side pane.
    final String name = "";
    final String color = "";
    final String behavior = "";
    final String desc = "";

    /**
     * We can integrate API calls to make sure CRUD operations are successfull
     * Not just validating in UI alone
     * Eg: /statuses/get/{status_id} -> return "Status Does not exist in the system."
     */

    public void deleteStatus(String status){
        /**
         * Logic to delete the status.
         * Design a locator where we can get the particular row num of status
         * Click on the priority -> Wait for side pane to be opened
         * Now click on delet button -> Confirm delete pop up  -> Click delete.
         */
    }

    public void addStatus(String name,String desc,String color){
        driver.findElement(SideNavigation.statuses).click();
        driver.findElement(StatusesPage.name).sendKeys(name);
        driver.findElement(StatusesPage.color).sendKeys(color);
        driver.findElement(StatusesPage.desc).sendKeys(desc);
        driver.findElement(StatusesPage.addStatusBtn).click();
    }
}
