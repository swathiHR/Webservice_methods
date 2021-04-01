import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class test_put {
	
	@Test
	void test_put1() {
		JSONObject request = new JSONObject();
		request.put("name", "morpheus");
		request.put("job", "zion resident");
		
		given().header("Content-Type","application/jason").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200);
	}

}
