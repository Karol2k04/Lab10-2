package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        List<Student> students = ReadStudents("Students.json");
        Student highestAverageStudent=null;
        double highestAverage=0.0;
        for (Student student : students) {
            double averageGrade = student.calculateAverageGrade();
            System.out.println(student.getName() + "(" + student.getCourses() + ") Average grade=" + averageGrade);
            if (averageGrade > highestAverage) {
                highestAverage = averageGrade;
                highestAverageStudent = student;
            }
        }
        if(highestAverageStudent!=null){
            System.out.println("highest average="+highestAverageStudent.getName()+highestAverage);
        }
        }



    private static List<Student> ReadStudents(String ResourceName) {
        try (Reader reader = new InputStreamReader(Main.class.getClassLoader().getResourceAsStream("Students.json"), "UTF-8")) {

            Gson gson = new Gson();
            Type studentListType = new TypeToken<List<Student>>() {
            }.getType();
            return gson.fromJson(reader, studentListType);
        } catch (Exception e) {
            System.err.println("Error reading from resource file");
            return null;
        }
    }
}