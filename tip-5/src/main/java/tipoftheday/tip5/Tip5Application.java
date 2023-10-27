package tipoftheday.tip5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tipoftheday.tip5.domain.Airplane;
import tipoftheday.tip5.domain.Car;
import tipoftheday.tip5.domain.Vehicle;

@SpringBootApplication
public class Tip5Application {

	public static void main(String[] args) {
		SpringApplication.run(Tip5Application.class, args);

		Vehicle v1 = new Car("Car", "Red", true);
		Vehicle v2 = new Airplane("Airplane", "White", 5);

		//we don't have flaps in a Vehicle
		if(v2 instanceof Airplane a){
			System.out.println("Airplane: " + a.getName() + " " + a.getColor() + " " + a.getFlaps());
		}

		if(v1 instanceof Car c){
			System.out.println("Car: " + c.getName() + " " + c.getColor() + " " + c.isAutomatic());
		}

	}

}
