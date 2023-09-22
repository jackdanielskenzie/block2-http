package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyHttpClient {
    /// Methods for HTTP Request
    public String makeGETRequest(String url) {
        // New Client
        HttpClient httpClient = HttpClient.newHttpClient();
        // Create URI
        URI uri = URI.create(url);
        // Create HttpRequest
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();
        try {
            // try to send
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            if (statusCode == 200) {
                return httpResponse.body();
            } else {
                return "GET request failed! status code received: " + statusCode;
            }
        } catch (IOException | InterruptedException e) {
            return e.getMessage();
        }
    }

    public String makePUTRequest(String url, String requestBody) {
        // New Client
        HttpClient httpClient = HttpClient.newHttpClient();
        // Create URI
        URI uri = URI.create(url);
        // Create HttpRequest
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        try {
            // try to send
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            if (statusCode == 201 || statusCode == 202) {
                return httpResponse.body();
            } else {
                return "PUT request failed! status code received: " + statusCode;
            }
        } catch (IOException | InterruptedException e) {
            return e.getMessage();
        }
    }
}
