package br.com.solid.pru;

import br.com.solid.isp.Hired;

public class Gardner extends Employee implements Hired {

	public void prune() {
		System.out.println(super.getName() + "is pruning.");
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
