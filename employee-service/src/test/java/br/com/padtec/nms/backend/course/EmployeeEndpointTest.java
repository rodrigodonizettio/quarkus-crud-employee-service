package br.com.padtec.nms.backend.course;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class EmployeeEndpointTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/employee")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}