package com.nttdata.oops.abstraction;

public class Car  implements Vehicle {

	@Override
	public void startVehicle() {
		System.out.println(" car started ");
		
	}

	@Override
	public void stopVehicle() {
		System.out.println(" car stopped ");
		
	}
	
	void gpsTracker()
	{
		System.out.println(" enabled only for car owner ");
	}

	

}
