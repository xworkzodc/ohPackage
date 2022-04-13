package IPLTeamsDAO;
import IPLTeamsDTO.iplTeamDTO;
public class iplTeamDAOImplementation extends iplTeamDAO{
	
	@Override
	public void save(iplTeamDTO dto) {
     System.out.println("created iplTeam Dto");
     
     if(dto!=null && super.index<this.ipldto.length) {
    	 this.ipldto[super.index]=dto;
    	 super.index++;
    	 
    	 
    	 
    	 System.out.println("iplIplemntation created");
     }
	
	}
	

	public iplTeamDTO findByName(String name)
	{
		iplTeamDTO[] arrayFromDTOParent=super.getipldto();
		
		for(int count=0;count<arrayFromDTOParent.length;count++)
		{
			//IplTeamDTO tempDTO=arrayFromDTOParent[count];
			if(arrayFromDTOParent[count]!=null && arrayFromDTOParent[count].getcaptain()==(name))
			{
				System.out.println("Name is found"+index);
				return ipldto[super.index];
			}
			else
			{
				System.out.println("Name is not found"+index);
				return null;
			}
		}
		return null;
	
	}
	public void saveMultiple(iplTeamDTO dto1,iplTeamDTO dto2)
	{
		if(dto1==null&&dto2==null)
		{
			System.out.println("value is null cannot be created");
			return;
		}
		iplTeamDTO[] arrayofDAO=super.getipldto();
		int multi=super.getmultiindex1();
		if(multi<arrayofDAO.length) {
			arrayofDAO[multi]=dto1;
		
			System.out.println("dto added at index"+multi);
			multi++;
			super.setmultiindex1(multi);
		}
		if(multi<arrayofDAO.length) {
			arrayofDAO[multi]=dto2;
			System.out.println("dto added at index"+multi);
			multi++;
			super.setmultiindex1(multi);
		}
	}
	void updateSponsorByName(String name,String sponsor) {
		if(name==null&&sponsor==null) {
			System.out.println("name and sponsor is null");
			return;
		}
		iplTeamDTO[] arrayofDAO=super.getipldto();
		for(int index=0;index<arrayofDAO.length;index++) {
			if(arrayofDAO!=null)
				if(arrayofDAO[index].getname().equals(name))
					if(arrayofDAO[index].setsponsor(sponsor)) {
						System.out.println("DTO is found"+index);
						return;
					}
		}
		System.out.println("team name not found");
		return;
	}
public	void updateCaptainByName(String captain,String name) {
	iplTeamDTO[] var=super.getipldto();
	for(int index=0;index<var.length;index++) {
		if(var[index]!=null&& var[index].getname().equals(name)) {
			var[index].setcaptain(captain);
			System.out.println("captain name updated to index");
		}
	}
}
}


