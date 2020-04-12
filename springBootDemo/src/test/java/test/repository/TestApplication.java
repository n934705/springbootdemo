package test.repository;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
@EnableJpaRepositories(basePackages={"com.example.demo.Repository"})
@EntityScan(basePackages={"com.example.demo.Entity"})
public class TestApplication {

}
