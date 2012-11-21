
public class compareTo {
	
	public static void main(String[] args) {
	
	// declaring the variables	
		
	MyString str1, str2, str3;
	int result;
	
	// create three new string objects
	
	str1 = new MyString("Java");
	str2 = new MyString("Java is Fun");
	str3 = new MyString("Java");
	
	// comparing the three strings to each other
	
	result = str1.compareTo(str2);
	
	System.out.println("The difference between " + str1.string() + " and " + str2.string()  + " is " + result);
	
	result = str2.compareTo(str1);
	
	System.out.println("The difference between " + str2.string() + " and " + str1.string()  + " is " + result);
	
	result = str1.compareTo(str3);		
	
	System.out.println("The difference between " + str1.string() + " and " + str3.string()  + " is " + result);
				
	}
}