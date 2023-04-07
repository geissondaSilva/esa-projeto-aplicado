package br.com.geisson.esa;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExemploResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/esa-upa-exemplo")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }

}