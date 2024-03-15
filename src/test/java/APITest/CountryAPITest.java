package APITest;

import APITest.POJOClasses.Country;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItem;

public class CountryAPITest {
    Cookies cookies;

    @Test
    void loginTest() {
        Map<String, Object> credentials = new HashMap<>();
        credentials.put("username", "turkeyts");
        credentials.put("password", "TechnoStudy123");
        credentials.put("rememberMe", true);

        cookies = given()
                .body(credentials)
                .contentType(ContentType.JSON)
                .when()
                .post("https://test.mersys.io/auth/login")
                .then()
                //.log().body()
                .statusCode(200)
                .extract().response().getDetailedCookies(); // Extract the access tokes as a cookie so we can use it in other tests as authorization
    }

    @Test(dependsOnMethods = "loginTest")
    void getListOfCountries() {
        given()
                .body("{}")
                .contentType(ContentType.JSON)
                .cookies(cookies)
                .when()
                .post("https://test.mersys.io/school-service/api/countries/search")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("name",hasItem("Batch 10"));
    }

    @Test
    void createCountry(){
        Country country = new Country();
        country.setId(null);
        country.setName("Batch 10");
        country.setCode("BT10");
        country.setTranslateName(new ArrayList<>());
        country.setHasState(false);

//        given()
//                .body(country)






    }
}
