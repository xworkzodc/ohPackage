package method;

public class WildCraftBag extends Bag{
	String warrantyPeriod;
	enum color{
		BLACK,RED,BLUE
	}
	WildCraftBag()
	{
		System.out.println("no argument constroctor");
	}
	WildCraftBag(String waPeriod)
	{
		this.warrantyPeriod=waPeriod;
		System.out.println("warrantyperiod is="+warrantyPeriod);
		System.out.println(color.BLACK);
	}

}
