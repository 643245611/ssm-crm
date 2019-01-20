package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerDao {

	public Integer customerCountByQueryVo(QueryVo vo);
	
	public List<Customer> selectCustomerListByQueryVo(QueryVo vo);
	
	public Customer selectCustomerById(Integer id);
	
	public void updateCustomerById(Customer customer);
	
	public void deleteCustomerById(Integer id);
	
}
