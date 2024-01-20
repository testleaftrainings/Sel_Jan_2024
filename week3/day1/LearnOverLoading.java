package week3.day1;

public class LearnOverLoading {

	
	public void browser(String name) {
 System.out.println("my browser name is :"+ name);
	}
	
	public void browser(String name,int version) {
		System.out.println("browser name :"+ name +"Borwser Version :"+version);
		//string ,int
	}

	
	public void browser(int version,String name) {
		System.out.println("browser name :"+ name +"Borwser Version :"+version);
     //int ,string
	}
	
	public static void main(String[] args) {
		LearnOverLoading ol= new LearnOverLoading();
		ol.browser("Chrome");
		ol.browser(121, "Edge");
		ol.browser("safari", 123);
	}
}
