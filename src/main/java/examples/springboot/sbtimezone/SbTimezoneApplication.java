package examples.springboot.sbtimezone;

import java.time.ZoneId;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SbTimezoneApplication {
	public static void main(String[] args) {
		SpringApplication.run(SbTimezoneApplication.class, args);
	}

	@PostConstruct
	public void setDefaultTimeZone(){
		TimeZone.setDefault(TimeZone.getTimeZone("PST"));
	}
}
