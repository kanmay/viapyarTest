package packageB;

public class UtilityFunctions {
	
	String mySearchString(String userQuery){
		
		String mySearch="";
		
		String[] s1=userQuery.split("\\~");
		String s2=s1[0].replaceAll("in ","");
		
		String[] words=s2.split("\\s");
		
		for(int i=0;i<=words.length-2;i++){  
			
			mySearch=mySearch+words[i]+" AND ";
			
			System.out.println("aaa");
		    System.out.println("aaaaahhhhhhh  "+s1);
			
		}  
		
		int size = words.length;
		System.out.println("my size is:"+size);
		
		System.out.println("hhhh");
	    System.out.println("bbbbbhhhhhhhhhhh  "+s1);
		
		mySearch= mySearch+" "+words[size-1];

		System.out.println(mySearch);
		
		
		return mySearch;
	}
	
	public static void main(String[] args){
		
		UtilityFunctions uf=new UtilityFunctions();
		uf.mySearchString("Apple in i watch ~appl");
	}

}
