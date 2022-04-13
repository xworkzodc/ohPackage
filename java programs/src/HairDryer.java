
public class HairDryer {
	int speed;
	int watt;
	boolean hotair;
	HairDryer()
	{
		System.out.println("running default constructor");
	}
	HairDryer(int speed)
	{
		this.speed=speed;
		System.out.println("running param cons for hair dryer");
	}
	void Displaydetails()
	{
		System.out.println("running instance method");
		System.out.println(speed);
		System.out.println(watt);
		System.out.println(hotair);
	}
	void Changespeed()
	{
		System.out.println(" running change speed");
		System.out.println("speed before change="+speed);
		speed=speed+2;
		System.out.println("speed after change="+speed);
	}
	

}
