package Library;

public class payload {
public static String AddBook(String isbn, String aisle){
    return "{\n" +
            "\n" +
            "\"name\":\"SV\",\n" +
            "\"isbn\":\""+isbn+"\",\n" +
            "\"aisle\":\""+aisle+"\",\n" +
            "\"author\":\"Gunisha\"\n" +
            "}\n";
}
public static String NewReq(){
    return "{\n" +
            "    \"accounting\": [\n" +
            "        {\n" +
            "            \"firstName\": \"John\",\n" +
            "            \"lastName\": \"Doe\",\n" +
            "            \"age\": 23\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\": \"Mary\",\n" +
            "            \"lastName\": \"Smith\",\n" +
            "            \"age\": 32\n" +
            "        }\n" +
            "    ],\n" +
            "    \"sales\": [\n" +
            "        {\n" +
            "            \"firstName\": \"Sally\",\n" +
            "            \"lastName\": \"Green\",\n" +
            "            \"age\": 27\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\": \"Jim\",\n" +
            "            \"lastName\": \"Galley\",\n" +
            "            \"age\": 41\n" +
            "        }\n" +
            "    ]\n" +
            "}";
}
}
