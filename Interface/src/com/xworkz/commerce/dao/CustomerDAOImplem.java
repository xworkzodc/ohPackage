package com.xworkz.commerce.dao;
import com.xworkz.commerce.dao.*;
import com.xworkz.customer.dto.CustomerDTO;

public class CustomerDAOImplem implements CustomerDAO{
	protected CustomerDTO[] customerDTO=new CustomerDTO[10];
	protected int customerIndex=0;

	@Override
	public boolean save(CustomerDTO customerDTO) {
		System.out.println("Adding customer details");
		if(customerDTO==null) {
			System.out.println("cannot add null value");
			return false;
		}
	boolean found=find(customerDTO);
	if(found) {
		System.out.println("Customer details already exist cannot add again");
		return false;
	}
	if(customerIndex<this.customerDTO.length) {
		this.customerDTO[customerIndex]=customerDTO;
		this.customerIndex++;
		System.out.println("customer details added at location"+this.customerIndex);
		return true;
	}else {
		System.out.println("customer memory is full");
	}
	return false;
	}

	private boolean find(CustomerDTO customerDTO2) {
		for(int index=0; index<this.customerDTO.length;index++)
		{
			if(this.customerDTO[index]!=null && this.customerDTO[index].equals(customerDTO))
			{
				System.out.println("the customer details already exist");
				return true;
			}
		}
		System.out.println("customer details are not found");
		return false;
	}

	@Override
	public CustomerDTO findByName(String name) {
		for(int index=0; index<this.customerDTO.length; index++) {
		if(this.customerDTO[index]!=null && this.customerDTO[index].getName().equals(name)) {
			System.out.println("Customer with name:"+name.toUpperCase());
			return this.customerDTO[index];
		}
		}
		System.err.println("entered name do not match ");
		return null;
	}
	public boolean findDTO(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
