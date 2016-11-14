package exceptions;

import java.sql.SQLException;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		Account acc = new Account();
		try {
			acc.withdraw(100);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Server is down, please try again later.");
		}
		finally {
			System.out.println("'finally' always executes");
		}

	}

}
