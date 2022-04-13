package IPLTeams.copy;
import IPLTeamsDAO.iplTeamDAOImplementation;
import IPLTeamsDTO.iplTeamDTO;

public class iplTeamRunner {
	public static void main(String [] args) {
		
		
		iplTeamDTO ipldto1=new iplTeamDTO();
		ipldto1.setname("RCB");
		ipldto1.setid(5434);
		ipldto1.setcaptain("virat kohli");
		ipldto1.setsponsor("muthoot fincorp");
		ipldto1.setnoOfLostmatch(1);
		ipldto1.setnoOfWin(2);
		
		iplTeamDTO ipldto2=new iplTeamDTO();
		ipldto2.setname("CSK");
		ipldto2.setid(4142);
		ipldto2.setcaptain("Ravindra Jadeja");
		ipldto2.setsponsor("Amazon");
		ipldto2.setnoOfLostmatch(3);
		ipldto2.setnoOfWin(0);
		
		
		iplTeamDTO ipldto3=new iplTeamDTO();
		ipldto3.setname("Delhi Capitals");
		ipldto3.setid(4524);
		ipldto3.setcaptain("rishab Pant");
		ipldto3.setsponsor("JSW");
		ipldto3.setnoOfLostmatch(1);
		ipldto3.setnoOfWin(1);
		
		iplTeamDTO ipldto4=new iplTeamDTO();
		ipldto4.setname("KKR");
		ipldto4.setid(4527);
		ipldto4.setcaptain("Shreyas Ayer");
		ipldto4.setsponsor("WINZO");
		ipldto4.setnoOfLostmatch(1);
		ipldto4.setnoOfWin(2);
		
		
		iplTeamDTO ipldto5=new iplTeamDTO();
		ipldto5.setname("GT");
		ipldto5.setid(4536);
		ipldto5.setcaptain("Hardik Pandya");
		ipldto5.setsponsor("Zomato");
		ipldto5.setnoOfLostmatch(0);
		ipldto5.setnoOfWin(2);
		
		iplTeamDTO ipldto6=new iplTeamDTO();
		ipldto6.setname("LSG");
		ipldto6.setid(4527);
		ipldto6.setcaptain("K.L.Rahul");
		ipldto6.setsponsor("My 11 Circle");
		ipldto6.setnoOfLostmatch(1);
		ipldto6.setnoOfWin(2);
		
		
		iplTeamDTO ipldto7=new iplTeamDTO();
		ipldto7.setname("PBKS");
		ipldto7.setid(4212);
		ipldto7.setcaptain("Mayank Agarwal");
		ipldto7.setsponsor("EbixCash");
		ipldto7.setnoOfLostmatch(1);
		ipldto7.setnoOfWin(2);
		
		
		iplTeamDTO ipldto8=new iplTeamDTO();
		ipldto8.setname("Mumbai Indians");
		ipldto8.setid(4526);
		ipldto8.setcaptain("Rohit Sharma");
		ipldto8.setsponsor("Slice");
		ipldto8.setnoOfLostmatch(2);
		ipldto8.setnoOfWin(0);
		
		
		iplTeamDTO ipldto9=new iplTeamDTO();
		ipldto9.setname("Deccan Chargers");
		ipldto9.setid(4562);
		ipldto9.setcaptain("VVS Laxman");
		ipldto9.setsponsor("puma");
		ipldto9.setnoOfLostmatch(5);
		ipldto9.setnoOfWin(4);
		
		
		
		iplTeamDTO ipldto10=new iplTeamDTO();
		ipldto10.setname("SRH");
		ipldto10.setid(4537);
		ipldto10.setcaptain("Kane williumson");
		ipldto10.setsponsor("CARS");
		ipldto10.setnoOfLostmatch(2);
		ipldto10.setnoOfWin(0);
		
		
		
		iplTeamDTO ipldto11=new iplTeamDTO();
		ipldto11.setname("GL");
		ipldto11.setid(4512);
		ipldto11.setcaptain("Suresh Raina");
		ipldto11.setsponsor("Swiggy");
		ipldto11.setnoOfLostmatch(4);
		ipldto11.setnoOfWin(8);
		
		
		
		iplTeamDTO ipldto12=new iplTeamDTO();
		ipldto12.setname("RPS");
		ipldto12.setid(4578);
		ipldto12.setcaptain("Steven Smith");
		ipldto12.setsponsor("MOTO");
		ipldto12.setnoOfLostmatch(8);
		ipldto12.setnoOfWin(6);
		
		
		
		iplTeamDTO ipldto13=new iplTeamDTO();
		ipldto13.setname("Kochi Tuskers kerala");
		ipldto13.setid(4527);
		ipldto13.setcaptain("Mahela Jayavardane");
		ipldto13.setsponsor("Anchor");
		ipldto13.setnoOfLostmatch(10);
		ipldto13.setnoOfWin(4);
		
		
		
		iplTeamDTO ipldto14=new iplTeamDTO();
		ipldto14.setname("RR");
		ipldto14.setid(45287);
		ipldto14.setcaptain("Sanju Samson");
		ipldto14.setsponsor("Happilo");
		ipldto14.setnoOfLostmatch(1);
		ipldto14.setnoOfWin(2);
		
		iplTeamDAOImplementation dao=new iplTeamDAOImplementation();
		
		iplTeamDAOImplementation castedDAO=(iplTeamDAOImplementation)dao;
		
				castedDAO.save(ipldto1);
				castedDAO.save(ipldto2);
				castedDAO.save(ipldto3);
				castedDAO.save(ipldto4);
				castedDAO.save(ipldto5);
				castedDAO.save(ipldto6);
				castedDAO.save(ipldto7);
				castedDAO.save(ipldto8);
				castedDAO.save(ipldto9);
				castedDAO.save(ipldto10);
				castedDAO.save(ipldto11);
				castedDAO.save(ipldto12);
				castedDAO.save(ipldto13);
				castedDAO.save(ipldto14);
				castedDAO.IplTeamDTOfindByName("RCB");
				castedDAO.IplTeamDTOfindByName("Du Plessis");
				castedDAO.findByNameAndSponsor("RCB", "muthoot fincorp");
				castedDAO.findByNameAndSponsorAndCaptain("RR", "Happilo"," Sanju Samson");
				

		
		
		}
		
		
		
		


	}


