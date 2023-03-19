package Library;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;


import java.util.Random;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;


@Test
public class DynamicClass {
public int generateRandomNum(int min, int max){
    {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}

    public void AddBook(){

    String isbn1 = "abbc"+ generateRandomNum(1,100);
    String aislenew= "x123"+ generateRandomNum(1,1000);

        RestAssured.baseURI="http://216.10.245.166";
       String lib= given().log().all().header("Content-Type", "application/json")
               .body(payload.AddBook(isbn1,aislenew))
               .when().post("Library/Addbook.php")
               .then().assertThat().statusCode(200).extract().response().asString();

        JsonPath js = ReUseableMethods.rawToJson(lib);
        String id=js.get("ID");
        System.out.println(id);

    }

    @Test
    public void NewReq(){
    RestAssured.baseURI="http://localhost/gunisha/Test";
//    String test= given().log().all().header("Content-Type","text/plain").header("User-Agent","test").header("accept","text/plain")
//            .relaxedHTTPSValidation().body(payload.NewReq()).
//            when().post().then().assertThat().statusCode(200).extract().response().asString();


        String test1= given().log().all().header("Content-Type","text/plain").header("User-Agent","test").header("accept","text/plain")
                .relaxedHTTPSValidation().
                when().get().then().assertThat().statusCode(200).extract().response().asString();


    }

}
