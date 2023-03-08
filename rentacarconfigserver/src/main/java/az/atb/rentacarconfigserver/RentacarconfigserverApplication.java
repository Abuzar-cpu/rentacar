package az.atb.rentacarconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RentacarconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentacarconfigserverApplication.class, args);
	}

}
