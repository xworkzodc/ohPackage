package com.xworkz.overrid.encapsule.dto;

public class PersonDTO {
	private String Fname; 
	private String Mname;
	private String Lname;
	private String Fathername;
	private String Mothername;
	private String Surname;
	private String Hometown;
	private String city;
	private String district;
	private String taluk;
	private String gender;
	private String FatherOccupation;
	private String Motheroccupation;
	private String qualification;
	private String jobtype; //15
    private int age;
    private int phoneno;
    private int Adharno;
    private int Pancardno;
    private int usn;
    private int identicardno;
    private int luckyno;
    private int noofvehicle;
    private int shoesize;
    private int nuoshoes;
    private int noofcars;
    private int noofBikes;
    private int noofbooks;
    private int AccountNo;
    private int IFSCno;
    private int CVVno; 
    private int Fatherage;
    private int Motherage;
    private int noofPhones;
    private int height;
    private int noofHouses;
    private int carNo;
    private int houseno;
    private int joiningYear;
    private int salary;
    private int Fincome;
    private int Familymem;
    private int bankbalance;
    private int noofFriends;
    private int noofSim;//45
    private double weight;
    private double puPer;
    private double tenthPer;
    private double bePer;
    private double hemoglobinContent;
    private double bodytemp;
    private double BP;
    private double sugarCon;
    private double phoneper;
    private double salaryinPA;
    private double CGPA;
    private double slippersize;
    private double tshirtsize;
    private double pantsize;
    private String collegename;
    private String Schoolname;
    private String PUcollegename;
    private String Housename;
    private String companyname;
    private String villagename;
    private boolean disabled;
    private boolean dead;
    private boolean read;
    private boolean wright;
    private boolean walk;//70
    private int empID;
    private boolean driving;
    private boolean smile;
    private String lang;
    private boolean network;
    private boolean speek;
    private String EmailId;
    private boolean educated;
    private String AltEmail;
    private String DOB;//80
    public PersonDTO()
    {
    	
    }
    public PersonDTO(String name,String Mname)
    {
    	this.Fname=name;
    	this.Mname=Mname;
    }
    protected String getFName()
    {
    	return this.Fname;
    }
    String getMName() {
    return this.Mname;
    
    }
    String getLName()
    {
    return this.Lname;	
    }
    String getFathername()
    {
    	return this.Fathername;
    }
    String getMotherrname()
    {
    	return this.Mothername;
    }
    String getsurname()
    {
    	return this.Surname;
    }
    String getHometown()
    {
    	return this.Hometown;
    }
    String getcity()
    {
    	return this.city;
    }
    String getdistrict()
    {
    	return this.district;
    }
    String gettaluk()
    {
    	return this.taluk;
    }
    String getgender()
    {
    	return this.gender;
    }
    String getFatheroccupation()
    {
    	return this.FatherOccupation;
    }
    String getMothername()
    {
    	return this.Motheroccupation;
    }
    String getqualification()
    {
    	return this.qualification;
    }
    String getjobType()
    {
    	return this.jobtype;
    }
    String getvillagename()
    {
    	return this.villagename;
    }
    String getCollegename()
    {
    	return this.collegename;
    }
    String getPUcollegename()
    {
    	return this.PUcollegename;
    }
    String getSchoolrname()
    {
    	return this.Schoolname;
    }
    String getHousename()
    {
    	return this.Housename;
    }
    String getcompanyname()
    {
    	return this.companyname;
    }
    String getlang()
    {
    	return this.lang;
    }
    String getEmailId()
    {
    	return this.EmailId;
    }
    String getAlternateEmail()
    {
    	return this.AltEmail;
    }
    String getDOB()
    {
    	return this.DOB;
    }
    int getage() 
    {
    	return this.age;
    }
    int getphoneno() 
    {
    	return this.phoneno;
    }
    int getadharno() 
    {
    	return this.Adharno;
    }
    int getpancardno() 
    {
    	return this.Pancardno;
    }
    int getusn() 
    {
    	return this.usn;
    }
    int getidenticardno() 
    {
    	return this.identicardno;
    }
    int getshoessize() 
    {
    	return this.shoesize;
    }
    int getnoofvehicle() 
    {
    	return this.noofvehicle;
    }
    int noofshoes() 
    {
    	return this.nuoshoes;
    }
    int getnoofcars() 
    {
    	return this.noofcars;
    }
    int getnoofbooks() 
    {
    	return this.noofbooks;
    }
    int getAccountno() 
    {
    	return this.AccountNo;
    }
    int getIFSCno() 
    {
    	return this.IFSCno;
    }
    int getCVVno() 
    {
    	return this.CVVno;
    }
    int getFatherage() 
    {
    	return this.Fatherage;
    }
    int getMotherage() 
    {
    	return this.Motherage;
    }
    int getnoofPhones() 
    {
    	return this.noofPhones;
    }
    int getheight() 
    {
    	return this.height;
    }
    int getcarNo() 
    {
    	return this.carNo;
    }
    int getnoofHouse() 
    {
    	return this.noofHouses;
    }
    int getjoiningYear() 
    {
    	return this.joiningYear;
    }
    int get() 
    {
    	return this.age;
    }
    int getFamilyIncome() 
    {
    	return this.Fincome;
    }
    int getFamilymem() 
    {
    	return this.Familymem;
    }
    int getbankbalance() 
    {
    	return this.bankbalance;
    }
    int getnoofFriends() 
    {
    	return this.noofFriends;
    }
    int getnoofsim() 
    {
    	return this.noofSim;
    }
    int getempID() 
    {
    	return this.empID;
    }
    double getweight() 
    {
    	return this.weight;
    }
    double getpuPer() 
    {
    	return this.puPer;
    }
    double gettenthPer() 
    {
    	return this.tenthPer;
    }
    double getBEPer() 
    {
    	return this.bePer;
    }
    double hemoglobinContent() 
    {
    	return this.hemoglobinContent;
    }
    double getBP() 
    {
    	return this.BP;
    }
    int getluckyno() 
    {
    	return this.luckyno;
    }
    int getsalary() 
    {
    	return this.salary;
    }
    int gethouseno() 
    {
    	return this.houseno;
    }
    int getnoofBikes() 
    {
    	return this.noofBikes;
    }
    double getbodytemp() 
    {
    	return this.bodytemp;
    }
    double getsugarCon() 
    {
    	return this.sugarCon;
    }
    
}