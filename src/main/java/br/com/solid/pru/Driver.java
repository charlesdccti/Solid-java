package br.com.solid.pru;

public class Driver extends Employee {

	public void drive() {
		System.out.println(super.getName() + " is driving");
	}
	
	public void drive(String vehicle) {
		System.out.println(super.getName() + " is driving a "+ vehicle);
	}
}
