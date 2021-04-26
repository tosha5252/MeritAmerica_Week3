public class Remove {
	public static void main (String [] args)
	

{
	
	//removeAllOccurences("This is a test", 't');
	//removeAllOccurences("Summer is here!", 'e'); 
	//removeAllOccurences("-------O------", 'O'); 	
	
	//put the char in an array 
	String str = "This is a test"; 
	String strA = "Summer is here!"; 
	String strB = "------O------"; 
	String str1 = str.replace("t", "");
	String str2 = strA.replace("e", "");
	String str3 = strB.replace("-", "");
	
	System.out.println (""+ str1);
	System.out.println (""+ str2);
	System.out.println (""+ str3);

	}
}
