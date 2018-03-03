package logical_programs;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class FirstCharSort {

	public static void main(String[] args) {

		SortedSet<String> setobject = new TreeSet<String>();

		String[] names = { "James", "Ever", "Kate", "Steve", "Bill", "Albert","Ever" };

		for (int indexvalue = 0; indexvalue < names.length; indexvalue++) {

			setobject.add(names[indexvalue]);
		}
		Iterator<String> iteratorobject = setobject.iterator();

		while (iteratorobject.hasNext()) {

			Object stringvalue = iteratorobject.next();

			System.out.println(stringvalue.toString());

		}

	}

}
