package EFAlanEscumpaniP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class MicroServicioPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioPizzaApplication.class, args);
	}

}
