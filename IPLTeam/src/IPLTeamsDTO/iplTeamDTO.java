package IPLTeamsDTO;

public class iplTeamDTO {
	private int id;
	private String name;
	private String sponsor;
	private String captain;
	private int noOfWin;
	private int noOfLostmatch;
	
	public iplTeamDTO()
	{
		System.out.println("this is default constractor");
	}
	public iplTeamDTO(int id,String name,String sponsor,String captain,int noOfWin,int noOfLostmatch)
	{
		super();
		this.id=id;
		this.name=name;
		this.sponsor=sponsor;
		this.captain=captain;
		this.noOfWin=noOfWin;
		this.noOfLostmatch=noOfLostmatch;
	}
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return "iplTeamDTO [id="+id+",name="+name+",sponsor="+sponsor+",captain="+captain+",noOfWin="+noOfWin+",noOfLostmatch="+noOfLostmatch+
				",getClass()="+super.getClass+",hashCode()="+super.hashCode+",toString()="+super.toString()+"]";
	}
	public String getsponsor()
	{
		return sponsor;
	}
	public void setsponsor(String sponsor)
	{
		this.sponsor=sponsor;
	}
	public String getcaptain()
	{
		return captain;
	}
	public void setcaptain(String captain)
	{
		this.captain=captain;
	}
	public int getnoOfWin()
	{
		return noOfWin;
	}
	public void setnoOfWin(int noOfWin)
	{
		this.noOfWin=noOfWin;
	}
	public int getnoOfLostmatch()
	{
		return noOfLostmatch;
	}
	public void setnoOfLostmatch(int noOfLostmatch)
	{
		this.noOfLostmatch=noOfLostmatch;
	}
	void createiplTeamDTO(iplTeamDTO dto)
	{
		//too auto generated method
	}
	

}
