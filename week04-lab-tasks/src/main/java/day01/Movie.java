package day01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int yearOfStart;
    private List<Actor> actors= new ArrayList<>();

    public Movie(String title, int yearOfStart) {
        this.title = title;
        this.yearOfStart = yearOfStart;
    }

    public void addActor(Actor actor){
        this.actors.add(actor);
    }
    public int actorsInTheirTwenties(){
        int count=0;
        int age;
        for (Actor actor: actors) {
            age= LocalDate.now().getYear()-actor.getYearOfBirth();
            if(age>19 && age<30){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Shrek",2007);
        movie.addActor(new Actor("Zoltán",1999));
        movie.addActor(new Actor("Kriszta",1977));
        movie.addActor(new Actor("Botond",1960));
        movie.addActor(new Actor("Beáta",2001));
        movie.addActor(new Actor("Morgan",2002));

        System.out.println("Actors, which in twenties: "+movie.actorsInTheirTwenties());
    }
}
