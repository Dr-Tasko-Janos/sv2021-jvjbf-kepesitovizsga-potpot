package training360.gardenservices;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sv2021JvjbfKepesitovizsgaPotpotApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sv2021JvjbfKepesitovizsgaPotpotApplication.class, args);
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper().findAndRegisterModules();
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
