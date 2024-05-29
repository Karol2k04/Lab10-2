package org.example;

import java.util.List;

class Movie {
    private String title;
    private String directorName;
    private int duration;
    private List<CastMember> cast;

    public Movie(String title, String directorName, int duration, List<CastMember> cast) {
        this.title = title;
        this.directorName = directorName;
        this.duration = duration;
        this.cast = cast;
    }


    public String getTitle() {
        return title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getDuration() {
        return duration;
    }

    public List<CastMember> getCast() {
        return cast;
    }
}
