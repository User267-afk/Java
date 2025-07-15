package vehicles;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args)
    {
        Car Ferrari= new Car(LocalDate.of(2012,5,12));

       System.out.println(Ferrari.getAge());
    
    }
}