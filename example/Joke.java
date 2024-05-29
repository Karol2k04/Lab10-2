package org.example;

public class Joke {
    private String setup;
    private String punchline;

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "setup='" + setup + '\'' +
                ", punchline='" + punchline + '\'' +
                '}';
    }
}
