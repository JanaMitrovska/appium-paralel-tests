package tests.Contacts;

import org.testng.annotations.Test;
import tests.BaseTest;

public class ContactsTests extends BaseTest{
    @Test
    public void createContactTest() {
        steps.createContactSteps.createContactSteps();
    }

    @Test
    public void searchContact(){
        steps.createContactSteps.searchForContactSteps();
    }

    @Test void EditContact(){
        steps.createContactSteps.editContactSteps();
    }

    @Test
    public void deleteContact(){
        steps.createContactSteps.deleteContactSteps();
    }
}
