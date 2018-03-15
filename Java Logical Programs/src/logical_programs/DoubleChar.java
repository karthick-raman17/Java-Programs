package logical_programs;

public class DoubleChar {
	public String doubleChar(String str) {
		  String local= new String();
		  
		  for(int i=0; i<str.length();i++)
		  {
		    local = local + str.charAt(i) + str.substring(i,i+1);
		  }
		  
		  return local;
		}

	public static void main(String[] args) {
		DoubleChar doubleCharObject = new DoubleChar();
		
		System.out.println(doubleCharObject.doubleChar("karthick"));
		System.out.println(doubleCharObject.doubleChar("Hello"));
	}
}
