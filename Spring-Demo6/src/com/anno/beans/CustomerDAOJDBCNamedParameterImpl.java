package com.anno.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value="customerDAOJDBCNamedParameterImpl")
public class CustomerDAOJDBCNamedParameterImpl implements CustomerDAO {

	@Autowired
	private NamedParameterJdbcTemplate namedTemplate;
	
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String insertQuery="insert into customer values(:customerId,:customerName)";
		
		Map<String, Object> params=new HashMap<String,Object>();
		params.put("customerId", customer.getCustomerId());
		params.put("customerName", customer.getCustomerName());
		
		int rows=namedTemplate.update(insertQuery, params);
		
		return rows;
	}

	@Override
	public int updateCustomer(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
