package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;

public class SampleStepDef{

@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {
	System.out.println("fsfdgfdg");
	Assert.assertTrue(true);
}
@Given("some other precondition")
public void some_other_precondition() {
	Assert.assertTrue(true);
}

}