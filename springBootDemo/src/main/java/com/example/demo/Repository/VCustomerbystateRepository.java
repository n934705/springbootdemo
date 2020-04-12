package com.example.demo.Repository;

import java.util.List;

import org.hibernate.persister.entity.BasicEntityPropertyMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.VCustomerbystate;

@Repository
public class VCustomerbystateRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<VCustomerbystate> findAll(){
		StringBuilder builder = new StringBuilder();
		builder.append(" SELECT "
				+" customerNumber customerNumber, " 
				+" contactFirstName contactFirstName, "
				+" contactLastName contactLastName, "
				+" salesRepEmployeeNumber salesRepEmployeeNumber "
				);
		builder.append(" FROM v_customerbyState; ");
		
		List<VCustomerbystate> result = jdbcTemplate.query(builder.toString(),new BeanPropertyRowMapper(VCustomerbystate.class));
		
		return result;
	};

}
