package logical_programs;

public class PatternAbba {
	public String makeAbba(String a, String b) {
		String local = "";

		local = a + b;

		local += b + a;

		return local;
	}
	
	public static void main(String[] args) {
		PatternAbba patternAbbaObject = new PatternAbba();
		
		System.out.println(patternAbbaObject.makeAbba("Hi","User"));
		
	}
}
