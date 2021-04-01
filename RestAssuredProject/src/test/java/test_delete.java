import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class test_delete {
	@Test
	void test_del_01() {
		given().delete("https://reqres.in/api/users/2").then().statusCode(204);
	}

}
