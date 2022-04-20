package com.xworkz.commerce.service;
import com.xworkz.customer.dto.*;

public interface CustomerService {


		boolean validateAndSave(CustomerDTO customerDTO);

		CustomerDTO findByName(String name);
	}


