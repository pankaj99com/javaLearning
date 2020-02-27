package test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Apptest {
	
	
@Given("^I am a manual tester$")

public void I_am_a_manual_tester(){
	System.out.println("@Given--I_am_a_manual_tester");
	
}

@And("^I prepared for exams$")
public void I_prepared_for_exams(){
	System.out.println("@And-I_prepared_for_exams");
}

@When("^I apply for job$")

public void I_apply_for_job(){
	System.out.println("@When--I_apply _for _job");
	
}

@And("^I am not satisfied with the job$")
public void I_am_not_satisfied_with_the_job(){
	System.out.println("@And--I am not satisfied with the job");
	
}

}
