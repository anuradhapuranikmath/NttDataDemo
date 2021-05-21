package com.nttdata.Nestedclasses;

import com.nttdata.oops.abstraction.Vehicle;

public class Client {

	public static void main(String[] args) {
		
		
		CredictCard credictCard=new CredictCard(123,345);
		/*CredictCard.User user=credictCard.new User();// object creation of inner class using outer class 
		 
*/		/*CredictCard.User user=new CredictCard.User();*/
		
		credictCard.print();
		
		
		Vehicle vehicle=new Vehicle() {
			
			@Override
			public void stopVehicle() {
			
				System.out.println(" vehicle started");
				
			}
			
			@Override
			public void startVehicle() {
				System.out.println( "vehicle stopped");
			}
		};
		
		vehicle.startVehicle();
		vehicle.stopVehicle();

	
	
	
	
	Vehicle vehicle1=new Vehicle() {
		
		@Override
		public void stopVehicle() {
		
			System.out.println(" vehicle started 2 ");
			
		}
		
		@Override
		public void startVehicle() {
			System.out.println( "vehicle stopped 2");
		}
	};
	
	vehicle1.startVehicle();
	vehicle1.stopVehicle();
	
	
	Greet greet =new Greet() {
		
		@Override
		public void greeting() {
		System.out.println(" welcome ");
			
		}
	};
greet.greeting();
}

}
