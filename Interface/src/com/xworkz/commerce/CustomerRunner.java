package com.xworkz.commerce;
import com.xworkz.commerce.constants.CustomerType;
import com.xworkz.commerce.dao.CustomerDAO;
import com.xworkz.commerce.dao.CustomerDAOImplem;
import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.dto.StateDTO;
import com.xworkz.commerce.service.CustomerService;
import com.xworkz.commerce.service.CustomerServiceImplements;
public class CustomerRunner {
		// team work --->  
		public static void main(String[] args) {
			CustomerDAO customerDAO=null;// new CustomerDAOImpl();
			
			
			StateDTO statedto=new StateDTO();
			statedto.setId(12);
			System.out.println(statedto.getId());
			statedto.setName("Karnataka");
			System.out.println(statedto.getName());
			statedto.setNoOfDistricts(30);
			System.out.println(statedto.getNoOfDistricts());
	
			AddressDTO addressdto=new AddressDTO();
			addressdto.setId(18889);
			addressdto.setDoorNo("#57");
			addressdto.setPincode(567432);
			addressdto.setStreet("tumkur");
			addressdto.setStateDTO(statedto);
			
			CustomerDTO customerdto=new CustomerDTO();
			customerdto.setAlternativeEmail("thrivenim2234@gmail.com");
			//customerdto.setAlternativeMobile(9987654335);
			customerdto.setCustomerId(1009);
			customerdto.setCustomerType(CustomerType.GOLD);
			customerdto.setEmail("thrivenimahesh@gmail.com");
			customerdto.setId(1108);
			//customerdto.setMobile(9987666789);
			customerdto.setName("Thriveni");
			customerdto.setAddressDTO(addressdto);
			
			CustomerDTO customerdto1=new CustomerDTO();
			customerdto1.setAlternativeEmail("geetha443@gmail.com");
			//customerdto1.setAlternativeMobile(9987654335);
			customerdto1.setCustomerId(1065);
			customerdto1.setCustomerType(CustomerType.SILVER);
			customerdto1.setEmail("govindanarayan@gmail.com");
			customerdto1.setId(1008);
			//customerdto11.setMobile(9987666789);
			customerdto1.setName("Geetha");
			customerdto1.setAddressDTO(addressdto);
			
			
			CustomerService customerService=null;//new CustomerServiceImpl(customerDAO);
			CustomerDAO cdao=(CustomerDAO) new CustomerDAOImplem();
			CustomerService Cussevice=(CustomerService) new CustomerServiceImplements(cdao);
			Cussevice.validateAndSave(customerdto);
			Cussevice.validateAndSave(customerdto1);
			System.out.println("finding by name"+Cussevice.findByName("Geetha").toString());
			
			

		}

}
