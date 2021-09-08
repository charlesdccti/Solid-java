package br.com.solid.dip;

public class MySQLConnector implements DBConnector {

	@Override
	public void connect() {
		System.out.println("Connected to the MySQL database");
	}

}
