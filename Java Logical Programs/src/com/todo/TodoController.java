package com.todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TodoController extends TodoModel {
	TodoModel todoModelObject = new TodoModel();
	HomePage homePageObject = new HomePage();

	ArrayList<String> allTaskList = new ArrayList<String>();
	ArrayList<String> completeTaskList = new ArrayList<String>();
	HashMap<Integer, ArrayList<String>> taskStatus = new HashMap<Integer, ArrayList<String>>();
	HashMap<String, HashMap<Integer, ArrayList<String>>> allTaskObject = new HashMap<String, HashMap<Integer, ArrayList<String>>>();

	Scanner scanObject = new Scanner(System.in).useDelimiter("\\n");

	int choice;

	public void todoEntry(UserModel userObject, TodoModel todoObject, TodoController todoControllerObject) {

		do {
			System.out.println("Please choose any listed option ");
			System.out.println(
					"1. Add task \n2. Mark as complete\n3. List all task\n4. List active task\n5. List completed task\n6. Logout");
			choice = scanObject.nextInt();

			switch (choice) {
			case 1:
				createTask(userObject, todoObject, todoControllerObject);
				break;
			case 2:
				markTaskAsCompleted(userObject, todoObject, todoControllerObject);
				break;
			case 3:
				listAllTask(userObject, todoObject, todoControllerObject);
				break;
			case 4:
				listActiveTask(userObject, todoObject, todoControllerObject);
				break;
			case 5:
				listCompletedTask(userObject, todoObject, todoControllerObject);
				break;
			case 6:
				homePageObject.startSystem(userObject, todoModelObject, todoControllerObject);
			default:
				System.out.println("Please enter valid option");
			}

		} while (choice >= 1 || choice <= 6);

	}

	public void createTask(UserModel userObject, TodoModel todoObject, TodoController todoControllerObject) {
		String task;

		do {

			System.out.println("Enter the task");

			task = scanObject.next();

			allTaskList.add(task);

			taskStatus.put(0, allTaskList);
			allTaskObject.put(userObject.getEmail(), taskStatus);

			todoModelObject.setAllList(allTaskObject);
			System.out.println("Task Added!!! \n");
			System.out.println("Add More?\n Yes \n No");
		} while (scanObject.next().equalsIgnoreCase("Yes"));

		todoEntry(userObject, todoObject, todoControllerObject);
	}

	public void listAllTask(UserModel userObject, TodoModel todoObject, TodoController todoControllerObject) {

		if (!(todoModelObject.getAllList().isEmpty())) {

			allTaskObject.putAll(todoModelObject.getAllList());

			System.out.println("\t\tTodo List:\nAll Task's :");
			for (HashMap<Integer, ArrayList<String>> tempTaskKey : allTaskObject.values()) {

				for (Map.Entry<Integer, ArrayList<String>> tempTaskValue : tempTaskKey.entrySet()) {

					for (String activeList : tempTaskValue.getValue()) {
						System.out.println(" \t" + activeList);
					}

				}
			}
			System.out.println("");
			todoEntry(userObject, todoObject, todoControllerObject);
		}

		else {
			System.out.println("\nList is Empty !!!\n");
			todoEntry(userObject, todoObject, todoControllerObject);

		}
	}

	// list only active task's
	public void listActiveTask(UserModel userObject, TodoModel todoObject, TodoController todoControllerObject) {
		allTaskObject.putAll(todoModelObject.getAllList());

		if (!(todoModelObject.getAllList().isEmpty())) {

			for (HashMap<Integer, ArrayList<String>> tempTaskKey : allTaskObject.values()) {

				for (Map.Entry<Integer, ArrayList<String>> tempTaskValue : tempTaskKey.entrySet()) {

					if (tempTaskValue.getKey().equals(0)) {
						System.out.println("\t\tTodo List:\nActive Task's :");

						for (String activeList : tempTaskValue.getValue()) {
							System.out.println(" \t" + activeList);
						}
						System.out.println("");
						todoEntry(userObject, todoObject, todoControllerObject);
					} else {
						System.out.println("\nActive task list is empty !!!\n");
						todoEntry(userObject, todoObject, todoControllerObject);

					}
				}
				System.out.println("");
				todoEntry(userObject, todoObject, todoControllerObject);
			}

		} else {
			System.out.println("\nActive task list is empty !!!\n");
			todoEntry(userObject, todoObject, todoControllerObject);
		}
	}

	// List only completed task's

	public void listCompletedTask(UserModel userObject, TodoModel todoObject, TodoController todoControllerObject) {
		allTaskObject.putAll(todoModelObject.getAllList());

		if (!(todoModelObject.getAllList().isEmpty())) {
			for (HashMap<Integer, ArrayList<String>> tempTaskKey : allTaskObject.values()) {

				Iterator<Entry<Integer, ArrayList<String>>> tempTaskValue = tempTaskKey.entrySet().iterator();

				while (tempTaskValue.hasNext()) {
					Entry<Integer, ArrayList<String>> next = tempTaskValue.next();

					if (next.getKey().equals(1)) {
						System.out.println("\t\tTodo List:\nCompleted Task's :\n");

						for (String values : next.getValue()) {
							System.out.println(values);
						}
					} else {
						System.out.println("Task list is empty!!!\n");
					}
					System.out.println("");
				}
			}
		}

		else {
			System.out.println("\n Task list is empty !!!\n");
			todoEntry(userObject, todoObject, todoControllerObject);
		}

	}

	public void markTaskAsCompleted(UserModel userObject, TodoModel todoObject, TodoController todoControllerObject) {

		String task;
		System.out.println("Please enter the task\n");
		task = scanObject.next();

		allTaskObject.putAll(todoModelObject.getAllList());

		if (!(todoModelObject.getAllList().isEmpty())) {

			for (HashMap<Integer, ArrayList<String>> tempTaskKey : allTaskObject.values()) {

				for (Map.Entry<Integer, ArrayList<String>> tempTaskValue : tempTaskKey.entrySet()) {

					if (tempTaskValue.getKey().equals(0)) {

						tempTaskValue.getValue().remove(task);

						completeTaskList.add(task);
						tempTaskKey.put(1, completeTaskList);
						allTaskObject.put(userObject.getEmail(), tempTaskKey);
						System.out.println("Task completed\n");

					}

				}
			}
		}
		todoEntry(userObject, todoObject, todoControllerObject);
	}

}
