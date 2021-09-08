package br.com.solid.pru;

import br.com.solid.isp.Hired;

public class Painter extends Employee implements Hired {

	public void paint() {
		System.out.println(super.getName() + " is painting.");
	}

	@Override
	public void setProfit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getProfit() {
		// TODO Auto-generated method stub
		
	}
}
