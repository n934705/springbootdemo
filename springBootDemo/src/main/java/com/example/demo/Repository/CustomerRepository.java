package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	List<Customer> findByCity(String cityName);

	
	@Query(value="SELECT c FROM Customer c WHERE c.country= :country")
	List<Customer> findAllCustomerNumberByCountry(@Param("country") String country);
	
	@Query(value="SELECT c FROM Customer JOIN c.employee e WHERE e.employeeNumber= :employeeNumber")
	List<Customer> findAllBySalesEmployee(@Param("employeeNumber") int empNumber);
}
