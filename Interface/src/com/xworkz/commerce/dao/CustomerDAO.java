package com.xworkz.commerce.dao;
import com.xworkz.customer.dto.CustomerDTO;
public interface CustomerDAO {
        boolean save(CustomerDTO customerDTO);
        

		CustomerDTO findByName(String name);

}
