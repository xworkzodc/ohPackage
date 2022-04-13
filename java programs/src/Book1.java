
public class Book1 {
	String name;
	String authorName;
	int price;
	final static String lang="kannada";
	Book1(String name,String authorName){
		name="computer science";
		authorName="charles babbage";
		System.out.println("book name  "+name	+  " book authorname  "+authorName);
	}
Book1(){
	price=500;
	System.out.println("price="+price);
}
static {
	System.out.println("language is   "+lang);
}
}
