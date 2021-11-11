package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity){
        this.maxCapacity=maxCapacity;
    }


    public boolean addPassenger(Passenger passenger){
        if(maxCapacity-passenger.getLuggageCount()>=0){
            passengers.add(passenger);
            maxCapacity-=passenger.getLuggageCount();
            return true;
        }
        else{
            return false;
        }

    }
    public int numberOfPackages() {
        int number=0;
        for (Passenger p: passengers) {
            number+=p.getLuggageCount();
        }
        return number;
    }

    public static void main(String[] args) {
        Plane plane = new Plane(10);
        System.out.println(plane.addPassenger(new Passenger("Zoltán","FE-201",2)));
        System.out.println(plane.addPassenger(new Passenger("Imre","FE-202",3)));
        System.out.println(plane.addPassenger(new Passenger("Károly","FE-203",5)));
        System.out.println(plane.addPassenger(new Passenger("Marcsi","FE-204",2)));
        System.out.println("Nubmer of packages: "+plane.numberOfPackages());

    }
}
