package Testscripts;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class TestCaseBddGet {

	@Test(priority=0,enabled=true)
	public void GetGoogleApi() 
	{
		
		given()
		.when()
		.get("http://rahulshettyacademy.com/maps/api/place/get/json?place_id=95116df1bf20828458fc85492daa82d8&key=qaclick123")
		.then()
		.statusCode(200)
		.assertThat().body("name", equalTo("Frontline house"))
		.header("Content-Type", "application/json;charset=UTF-8")
		.log().all();
	
		
	}  
	@Test(priority=1,enabled=true)
	public void GetjsonApi() 
	{
		
		given()
		
		.when()
		.get("https://jsonplaceholder.typicode.com/posts/1")
		.then()
		.statusCode(200)
		.log().all();
	
		
	}  
	


}
