package advance.ATAssessment;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class intro {
	@Test

	public void postSwagger() {

<<<<<<< HEAD
		//redacted
=======
		JSONArray petArray = new JSONArray();

		JSONArray visitArray = new JSONArray();

		RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/owners";

		Map<String, Object> emptyOwner = new HashMap<>();

		Map<String, Object> emptyPet = new HashMap<>();

		Map<String, Object> nestedVisitAsMap = new HashMap<>();

		nestedVisitAsMap.put("date", "yyyy/MM/dd");
		nestedVisitAsMap.put("description", "string");
		nestedVisitAsMap.put("id", 0);
		nestedVisitAsMap.put("pet", emptyPet);

		visitArray.add(nestedVisitAsMap);

		Map<String, Object> nestedPetAsMap = new HashMap<>();

		Map<String, Object> nestedTypeAsMap = new HashMap<>();

		nestedTypeAsMap.put("id", 0);

		nestedTypeAsMap.put("name", "String");

		nestedPetAsMap.put("birthDate", "2018-07-27T09:02:40.767Z");
		nestedPetAsMap.put("id", 0);
		nestedPetAsMap.put("name", "String");
		nestedPetAsMap.put("owner", emptyOwner);
		nestedPetAsMap.put("type", nestedTypeAsMap);
		nestedPetAsMap.put("visits", visitArray);

		petArray.add(nestedPetAsMap);

		JSONObject requestParams = new JSONObject();

		requestParams.put("address", "Manchester");
		requestParams.put("city", "This is a test");
		requestParams.put("firstName", "ANTHIA");
		requestParams.put("id", 10);
		requestParams.put("lastName", "String");
		requestParams.put("pets", petArray);
		requestParams.put("telephone", "1234567891");

		given().contentType(ContentType.JSON).body(requestParams).when().post("/").then().statusCode(201);

		System.out.println(requestParams.toString());
>>>>>>> f4c84f4bdd2e51a1b3be29a32c910f9c7f60fce6

	}
}
