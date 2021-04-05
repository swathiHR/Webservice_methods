
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class test_patch2 {
	@Test
	public void test_patch3() {
		baseURI = "http://localhost:3000/";
		
		JSONObject request = new JSONObject();
		request.put("lastName", "change");
		
		given().
			contentType(ContentType.JSON).accept(ContentType.JSON).
			header("Content-Type","application/json").body(request.toJSONString()).
		when().
			patch("/users/4").
		then().
			statusCode(200).log().all();
		
		
	}

}
