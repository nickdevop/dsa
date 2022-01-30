package javadsa;

public class Anagram {

	public static void main(String[] args) {
		
	String a="aaabbcc";
	String b ="bacaabc";
	//this is create program know tha t if they visited to that word or not
	
	//this is use to run the loop using true or false condition
	boolean isanagram=true;
	int al[]=new int[256];
	int bl[]=new int[256];
	for(char c: a.toCharArray())
	{
	int index=(int)c;
	al[index]++;
	
	}
	
	for(char c: b.toCharArray())
	{
	int index=(int)c;
	bl[index]++;
	
	}
	for(int i=0;i<256;i++)
	{
		if(al[i]!=bl[i])
		{
			isanagram=false;
			break;
		}
	
	}
		
		//check boolean condition
		
		if(isanagram)
		{
			System.out.println("this strings is an anagram");
		}
		
			
			else {
			System.out.println("this strings is not an anagram");
				}
	
			
	
	
	
	}

}
