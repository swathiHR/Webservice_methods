import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class test_patch {
	@Test
	void test_patch_01() {
		JSONObject jobj =  new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job", "zion resident");
		
		given().header("Content-Type","application/jason").contentType(ContentType.JSON).accept(ContentType.JSON).body(jobj.toJSONString())
		.when().patch("https://reqres.in/api/users/2").then().statusCode(200).log().all();
	}
	

}