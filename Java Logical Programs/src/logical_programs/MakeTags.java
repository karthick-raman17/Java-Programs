package logical_programs;

public class MakeTags {
	public String makeTags(String tag, String word) {
		  String local;
		  
		  local="<"+tag+">"+word+"</"+tag+">";
		 
		  return local;
		}

	public static void main(String[] args) {
		MakeTags makeTagsObject = new MakeTags();
		System.out.println(makeTagsObject.makeTags("Username","Karthick"));
		
	}
}
