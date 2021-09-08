package br.com.solid.pru;

public class Chef extends Employee {

	public void cook() {
		System.out.println(super.getName() + " id cooking.");
	}
}
