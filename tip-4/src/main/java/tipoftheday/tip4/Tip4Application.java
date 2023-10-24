package tipoftheday.tip4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tip4Application {



	public static void main(String[] args) {
		SpringApplication.run(Tip4Application.class, args);
		CarService carService = new CarService();

		var cars = carService.withNullOption();
		//need null test before do anything
		System.out.println("printing null option");
		if(cars != null){ // if you don't do this you will get  Cannot invoke "java.util.List.forEach(java.util.function.Consumer)" because "cars" is null
			cars.forEach(System.out::println);
		}

		cars = carService.withEmptyOption();
		System.out.println("printing empty option");
		cars.forEach(System.out::println);

		cars = carService.withValues();
		System.out.println("printing values option");
		cars.forEach(System.out::println);
	}

}
