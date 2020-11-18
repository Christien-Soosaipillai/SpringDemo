package com.iocexample.partiallyimplemented;


public class MainApp {

	public static void main(String[] args) {
		MainApp container = new MainApp();
		User user = container.new User(container.new MySqlDatabase());
		user.add("Some data");
	}
	
	
	public class User {
		
		MySqlDatabase database;
		
		/*
		 * Here we apply `Inversion of Control` so that we expect to get a MySqlDatabase from somewhere
		 * but we arent in charge of actually creating it, therefore we are no longer dependent on it.
		 * 
		 * Now we can implement some unit test because we are not dependent on creating an instance
		 * of 'MySqlDatabase' but what if we we have more than one database type that we are able
		 * to implement such as 'OracleDatabase' what can we do now. We would have to rewrite the code
		 * but we dont want to have to do that
		 * 
		 * */
		public User(MySqlDatabase database) {
			this.database = new MySqlDatabase();
		}
		
		
		public void add(String data) {
			database.persist(data);
		}
				
		
	}
	
	
	private class MySqlDatabase{
		
		void persist(String data) {
			System.out.println("MySqlDatabase is persisting the following data: " + data);
		}
		
	}
	
	private class OracleDatabase{

		void persist(String data) {
			System.out.println("MySqlDatabase is persisting the following data: " + data);
		}

	}
	
	

}
