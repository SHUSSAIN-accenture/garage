package garage_ex;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> garage1 = new ArrayList<>();
	
	public void addtogarage(Vehicle vehicle6) {
		garage1.add(vehicle6);
		System.out.println("New Vehicle added: " + vehicle6.getName());
	}
	
	public void removefromgarage(int ID, Vehicle vehicle6) {
		
		if (ID == vehicle6.getID()) {
			System.out.println("Vehicle removed:" + vehicle6.getName());
			garage1.remove(ID);
		}
		else {
			System.out.println("ID (" + ID + ") entered does not match Vehicle ID (" + vehicle6.getID() + ")");
		}
		
	}
	
	public void billcalculator(Vehicle vehicle7) {
	
			System.out.println("Bill: " + vehicle7.bill());
			
	}
	
}
