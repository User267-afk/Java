import java.time.Period;
import java.time.LocalDate;


public class Car{
    	private LocalDate manufactured;

          public Car(LocalDate manufactured) {
        this.manufactured = manufactured;
       }
	
	public int getAge() {
		return Period.between(manufactured, LocalDate.now()).getYears();
	}
	
}