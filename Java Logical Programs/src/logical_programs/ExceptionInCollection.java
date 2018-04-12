package logical_programs;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExceptionInCollection {
	static Scanner scanObject = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Common Exceptions in Collection Framework");
			System.out.println("\n1.Null pointer Exception\n2.UnsupportedOperation Exception\n3.IllegablState Exception");

			String choice = "";
			choice = scanObject.next();
			switch (choice) {

			case "1":
				Set<Integer> treesetObject = new TreeSet<Integer>();
				treesetObject.add(null);

			case "2":
				List<Integer> listObject = new ArrayList<Integer>();
				listObject.add(1);
				listObject.add(2);
				List<Integer> unmodifisableList = Collections.unmodifiableList(listObject);
				unmodifisableList.add(3);
			case "3":
				List<Integer> listObject1 = new ArrayList<Integer>();
				listObject1.add(1);
				listObject1.add(2);
				Iterator<Integer> iteratorObjet =listObject1.iterator();
				while(iteratorObjet.hasNext())
				{
					 Integer test = iteratorObjet.next();
					 iteratorObjet.remove();
					 iteratorObjet.remove();
				}
				
			default:
				System.exit(0);
			}
		} 
		catch (NullPointerException exception) {
			System.out.println("\nTry to add the null value in the TreeSet\n");
			System.err.println("Exception type: " + exception);
			StackTraceElement[] trace = exception.getStackTrace();
			System.err.println("Exception occured at ");
			for (int i = 0; i < trace.length; i++)
				System.err.println("\t" + trace[i].toString());
		} 
		
		catch (UnsupportedOperationException exception) {
			System.out.println("\nTry to add the new element in the list after assigning that list to unmodifiable list\n");
			System.err.println(exception);
			StackTraceElement[] trace = exception.getStackTrace();
			System.err.println("Exception occured at ");
			for (int i = 0; i < trace.length; i++)
				System.err.println("\t" + trace[i].toString());
		}
		catch(IllegalStateException exception){
			System.out.println("Try to remove the element before calling the next()");
			System.out.println(exception);
			StackTraceElement[] trace = exception.getStackTrace();
			System.err.println("Exception occured at ");
			for (int i = 0; i < trace.length; i++)
				System.err.println("\t" + trace[i].toString());
		}
		
		finally
		{
			scanObject.close();
		}
	}
}
