package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

        public static void main(String[] args) {
            // Create cast members for the first movie
            List<CastMember> cast1 = new ArrayList<>();
            cast1.add(new CastMember("Dicaprio", "Darth Vader"));
            cast1.add(new CastMember("Bradd Pitt", "Harry Potter"));

            // Create the first movie
            Movie movie1 = new Movie("Django", "Tarantino", 120, cast1);

            // Create cast members for the second movie
            List<CastMember> cast2 = new ArrayList<>();
            cast2.add(new CastMember("Emma Watson", "Emma Dark"));
            cast2.add(new CastMember("Zendaya", "Iga Swiatek"));

            // Create the second movie
            Movie movie2 = new Movie("Tennis", "Spielberg", 150, cast2);

            // Create a list of movies
            List<Movie> movies = new ArrayList<>();
            movies.add(movie1);
            movies.add(movie2);

            // Convert the list of movies into JSON with pretty printing
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(movies);

            // Print out the result of the serialization
            System.out.println(json);
        }
    }
