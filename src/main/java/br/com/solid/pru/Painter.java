package br.com.solid.pru;

public class Painter extends Employee {

	public void paint() {
		System.out.println(super.getName() + " is painting.");
	}
}
