import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class test_post2 {
	
	@Test
	public void post_test() {
		baseURI = "http://localhost:3000/" ;
		
		JSONObject request = new JSONObject();
		request.put("firstName", "TOM");
		request.put("lastName", "Cooper");
		request.put("subjectID", 2);
		//request.put("ID", 4);
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).
			log().all();
			
			
	}

}
