package br.com.solid.dip;

public class OracleConnector implements DBConnector {

	@Override
	public void connect() {
		System.out.println("Connected to Oracle database");
	}

}
