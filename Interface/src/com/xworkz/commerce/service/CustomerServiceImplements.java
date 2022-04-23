package com.xworkz.commerce.service;
import com.xworkz.commerce.dao.CustomerDAO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.dto.*;
import com.xworkz.customer.dto.*;

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
		if(customerDTO!=null)
		{
			if(customerDTO.getId()<=0)
				System.err.println("Id is incorrect");
			return false;
		}
		if(customerDTO.getName()==null || customerDTO.getName().length()<3 || customerDTO.getName().length()>50)
{
System.out.println("customer name is incorrect");
return false;
}
		if(customerDTO.getId()<=0) {
			System.out.println("customer id is not correct");
			return false;
		}
		if(String.valueOf(customerDTO.getMobile()).length()!=0 
				|| String.valueOf(customerDTO.getMobile()).length()<=10 )
			
		{
			System.err.println("id is incorrect");
			return false;
		}
		
		if(String.valueOf(customerDTO.getAlternativeMobile()).length()!=0 ||  
				String.valueOf(customerDTO.getAlternativeMobile()).length()<=0)
		{
			System.err.println("id is incorrect");
			return false;
		}
		
		if(customerDTO.getEmail().length()!=0 || customerDTO.getEmail().length()<=10 || customerDTO.getEmail().contains("@") 
		    ||  customerDTO.getEmail().endsWith("edu.in") || customerDTO.getEmail().endsWith("com.in") 
		    || customerDTO.getEmail().endsWith("org.in"))
		    		
		{

			System.err.println("id is incorrect");
			return false;
		}
		
		if(customerDTO.getCustomerType().PREMIUM!=null || customerDTO.getCustomerType().GOLD!=null
				|| customerDTO.getCustomerType().SILVER!=null)
		{
			System.err.println("id is incorrect");
			return false;
		}
			
		if(customerDTO.getAlternativeEmail().length()<=0 || customerDTO.getAlternativeEmail().length()<=10
				||customerDTO.getAlternativeEmail().endsWith("edu.in") || customerDTO.getAlternativeEmail().endsWith("org,in")
				
			    ||customerDTO.getAlternativeEmail().contains("@"))
		{
			
			System.out.println("Alternative email is incorrect");
			return false;
			
		}
			if(customerDTO.getAddressDTO()==null)
	{
	System.out.println("customer Adress DTO is not correct");
	return false;
	}
			AddressDTO addressdto=customerDTO.getAddressDTO();
			if(addressdto.getDoorNo().length()<1) {
				System.out.println("door no is not valid");
				return false;
			}
			if(addressdto.getId()>5)
			{
				System.out.println("invalid id");
				return false;
			}
			if(addressdto.getPincode()>=5)
			{
				System.out.println("pin is correct");
				return false;
			}
			if(addressdto.getStreet().length()<10)
			{
				System.out.println("not valid street");
				return false;
			}
	boolean found=dao.findDTO(customerDTO);
	if(found)
			{
		System.out.println("cannot be added");
		return false;
			}
	else
	{
		System.out.println("customer details not correct");
		dao.save(customerDTO);
		return true;
	}
	
	System.out.println("customer isnot added");
	return false;
}
	@Override
	public CustomerDTO findByName(String name) {
		if(name!=null) {
		CustomerDTO result= dao.findByName(name);
		return result;
	}
		System.out.println("name not found");
		return null;
	}

}
