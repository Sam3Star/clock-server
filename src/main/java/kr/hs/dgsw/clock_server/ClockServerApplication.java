package kr.hs.dgsw.clock_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ClockServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClockServerApplication.class, args);
	}

}
