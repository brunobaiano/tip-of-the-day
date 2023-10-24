package tipoftheday.tip4;

import java.util.List;
import org.springframework.stereotype.Service;
import tipoftheday.tip4.domain.Car;

@Service
public class CarService {

  public List<Car> withNullOption(){
    return null;
  }

  public List<Car> withEmptyOption(){
    return List.of();
  }

  public List<Car> withValues(){
    return List.of(new Car("Beetle","White"), new Car("Brasilia","Yellow"));
  }

}
