package api;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SearchEngine {
    Response response;

    public SearchEngine(String song) {
        RestAssured.baseURI = ("https://api.chartmetric.com/");
        RestAssured.basePath = ("api/search");

        GetAccessToken accessToken = new GetAccessToken();

        response = given()
                .log().uri()
                .auth()
                .oauth2(accessToken.accessToken())
                .when()
                .queryParam("type", "tracks")
                .queryParam("q", song)
                .get();
    }

    public String response() {
        String responseBody = response.asPrettyString();
        return responseBody;
    }
}
