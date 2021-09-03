package garage_ex;

public class Garage_runner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle1 = new Car("Ferrari", 2010, false, 0, 2, true);
		Vehicle vehicle2 = new Motorbike("Yamaha", 2013, false, 1, false, true);
		
		Garage garage1 = new Garage();
		
		garage1.addtogarage(vehicle1);
		
		garage1.addtogarage(vehicle2);
		
		garage1.billcalculator(vehicle1);
		garage1.billcalculator(vehicle2);
		
		
		garage1.removefromgarage(1, vehicle1);
		garage1.removefromgarage(0 ,vehicle1);
	}
}
