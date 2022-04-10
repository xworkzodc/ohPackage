package com.xworkz.cameraDAO;
import com.xworkz.cameraDTO.*;
public class CameraRunner {
		
		public static void main(String[] args)
		{
			
			CameraDTO cameradto1 = new CameraDTO();
		    cameradto1.setId(4576);
			cameradto1.setBrand("Panasonic");
		    cameradto1.setPixel(100.00);
		    cameradto1.setType("Digital Camera");
		    cameradto1.setCost(400);
		
			CameraDTO cameradto2= new CameraDTO();
			cameradto2.setId(7689);
			cameradto2.setBrand("Kodak");
			cameradto2.setPixel(134.00);
			cameradto2.setType("Pinhole Camera");
			cameradto2.setCost(90000);
			
			CameraDTO  cameradto3 = new CameraDTO();
			cameradto3.setId(3476);
			cameradto3.setBrand("Sony");
			cameradto3.setPixel(5000.00);
			cameradto3.setType("Movie Camera");
			cameradto3.setCost(70000);
			
			
			
			CameraDAO dao=new CameraDAOImplementation();
			
			CameraDAOImplementation castedDAO=(CameraDAOImplementation)dao;
			
			castedDAO.save(cameradto1);
			castedDAO.save(cameradto2);
			castedDAO.save(cameradto3);
			
		castedDAO.findById(4545);

		castedDAO.findByMaxCost();
		
		castedDAO.findByMinCost();
			
			castedDAO.findById(1);
			castedDAO.findByMaxCost();
			castedDAO.findByMinCost();
			castedDAO.findDuplicate(null);
			castedDAO.save(null);
			
			
			
			
			
			
			
			
		}

	}

