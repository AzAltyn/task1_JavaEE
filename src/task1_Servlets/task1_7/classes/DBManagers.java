package task1_Servlets.task1_7.classes;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Footballer> footballers;
    private static Long id = 4l;

    public DBManager() {
    }

    static {
        footballers.add(new Footballer(1l,"Cristiano", "Ronaldo", 500000,"Real Madrid", 1200000));
        footballers.add(new Footballer(2l,"Marselo", "Leds", 350000,"Real Madrid", 700000));
        footballers.add(new Footballer(3l,"Messi", "Leo", 480000,"Fc Barcelona", 1000000));
    }

    public static ArrayList<Footballer> getfootballers() {
        return footballers;
    }

    public static void addFootballer(Footballer footballer){
        footballer.setId(id);
        footballers.add(footballer);
        id++;
    }

}
