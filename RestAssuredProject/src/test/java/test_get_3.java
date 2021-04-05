import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class test_get_3 {
	
	@Test
	public void test_get() {
		baseURI = "http://localhost:3000/" ;
		
		given().
			param("Name", "Automation").
		when().
			get("/subject").
		then().
			statusCode(200).
		log().all();
		
	}

}
