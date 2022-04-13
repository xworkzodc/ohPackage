import com.xworkz.overrid.*;
public class InternetRunner {
	public static void main(String[] args)
	{
		Internet internet=new Internet();
		System.out.println(internet.type);
		FiberInternet fiberInternet=new FiberInternet();
		System.out.println(fiberInternet.type);
		ModemInternet modemInternet=new ModemInternet();
		System.out.println(modemInternet.type);
		System.out.println(modemInternet.plan);
		modemInternet.connect();
	}

}
