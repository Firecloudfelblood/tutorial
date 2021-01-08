package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String user, String password) {
        System.out.println("The user is: " + user + " and the password: " + password);
    }

    @And("I click login button")
    public void iClickLoginButton() {
    }

    @Then("I should see the user form page")
    public void iShouldSeeTheUserFormPage() {
    }

    @And("I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) {
        List<List<String>> data = table.cells();
        List<User> users = new ArrayList<User>();
            for (int i = 1; i < data.size(); i++) {
                User user = new User(data.get(i).get(0).toString(), data.get(i).get(1).toString());
                users.add(user);
            }

//        }
//
        for (User user: users) {
            System.out.println("The UserName is: "+user.username);
            System.out.println("The Password is: "+user.password);
        }
//        assertEquals (1, users.size());
        assertTrue(users.size() > 2);
    }

    @AllArgsConstructor
    public class User{
        public String username;
        public String password;
    }
}
