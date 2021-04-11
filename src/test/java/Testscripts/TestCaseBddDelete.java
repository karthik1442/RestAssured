package Testscripts;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class TestCaseBddDelete {
	
	
	@Test(priority=0,enabled=true)
	public void deleteGoogleApi() 
	{
		
		given()
		
		.when()
		.get("https://rahulshettyacademy.com/maps/api/place/delete/json?key=qaclick123")
		.then()
		.statusCode(200)
		.assertThat().body("place_id", equalTo("017ccf2e09f3fda60269580e03d8b430\""))
		.header("Content-Type", "application/json;charset=UTF-8")
		.header("content-Length", "134")
		.log().all();
	}
	
	

}
