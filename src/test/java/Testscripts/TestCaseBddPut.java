package Testscripts;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class TestCaseBddPut {

	
	@Test(priority=0,enabled=true)
	public void puttGoogleApi() 
	{
		
		given()
		
		.when()
		.put("http://rahulshettyacademy.com/maps/api/place/get/json?place_id=f77fd643589667c8bd162358f07abd89&key=qaclick123")
		.then()
		.statusCode(200)
		.assertThat().body("place_id", equalTo("017ccf2e09f3fda60269580e03d8b430\""))
		.header("Content-Type", "application/json;charset=UTF-8")
		.header("content-Length", "134")
		.log().all();
	}
	
	
	
	
}
