package com.iocexample.implemented;

public class MainApp {

	public static void main(String[] args) {
		MainApp container = new MainApp();
		User mySqlUser = container.new User(container.new MySqlDatabase());
		mySqlUser.add("data from mySql");
		User oracleUser = container.new User(container.new MySqlDatabase());
		oracleUser.add("data from oracle");
	}
	
	
	public class User {
		
		Database database;
		
		/*
		 * Here we apply `Dependency Inversion` by having our user class' constructor 
		 * have an interface as its parameter. This makes it easy to support different types
		 * of databases through the principle of abstraction, in this case the interface. This
		 * way we can pass a 'MySqlDatabase' or and 'OracleDatabase' or even any other implementation
		 * we come up with in the future without having to change out internal code for the User class
		 * 
		 * */
		public User(Database database) {
			this.database = database;
		}
		
		public void add(String data) {
			database.persist(data);
		}
				
		
	}
	
	public interface Database{
		
		void persist(String data);
		
	}
	
	
	private class MySqlDatabase implements Database{
		
		public void persist(String data) {
			System.out.println("MySqlDatabase is persisting the following data: " + data);
		}
		
	}
	
	private class OracleDatabase implements Database{

		public void persist(String data) {
			System.out.println("MySqlDatabase is persisting the following data: " + data);
		}

	}
	
}
