package wrage.simplediscoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SimpleDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDiscoveryClientApplication.class, args);
	}

}
