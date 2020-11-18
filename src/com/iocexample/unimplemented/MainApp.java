package com.iocexample.unimplemented;

public class MainApp {

	public static void main(String[] args) {
		MainApp container = new MainApp();
		User user = container.new User();
		user.add("Some data");
	}
	
	
	public class User {
		
		MySqlDatabase database;
		
		
		//We are dependent on the creation of a 'MySqlDatabase' Instance so testability on the User 
		//class alone becomes nearly impossible
		public User() {
			database = new MySqlDatabase();
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
