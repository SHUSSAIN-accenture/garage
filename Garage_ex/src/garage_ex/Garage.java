package garage_ex;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> garage1 = new ArrayList<>();
	
	public void addtogarage(Vehicle vehicle6) {
		garage1.add(vehicle6);
		System.out.println("New Vehicle added: " + vehicle6.getName());
	}
	
	public void removefromgarage(Vehicle vehicle6) {
		int ID = vehicle6.getID();
		garage1.remove(ID);
	}
	
	public void billcalculator() {
	
		for (Vehicle vehicle7 : garage1) {
			System.out.println("Bill: " + vehicle7.bill());
		}

			


}
	
}
