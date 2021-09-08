package br.com.solid.pru;

public class Gardner extends Employee {

	public void prune() {
		System.out.println(super.getName() + "is pruning.");
	}
}
