class earp{
		String brand;
		final static int cost; 
		String type;
         String color;
		earp(String br)
		{
			brand=br;
			this.brand=br;
			System.out.println("Brand Name="+this.brand);
		}
		static{
			cost=35000;
			System.out.println("init the cost of earphone is");
			}
		earp(){
			type="na";
			System.out.println(type);
			
		}
		earp(String clr){
			color=clr;
			System.out.println("earphone color is=");
		}
		
		
}


