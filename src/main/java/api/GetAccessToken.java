package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetAccessToken {
    Response response;

    public GetAccessToken() {
        response = given()
                .contentType("application/json")
                .body("{\"refreshtoken\":\"5KzK8mvH9zKQoWMZ4IiQjAykz4rLaiveVeMCrpM9f8y8vSc01witJfcHvfiwqILk\"}")
                .post("https://api.chartmetric.com/api/token");
    }

    public String accessToken() {
        String accessToken = response.path("token");
        return accessToken;
    }
}
