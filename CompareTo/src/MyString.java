
public class MyString {
	
	// declaring the variables
	
	String comparedString, getString, substr1, substr2;
	int longer, result, length;
	
	/* this method sets the string that
	 * will be comparing to the argumented 
	 * string.
	 */
	
		public MyString(String str) {
		
		comparedString = str;
		
	}
		
	/* this method just returns the actual
	 * string. 
	 */
	
	public String string() {
		
		return comparedString;
	}
	
	/* this is the compareTo() method that 
	*  calls some of the other methods in 
	* in this class. getString is the 
	* parameter string in this method, and 
	* therefore the "comparedString" will be
	* compared against the "getString."
	*/
	
	public int compareTo(MyString str) {
		
		getString = str.string();
		CompareLength(comparedString, getString);
		result = CompareStrings(comparedString, getString);
		return result;
	}
	
	/* this is the method that actually does all of the legwork in the 
	 * compareTo() method. This method here takes the shorter of the
	 * strings, and compares that string to the other string it's being
	 * compared to. If the shorter string matches all of the characters
	 * in the longer string, it will return the value of the difference 
	 * of the shorter string and the longer string. If the characters do
	 * not match, it will take the decimal difference of the two characters
	 * for example, if the shorter string reads "AB" and the longer string 
	 * reads "ACB" then the difference would be the decimal value between
	 * the "C" in the longer string and "B" in the shorter string, and would
	 * return a value of -1. This method is also designed to compare a null 
	 * entry such as "" against any of the other strings, and it will return
	 * the difference of the null string minus the longer string.   
	 */
	
	
	public int CompareStrings(String One, String Two) {
		
		if(longer == 0) {
		
			length = Two.length();
			if(length == 0) {
				
				length = 1;
			}
			
			for(int i = 0; i < length; i++) {
				
				substr1 = One.substring(i, i + 1);
				
				if(length == 1) {
					
					substr2 = getString;
				} else {
					
					substr2 = getString.substring(i, i + 1);
				}				
				result = substr1.hashCode() - substr2.hashCode();
				
				if(result != 0) {
					
					if(getString.length() == 0) {
						
						result = comparedString.length() - getString.length();
						
						if(result == 0) {
							
							if(comparedString.length() == 0) {
								
								result = 0;
							} else {
								
								result =- getString.length();
							}
						}
					}					
					i = length;
				} else {
					
					result = One.length() - Two.length();
				}
			}
		} else {
		
			length = One.length();
			if(length == 0) {
				
				length = 1;
			}
						
			for(int i = 0; i < length; i++) {
				
				if(length == 1) {
					
					substr1 = comparedString;
				} else {
					
					substr1 = comparedString.substring(i, i + 1);
				}
				
				substr2 = Two.substring(i, i + 1);
				result = substr1.hashCode() - substr2.hashCode();
				
				if(result != 0) {
					
					if(comparedString.length() == 0) {
						
						result = comparedString.length() - getString.length();
						
						if (result == 0) {
							
							if(getString.length() == 0) {
								
								result = 0;
							} else {
								
								result =- getString.length();
							}
						}
					}
					
					i = length;
				} else {
					
					result = One.length() - Two.length();
				}
			}
		}
		return result;
	}
	
	// method that compares the strings' length to see which is longer
	
	public int CompareLength(String One, String Two) {
		
		if (One.length() > Two.length()) {
			
			longer = 0;
		} else {
			
			longer = 1;
		}
		return longer;
	}
}

