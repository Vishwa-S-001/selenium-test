package main.java.weblocators.AgentPortal;

public interface PriorityPage {
    final String name = "";
    final String desc = "";
    final String helpText = "";
    final String addPriorityBtn = "";


    /**
     * We can integrate API calls to make sure CRUD operations are successfull
     * Not just validating in UI alone
     * Eg: /priorities/get/{priority_id} -> return "Priority Does not exist in the system."
     */
    public void deletePriority(String priority){
        /**
         * Logic to delete the priority.
         * Design a locator where we can get the particular row num of priority
         * Click on the priority -> Wait for side pane to be opened
         * Now click on delet button -> Confirm delete pop up  -> Click delete.
         */
    }

    public void addPriority(String name,String desc,String helpText){
        driver.findElement(SideNavigation.priorities).click();
        driver.findElement(PriorityPage.name).sendKeys(name);
        driver.findElement(PriorityPage.desc).sendKeys(desc);
        driver.findElement(PriorityPage.helpText).sendKeys(helpText);
        driver.findElement(PriorityPage.addPriorityBtn).click();
    }
}
