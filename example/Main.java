package org.example;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

import com.google.gson.stream.JsonReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
      JsonReader jsonReader=new JsonReader(new FileReader("src/main/resources/person.json"));

        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        Person person =gson.fromJson(jsonReader, Person.class);
        System.out.println(person);
        //serialization task 2
        Person person2=new Person("john doe",35);
        String personJson= gson.toJson(person2);
        System.out.println(personJson);
        //task3
        HttpClient httpClient=HttpClient.newBuilder().build();
        HttpRequest httpRequest= HttpRequest.newBuilder(new URI("https://official-joke-api.appspot.com/random_joke"))
        .GET().build();
        HttpResponse<String> httpResponse=httpClient.send(httpRequest,
                HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
        System.out.println("hello");
   }
}