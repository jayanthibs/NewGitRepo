package saucelabpackage;
public class CharacterCount 
{
public static void main(String[] args)
 {
	String s="charactercount";
	//String s="charactercount";
	int r=0;
	for(int x=0;x<s.length();x++)
	{
		for(int y=0;y<s.length();y++)
		{
			if (s.charAt(x)==s.charAt(y))
			{
				r++;
			}
				
		}
		System.out.println(s.charAt(x)+"="+r);
		String d=String.valueOf(s.charAt(x));
        s=s.replaceAll(d,"");
		r=0;
	}
  }
}

