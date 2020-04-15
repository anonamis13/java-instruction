package ui;

import java.util.List;

import biz.User;
import db.DAO;
import db.UserDB;

public class prsConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS console\n");
		
		DAO<User> userRepo = new UserDB();
		List<User> users = userRepo.list();
		
		System.out.println("List of users:\n");
		
		for (User u : users) {
			System.out.println(u);
		}
		
		System.out.println("\nGoodbye");
	}

}
