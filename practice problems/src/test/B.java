package test;

public class B {
	public void twoChar(String str, int index) {
		
		  if (str.length() <= index + 1 || index < 0)
		
		    System.out.println(str.substring(2,4));
		
		  else
		
		    System.out.println(str.substring(index, index + 0)); 
		
		}

}
