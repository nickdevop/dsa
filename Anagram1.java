package javadsa;

public class Anagram1 {

	public static void main(String[] args) {
	String a="aaaaa";
	String b ="aaaa";
	//this is create program know tha t if they visited to that word or not
	boolean isvisit[]=new boolean[b.length()];
	
	//this is use to run the loop using true or false condition
	boolean isanagram=false;
	//this is to ensure that the length of both the string is same
	if(a.length()==b.length())
		{
		//to itreate a in b so we can go word to word or check 1 word in a with all the word in b
		for(int i=0;i<a.length();i++)
			//store valuea at tha partiv=cular indexing to check further the condition
		{	char C=a.charAt(i);
		//by default we take is anagram as a false so we can go in the loop once
		isanagram =false; 
			for(int j=0;j<b.length();j++)
			{
				if(b.charAt(j)==C&& !isvisit[j])
				{
					//if not visited is true then it chek the other word otherwise not
				isvisit[j]=true;
				
				 isanagram =true;
			    	break;
				}
			//to check if boolean is true or not
			}
			if(!isanagram) {
				break;
			}
		
		
		//check boolean condition
		}}
		if(isanagram)
		{
			System.out.println("this strings is an anagram");
		}
		
			
			else {
			System.out.println("this strings is not an anagram");
				}
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
