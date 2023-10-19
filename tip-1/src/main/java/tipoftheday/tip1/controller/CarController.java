package tipoftheday.tip1.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tipoftheday.tip1.domain.Car;

@RestController
@RequestMapping(path = {"/car","/cars"})
public class CarController {

  @GetMapping
  public List<Car> getAllCars(){
      return List.of(new Car("Beetle","White"), new Car("Brasilia","Yellow"));
  }
}
