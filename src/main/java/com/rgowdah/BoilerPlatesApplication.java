package com.rgowdah;

import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = { BoilerPlatesApplication.class, Jsr310JpaConverters.class})
public class BoilerPlatesApplication {
	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("MST"));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BoilerPlatesApplication.class, args);
	}
}
