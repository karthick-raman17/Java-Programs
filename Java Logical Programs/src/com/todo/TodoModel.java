package com.todo;
import java.util.HashMap;
import java.util.ArrayList;

public class TodoModel {

	HashMap<String,HashMap<Integer,ArrayList<String>>> allList = new HashMap<String,HashMap<Integer,ArrayList<String>>>() ;

	public HashMap<String, HashMap<Integer, ArrayList<String>>> getAllList() {
		return allList;
	}

	public void setAllList(HashMap<String, HashMap<Integer, ArrayList<String>>> allList) {
		this.allList = allList;
	}
	
}
