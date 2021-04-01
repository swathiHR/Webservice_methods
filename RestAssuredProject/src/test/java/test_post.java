
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class test_post {
	
	@Test
	void test_post_1() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Swathi");
		map.put("job", "Training");
		
		JSONObject request = new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		
	}
	
	@Test
	void test_post2() {
		JSONObject request=new JSONObject();
		request.put("name", "API_test");
		request.put("job", "Learning");
		
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);
	}

}
