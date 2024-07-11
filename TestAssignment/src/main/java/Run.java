package main.java;
import main.java.pages.AgentPortal.PriorityPage;
import main.java.pages.AgentPortal.StatusesPage;
import main.java.pages.agentportal.SideNavigation;
import main.java.pages.supportcenter.CreateTicketPage;
import pages.agentPortal.LoginPage;

public class Run {
    /**
     * Note: As I was not able to login to agent portal, couldn't get web locators for those DOM's
     * Have good experience in web locators, eg:. parent-sibling-ancestor, CSS , XPath, concepts
     * @param args
     */
    public static void main(String[] args) {
        WebDriver driver = DriverInstance.getDriverInstance("Firefox");

        // Login to Agent portal
        // These URl's can be saved in respective pages or in separate .properties files & read fromm there
        driver.get("https://interview.supporthive.com/staff/"); 
        LoginPage.login("Admin","Admin@123");

        // Add Status
        StatusesPage.addStatus("Status","Desc","Color");

        /**
         * Avoid using implicit waits.
         * Need to use explicit conditions like.. After clicking save
         * If spinner appears / snackbar appears. Then we can wait until spinner disappears / snackbar appears.
         */

          // Add Priority
          PriorityPage.addPriority("Priority 1","Desc","Help Text");

        /**
         * Avoid using implicit waits.
         * Need to use explicit conditions like.. After clicking save
         * If spinner appears / snackbar appears. Then we can wait untilt spinner disappears / snackbar appears.
         */

         driver.findElements(makeDefault).click();

         // Scenario - 2 Navigate to support center
         driver.findElement(CreateTicketPage.subject).sendKeys('Sample Subject');
         driver.findElement(CreateTicketPage.message).sendKeys('Sample message');
         driver.findElement(CreateTicketPage.createTicketBtn).click();

         // Navigate to Agent portal & check the ticket status
         driver.get("https://interview.supporthive.com/staff/login");
         LoginPage.login("Admin","Admin@123");

         // Assumption made that user has located the recently created ticket.
         // Make assertion if the ticket is default or not
         if(driver.findElements("locator to get list of tickets listed").get(nth).getText().equals("Default")){
            System.out.println("Ticket is correctly categorized as Default...");
         }else{
            System.out.println("Ticket is NOT correctly categorized as Default...");
         }

         // Delete the created priorities & status
         StatusesPage.deleteStatus("Status 1");
         PriorityPage.deletePriority("Priority 1");

         // Now click on logout button & make sure respective API calls are returning 200 OK as response
         driver.quit();
    }
}
