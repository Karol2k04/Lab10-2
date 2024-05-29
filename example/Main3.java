package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest httpRequest = null;
        try {
            httpRequest = HttpRequest.newBuilder(new URI("https://official-joke-api.appspot.com/random_joke"))
                    .GET().build();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        HttpResponse<String> httpResponse = httpClient.send(httpRequest,
                HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.statusCode());

        Gson gson = new GsonBuilder().create();
        Joke joke = gson.fromJson(httpResponse.body(), Joke.class);
        System.out.println(joke);
    }
}

