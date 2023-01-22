package tests.Contacts;

import org.testng.annotations.Test;
import tests.BaseTest;

public class ContactsTests extends BaseTest{
    @Test
    public void CandidateCanSeeJobsDetailsTest() {
        contactsSteps.createContactSteps.createContactSteps();
    }
}
