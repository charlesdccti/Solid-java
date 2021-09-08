package br.com.solid.pru;

import br.com.solid.isp.Hired;

public class Chef extends Employee implements Hired {

	public void cook() {
		System.out.println(super.getName() + " id cooking.");
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
