package IPLTeamsDAO;
import IPLTeamsDTO.iplTeamDTO;
public class iplTeamDAOImplementation extends iplTeamDAO{
	
	@Override
	public void save(iplTeamsDTO dto) {
     System.out.println("created iplTeam Dto");
     
     if(dto!=null && super.index<this.ipldto.length) {
    	 this.ipldto[super.index]=dto;
    	 super.index++;
    	 
    	 
    	 
    	 System.out.println("iplIplemntation created");
     }
	
	}
	

	public iplTeamsDTO IplTeamDTOfindByName(String name)
	{
		iplTeamsDTO[] arrayFromDTOParent=super.getIpldto();
		
		for(int count=0;count<arrayFromDTOParent.length;count++)
		{
			//IplTeamDTO tempDTO=arrayFromDTOParent[count];
			if(arrayFromDTOParent[count]!=null && arrayFromDTOParent[count].getCaptain()==(name))
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

	
}


