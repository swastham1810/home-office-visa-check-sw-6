package gov.uk.check.visa.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

public class DropDownVerificationSteps {

    @Then("User can see following country into dropdown")
    public void userCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> list : userList) {
            //will print all the data
            System.out.println(list.get(0));
        }
    }
}
