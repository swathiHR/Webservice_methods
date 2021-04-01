import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_get_2 {
	@Test
	void get_test2() {
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200).
		body("data.id[0]", equalTo(7));
		
	}
	
	@Test
	void test_log() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
	}
	
	@Test
	void test_validation() {
		given().get("https://reqres.in/api/users?page=2").
		then().statusCode(200).body("data.id[1]", equalTo(8)).body("data.first_name", hasItems("Michael","Lindsay"));
	}

}
