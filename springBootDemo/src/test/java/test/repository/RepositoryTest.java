package test.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.SpringBootDemoApplication;
import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.VCustomerbystate;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Repository.VCustomerbystateRepository;

//@ExtendWith(SpringExtension.class)
//@DataJpaTest
@SpringBootTest(classes = SpringBootDemoApplication.class)
class RepositoryTest {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private VCustomerbystateRepository vCustomerbystateRepository;

	//pring.jpa.hibernate.naming-strategy
	@Test
	public void findAllByCityTest() {
		String cityName="NYC";
		int resultCount = customerRepository.findByCity(cityName).size();
		assertEquals(5, resultCount);
	}
	
	@Test
	public void findAllCustomerNumberByCountryTest() {
		List<Customer> resultList = customerRepository.findAllCustomerNumberByCountry("USA");
		for(Customer item:resultList) {
			System.out.print(item.getCustomerNumber()+"/");
		}
	}
	
	
	@Test
	public void findAllBySalesEmployeeTest() {
		List<Customer> result = customerRepository.findAllBySalesEmployee(1370);
		
		System.out.println(result.size());
		
	}
	
	@Test
	public void findAllForVCustomerByStateTest() {
		List<VCustomerbystate> result = vCustomerbystateRepository.findAll();
		assertEquals(6,result.size());
	}
	

}
