package com.xworkz.customer.dto;
import java.io.Serializable;
public class AddressDTO implements Serializable{

		private int id;// >0 <1000
		private String street;//min 2 , max 100
		private String doorNo;//min 1
		private int pincode;// 6 digits 
		public AddressDTO()
		{
			super();
			System.out.println("default constractor");
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			if(id>0&&id<100000)
			{
			this.id = id;
		}else {
			System.err.println("Address ID not valid");
			return;
		}
		}
		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			if(street.length()<2|| street.length()>100)
			{
				System.out.println("lenth should be between 2 and 100");
				return;
			}else
				this.street=street;
		}

		public String getDoorNo() {
			return doorNo;
		}

		public void setDoorNo(String doorNo) {
			if(doorNo.length()<1) {
				System.out.println("pass more than one door");
				return;
			}else
				this.doorNo=doorNo;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			if(String.valueOf(pincode).length()==6) {
				System.out.println("enter 6 digit pin");
				return;
			}else
			this.pincode = pincode;
		}

		public StateDTO getStateDTO() {
			return stateDTO;
		}

		public void setStateDTO(StateDTO stateDTO) {
			if(stateDTO!=null)
			{
			this.stateDTO=stateDTO;	
			}
			
		}

		private StateDTO stateDTO;// valid state 
	}


