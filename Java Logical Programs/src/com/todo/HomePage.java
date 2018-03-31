package com.todo;

import java.util.Scanner;

public class HomePage extends UserModel {
	Scanner scanObject = new Scanner(System.in).useDelimiter("\\n");
	UserModel userModelObject = new UserModel();
	String choice;

	public void startSystem(UserModel userModelObject, TodoModel todoModelObject, TodoController todoControllerObject) {
		do {
			System.out.println("Todo List");
			System.out.println("1. Register ?");
			System.out.println("2. Login");
			choice = scanObject.next();
			switch (choice) {
			case "1":
				register(userModelObject, todoModelObject, todoControllerObject);
				break;
			case "2":
				login(userModelObject, todoModelObject, todoControllerObject);
				break;
			default:
				System.out.println("Please enter valid option");
				startSystem(userModelObject, todoModelObject, todoControllerObject);
			}
		} while (choice == "1" || choice == "2");

	}

	public void register(UserModel userModelObject, TodoModel todoModelObject, TodoController todoControllerObject) {

		System.out.println("Please enter your email address:");
		String email = scanObject.next();
		userModelObject.setEmail(email);

		System.out.println("Please enter the password:");
		String password = scanObject.next();
		userModelObject.setPassword(password);

		startSystem(userModelObject, todoModelObject, todoControllerObject);
	}

	public void login(UserModel userModelObject, TodoModel todoModelObject, TodoController todoControllerObject) {

		System.out.println("Please enter your email address:");
		String email = scanObject.next();

		System.out.println("Please enter the password:");
		String password = scanObject.next();

		if (email.equals(userModelObject.getEmail()) && password.equals(userModelObject.getPassword())) {

			System.out.println("Successfully logged in\n");

			todoControllerObject.todoEntry(userModelObject, todoModelObject, todoControllerObject);

		} else {
			System.out.println("Username not found");
			startSystem(userModelObject, todoModelObject, todoControllerObject);
		}

	}

	public static void main(String[] args) {
		UserModel userObject = new UserModel();
		TodoModel todoObject = new TodoModel();
		TodoController todoControllerObject = new TodoController();
		HomePage homePageObject = new HomePage();
		homePageObject.startSystem(userObject, todoObject, todoControllerObject);
	}
}
