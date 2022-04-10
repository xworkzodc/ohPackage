package com.xworkz.cameraDAO;
import com.xworkz.cameraDTO.*;
public abstract class CameraDAO {
	private CameraDTO[] cameradto=new CameraDTO[5];
	protected CameraDAO() {
		System.out.println("its default const");
	}
	public CameraDTO[] getcameraDTO()
	{
		return cameradto;
	}
	public abstract boolean save(CameraDTO dto);
	public abstract boolean findDuplicate(CameraDTO cameraDTO);
	public abstract CameraDTO findById(int id);
	public abstract CameraDTO findByMaxCost();
	public abstract CameraDTO findByMinCost();
	

}
