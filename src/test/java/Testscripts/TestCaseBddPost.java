package Testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class TestCaseBddPost {

	public static HashMap map =new HashMap();
	
	@BeforeClass()
	public void postGoogleApi()
	{
		map.put(key, value);
		map.put(key, value);
		map.put(key, value);
		map.put(key, value);
		map.put(key, value);
		map.put(key, value);
		map;.put(key, value);
		
	     RestAssured.baseURI="https://rahulshettyacademy.com/";
	     RestAssured.basePath="maps/api/place/add/json?key= qaclick123";
		
	}
	 
	@Test(priority=1,enabled=false)
	public void postGoogleApi() 
	{
		
		given()
		.contentType("application/json")
		.body("map")
		.when()
		.post()
		.then()
		.statusCode(200)
		.body(arguments, responseAwareMatcher)
		.log.all();
	
		
	} 
	
}




	/*@Test(priority=2,enabled=false)
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
	
	
	
	@Test(priority=3,enabled=true)
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
	
	
	
	
	@Test(priority=4,enabled=true)
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
	
	
	
	
}*/
