package br.com.solid.pru;

import br.com.solid.isp.Hired;
import br.com.solid.isp.Traceble;

public class Driver extends Employee implements Hired, Traceble {

	public void drive() {
		System.out.println(super.getName() + " is driving");
	}
	
	public void drive(String vehicle) {
		System.out.println(super.getName() + " is driving a "+ vehicle);
	}

	@Override
	public void setProfit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getProfit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCurrentLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCurrentLocation() {
		// TODO Auto-generated method stub
		
	}
}
