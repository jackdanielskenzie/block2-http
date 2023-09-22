package org.example;


public class Main {
    public static void main(String[] args) {
        MyHttpClient myHttpClient = new MyHttpClient();
        String getUrl = "https://reqres.in/api/users";
        String putUrl = "https://reqbin.com/echo/put/json";
        String testPutJson = "{ \"key\" : \"message to send\" }";

        String myResponse = myHttpClient.makePUTRequest(putUrl, testPutJson);
        System.out.println(myResponse);
    }

    /*
    Protocol
    SMS:
    1. The ability to send text and emoji
    2. Maximum length of 160 characters
    3. If sending more than 160 characters, the message splits into multiple messages/MMS
    4. The message must be sent by a phone number and received by a phone number

    HTTP: HyperText Transfer Protocol
    HTTPS: HyperText Transfer Protocol Secure
    https://

    Client - Presentation and User Interaction
    Server -

    HTTP Requests
    Headers - Metadata/Information about the request (Key/Value Pairs) (Instructions)
        Auth Token - Encrypted string which contains data about:
            SSH Key/IP Range
            Authentication - You are who you say you are
            Authorization - You are allowed access to certain resources
    Body - The actual data to transfer (Content)

    HTTP Methods (Request "Verbs")
    GET - Retrieve data. Does not have a body! Only has request params/headers.
    #######
    POST - Take some data and make something new with it. CAN have a body, but not required.
    PUT - Take some data and replace something that exists at the requested path. CAN have a body, but not required.
    PATCH - Take some data and UPDATE something that exists. CAN have body, but is not required.
    DELETE - Delete data at the requested path. CAN have a body, but is not required.

    URL - Uniform Resource Locator
    %32a%29%12%22b // URL Parameters
    https://mysite.com/api/things?type=music

    API - Application Programming Interface (Middle-End)
    Endpoint - Specific URL within an API to access data
    (Call the endpoint, Send request to the endpoint, hit the endpoint, access the endpoint)

    https://google.com/search
    https://google.com/calendar
    /drive
    /maps
    /photos

    REST - Representational State Transfer (CRUD API/RESTful API/ REST API)
    Set of rules for creating and sending requests
    Create, Read, Update, or Delete - CRUD
    https://reqbin.com/echo/post/json
    Resource - anything that lives on the internet. Documents, HTML, Information/Data, Images, Sounds

    RESTful
    1. Unique Identifier like ID number/Keys/URI (Uniform Resource Identifier) to specify resources
    2. GET, POST, PUT standardized access patterns
    3. API documentation must be available PUBLICLY
    4. Resources must be represented in a standard messaging format (JSON/XML/HTML)!

   HTTP Response Codes
   # Happy Path
   200 - OK : Successful request, usually for GET/POST where no data is changed
   201 - Created: Successful request and new resource created with your sent data
   202 - Accepted: Successful request but server still must process data

   # Not-So Happy Path (Your Bad!) (Client Failure)
   400 - Bad Request: Request failed and the information wasn't what was expected
   403 - Forbidden: Request failed. You don't have access to this resource

   # (My Bad!) (Server Failure)
   500 - Internal Server Error: HTTP Request failed, but because the server code closed unexpectedly.

    ICMP (Ping)
    FTP (File Transfer Protocol)
    SSH (Secure Shell)

    Query Params
    https://www.google.com/search?q=mr%20bubz&safe=active
    {
        "q": "mr bubz",
        "safe": "active"
    }
     */

}