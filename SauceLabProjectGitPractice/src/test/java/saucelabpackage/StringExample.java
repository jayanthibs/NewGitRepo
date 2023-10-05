package saucelabpackage;

public class StringExample {

	public static void main(String[] args) {
		
		String s1="Automation Testing";
		String s2= new String("Automation Testing");
		char[] ch= {'A','u','t','o','m','a','t','i','o','n',' ','T','e','s','t','i','n','g'};
		String s3= new String(ch);
		String s4="";
		String s5="Automation Testing";
		String s6= "Jayanthi";
		String s7="jayanthi";
		
		System.out.println("s1="+s1);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s3="+s3);
		System.out.println("length()-->"+s1.length());//Returns the length of this string
		System.out.println("charAt(2)-->"+s2.charAt(2));//Returns the char value at the specified index
		
		System.out.println("equals()-->"+s2.equals(s3)); //Compares (content or value) of this string to the specified object
		System.out.println("equalsIgnoreCase()-->"+s6.equalsIgnoreCase(s7));
		// compares only the reference s1 and s5 refer to  instance in string constant pool, s2 and s3 refer to its own instance in non pool
		System.out.println("== -->"+(s2==s3)); 
		//Compares two strings lexicographically.The comparison is based on the Unicode value of each character in the strings. 
		System.out.println("compareTo()-->"+s1.compareTo(s2));
		System.out.println("compareTo()-->"+s1.compareTo(s6));
		System.out.println("compareTo()-->"+s6.compareTo(s1));
		
		System.out.println("isBlank()-->"+s4.isBlank());//Returns true if the string is empty or contains only white space codepoints,otherwise false
		System.out.println("isEmpty()-->"+s4.isEmpty());//Returns true if, and only if, length() is 0.
		
		//Once String object is created its data or state can't be changed but a new String object is created.
		String s8="java string";  
		s8.concat("is immutable");  //concat() method appends the string at the end 
		System.out.println(s8.concat("is immutable"));
		System.out.println(s8);  //will print java string because strings are immutable objects 
		s8=s8.concat(" is immutable so assign it explicitly");  
		System.out.println(s8);  
		
		String s9="Manual Testing October batch";
		
		System.out.println("replace() char-->"+s9.replace('a','e'));
		System.out.println("replace() string-->"+s9.replace("Testing","Class"));
		//replace() vs replaceAll() --> replaceAll() first argument is regular expression
		System.out.println("replaceAll() string-->"+s9.replace("batch","group"));
		
		System.out.println("substring()-->"+s9.substring(7)); // only start index
		System.out.println("substring()-->"+s9.substring(4,20)); // start and end index -1
		
		System.out.println("toLowerCase()-->"+s9.toLowerCase());
		System.out.println("toUpperCase()-->"+s9.toUpperCase());
		
		String s10="    Java Tutorial   ";
		System.out.println("trim()-->"+s10.trim());//Returns a string whose value is this string, with all leading and trailing space removed
		
		System.out.println("contains()-->"+s9.contains("October"));//Returns true if and only if this string contains the specified sequence of char values.
        
		String s11="This is the methods of the String class";
		
		System.out.println("indexOf()-->"+s11.indexOf('o'));
		System.out.println("indexOf()-->"+s11.indexOf('t',10));
		System.out.println("indexOf()-->"+s11.indexOf("of"));
		System.out.println("indexOf()-->"+s11.indexOf("the",20));
		
		//same concept repeats for lastIndexOf()
		System.out.println("lastIndexOf()-->"+s11.lastIndexOf('o'));
		System.out.println("lastIndexOf()-->"+s11.lastIndexOf('t',10));
		System.out.println("lastIndexOf()-->"+s11.lastIndexOf("of"));
		System.out.println("lastIndexOf()-->"+s11.lastIndexOf("the",20));
		
		//Splits this string around matches of the given regular expression or string
		String []Split=s11.split("");
		//String []Split=s11.split("od");
		//String []Split=s11.split(" ");
		//String []Split=s11.split("o",6);
	//	String []Split=s11.split(" ",2);
		for(String s:Split) {
			System.out.println(s);
		}
		
		char[] ch1=s1.toCharArray();  
		for(int i=0;i<ch1.length;i++){  
		System.out.print(ch1[i]);  
		}  
		System.out.println();
		
		System.out.println(s1.startsWith("Au"));  // true  
		System.out.println(s1.startsWith("automation"));   // false --case sensitive  
		 System.out.println(s1.startsWith("a",5)); // True    
		 
		 // returns string value if int,char,char[],boolean,long,float,double,object
		 int a=20;
		 String s12=String.valueOf(a);
		 System.out.println("String.valueOf()-->"+(s12+10));
	}

}
