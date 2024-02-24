package com.api.LearnCucumberNew.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetStores {
	
	Response response;
	
	@Given("the api is available")
	public void the_api_is_available() {
	   baseURI="http://localhost:3030";
	}

	@When("endpoint {string} is invoked")
	public void endpoint_is_invoked(String endpoint) {
	   response = when().get(endpoint);
	}

	@Then("the response should come with a status code of {int}")
	public void the_response_should_come_with_a_status_code_of(Integer statusCode) {
	 response.then().statusCode(statusCode);
	}
	
	@When("endpoint {string} is invoked with {int}")
	public void endpoint_is_invoked_with(String endpoint, Integer int1) {
		response = when().get(endpoint+String.valueOf(int1));
	}

}
