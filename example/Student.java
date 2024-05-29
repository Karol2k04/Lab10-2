package org.example;


import java.util.List;

public class Student {

    private String name;

    private List<Course> courses;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public double calculateAverageGrade() {
        return courses.stream().mapToDouble(Course::getGrade).average().orElse(0.0);
    }
}


