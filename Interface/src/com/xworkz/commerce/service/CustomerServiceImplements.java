package com.xworkz.commerce.service;
import com.xworkz.commerce.dao.CustomerDAO;
import com.xworkz.customer.dto.CustomerDTO;

public class CustomerServiceImplements implements CustomerService {
	private CustomerDAO dao;
	public CustomerServiceImplements(CustomerDAO dao) {
	super();
    this.dao=dao;
	}
	public CustomerDAO getDao() {
		return dao;
	}
	@Override
	public boolean validateAndSave(CustomerDTO customerDTO) {
		if(customerDTO.getId()>0 || customerDTO.getId()<10000 && customerDTO.getName() || mobilecheck(customerDTO.getMobile())
				&& emailcheck(customerDTO.getEmail()));{
		System.out.println("All records entered are valid and can save");
		boolean status=dao.save(customerDTO);
		System.out.println("Saving of records"+status);
	}
	else {
		System.out.println("cannot save the records");
	}
		return false;
	}
	private boolean emailcheck(String email) {
		if(email.contains("@")&&(email.endsWith(".com")|| email.endsWith(".edu"))) {
		return true;
	}
		return false;
	}
	private boolean mobilecheck(long mobile)
	{
		if(mobile!=0 && String.valueOf(mobile).length()==10) {
		return true;
	}
	return false;
	}
	@Override
	public CustomerDTO findByName(String name) {
		if(name!=null) {
		CustomerDTO result= dao.findByName(name);
	}
		return null;
	}

}
