package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="NewTours",glue= {"newToursApplicationLogInTest"})


public class NewToursTesting {

}
