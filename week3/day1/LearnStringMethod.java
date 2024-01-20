package week3.day1;

public class LearnStringMethod {

	public static void main(String[] args) {

		//type 1
		String company="Test Leaf";
		
		//type 2
		String data=new String("Test Leaf");
		
		//m1 length-ctrl+2-L
		 int length = company.length();
		System.out.println("total no of char's :"+ length);
		
		//m2 touppercase
		String upperCase = company.toUpperCase();
		System.out.println("char's converted into upper case :"+ upperCase);
	
	//m3 tolowercase
		String lowerCase = company.toLowerCase();
		System.out.println("char's converted into lowercase :"+ lowerCase);
		
		//m4 equals() -its checking content of the string
		//what different b/w .equals() & ==
		if(company.equals(data)) {
			System.out.println("content is same -equals()");
		}else {
			System.out.println("content is not same -equals ()");
		}
		
		//== it will check memory address
		if(company==data) {
			System.out.println("content is same -(==)");
		}else {
			System.out.println("content is not same -(==)");
		}
		
		//m5 equalsIgnorecase
		
		String com ="test Leaf";
		//String company="Test Leaf";
		
		if(company.equalsIgnoreCase(com)){
			System.out.println("content is same -equalsIgnoreCase()");
		}else {
			System.out.println("content is not same -equalsIgnoreCase ()");
		}
		
		//m6 contains
		
		boolean contains = com.contains("Laf");
		System.out.println("Contains :"+ contains);
		
		//m7 tocharArray
		//cannot use for loop directly in string
		
		String name="Selenium Webdriver";
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		//m8 -charAt
		
		char charAt = name.charAt(5);
		System.out.println("charAt :"+ charAt);
		
		//m9 -replace
		
		String replace = name.replace('e', 'E');
		System.out.println(replace);
		
		//m10 -replace all
		
		String value="amazon ProDuct 100 plus Phones";
		String replaceAll = value.replaceAll("[a,P,u,e]","&");
		System.out.println(replaceAll);
		
		//subString
		String n="WebDriver";
		
		String substring = n.substring(3);
		System.out.println(substring);
		
		//endindex will not print 
		//endindex-1
		//bDri
		String substring2 = n.substring(2, 6);
		System.out.println(substring2);
		
		
		//split
		
		String part= "Test Leaf Selenium Program";
		//TestLeafSeleniumProgram
		
		String[] split = part.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		System.out.println(" ");
		//Reverse String
		
		String data1="TestLeaf";
		//faeLtseT
		char[] ch1 = data1.toCharArray();
		for (int i = ch1.length-1; i >=0; i--) {
		
			System.out.print(ch1[i]);
			
		}
		
	}

}
