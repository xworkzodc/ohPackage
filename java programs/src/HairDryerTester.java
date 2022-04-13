
public class HairDryerTester {
	public static void main(String[] args) {
		HairDryer hairdryer=new HairDryer(6);
		hairdryer.watt=220;
		hairdryer.hotair=true;
		System.out.println(hairdryer.speed);
		System.out.println(hairdryer.watt);
		System.out.println(hairdryer.hotair);
		HairDryer hairdryer1=new HairDryer(2);
		hairdryer1.hotair=true;
		hairdryer1.Displaydetails();
		HairDryer hairdryer2=new HairDryer(5);
		hairdryer2.hotair=false;
		hairdryer2.Displaydetails();
		hairdryer2.Changespeed();
		System.out.println(hairdryer2.speed);
		
		
	}

}
