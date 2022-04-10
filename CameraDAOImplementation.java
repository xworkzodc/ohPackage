package com.xworkz.cameraDAO;
import com.xworkz.cameraDTO.*;
public class CameraDAOImplementation extends CameraDAO {
		
		
		CameraDTO[] superCameraArray=super.getcameraDTO();
		int adder=0;
		
		 public CameraDAOImplementation() {

	     System.out.println("Invoking default implemented constructor");
			
		}
		 
		 
		 
		
		

		@Override
		public boolean save(CameraDTO cameraDTO) {
			
			
			if(cameraDTO!=null)
			{
				System.out.println("The dto is full and can not be  added");
				return false;
			}
			
			
			boolean found=findDuplicate(cameraDTO);
			if(found)
			{
				System.out.println("The dto is already founded and cannot be added ");
				return false;
			}
			
			if(this.adder<this.superCameraArray.length)
			{
				this.superCameraArray[this.adder]=cameraDTO;
				System.out.println("This DTO is added  to index @"+ this.adder);
				this.adder++;
				return true;
			}
			
			else
			{
				System.out.println("The DTO is not found");
			}
			
			
			
			return false;
		}
		
		
		
		
		

		@Override
		public boolean findDuplicate(CameraDTO cameraDTO) {
			
			if(cameraDTO == null)
			{
				System.err.println("The dto is null and cannot be added");
				
			}
			
			
			for(int index=0;index<this.superCameraArray.length;index++)
			{
				if(this.superCameraArray[index]!=null && this.superCameraArray[index].equals(cameraDTO))
				{
					System.out.println("The dto is found @"+index);
					return true;
				}
			}
			
			return false;
			
			
		}
		
		
		
		
		

		@Override
		public CameraDTO findById(int id) {
			
			if(id<=0)
			{
				System.out.println("THE ID IS NULL CANNOT BE FOUND");
				return null;
			}
			
			for(int index=0;index<this.superCameraArray.length;index++)
			{
				if(superCameraArray[index]!=null && this.superCameraArray[index].getId()==id)
				{
					System.out.println("the id is found @"+index);
					return superCameraArray[index];
				}
			}
			
			
			System.err.println("the dto is not found in the dto array");
			
			
			return null;
		}
		
		
		
		

		@Override
		public CameraDTO findByMaxCost() {

			double maxCost=0;
			int maxCostIndex=0;
			
			
			for(int i=0;i<this.superCameraArray.length;i++)
			{
				if(superCameraArray!=null )
				{
					double cost=superCameraArray[i].getCost();
					if(cost>maxCost)
					{
						maxCost=cost;
						maxCostIndex=i;
					}
			}
			
			}
			System.out.println("The maximum cost of the camera"+maxCost+ " @ found index"+maxCostIndex);
			return null;
		}

		@Override
		public CameraDTO findByMinCost() {
			
			double minCost=superCameraArray[0].getCost();
			int minCostIndex=0;
			
			
			for(int i=0; i<this.superCameraArray.length;i++)
			{
				if(superCameraArray[i]!=null)
				{
					double cost=superCameraArray[i].getCost();
				
					if(cost<minCost)
					{
						minCost=cost;
						minCostIndex=1;
					}
					
					
					
				}
			}
			
			System.out.println("The min cost of camera  is"+ minCost+"found index @"+minCostIndex);
			
			
			
			
			
			return superCameraArray[minCostIndex];
		}
		

	}

