package logical_programs;


import java.util.ArrayList;

public class RemoveDuplicateInArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayListObject = new ArrayList<String>();

		arrayListObject.add("hi");
		arrayListObject.add("everyone");
		arrayListObject.add("hi");
		arrayListObject.add("hi");
		arrayListObject.add("how");
		arrayListObject.add("are");
		arrayListObject.add("you");
		arrayListObject.add("you");

		for (int i = 0; i < arrayListObject.size(); i++) {

			for (int j = i + 1; j < arrayListObject.size(); j++) {
				if (arrayListObject.get(i).equals((arrayListObject.get(j)))) {
					arrayListObject.remove(j);
					j--;
				}
			}

			System.out.println(arrayListObject);
		}
	}
}
