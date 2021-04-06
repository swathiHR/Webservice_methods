import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class test_del {
	@Test
	public void del_test() {
		baseURI = "http://localhost:3000/";
		
		when().
			delete("/users/4").
		then().
			statusCode(200).log().all();
		
	}

}
