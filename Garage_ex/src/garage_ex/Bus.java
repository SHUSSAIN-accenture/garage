package garage_ex;

public class Bus extends Vehicle {

	private boolean schoolbus;
	private int seats;
	
	
	
	public Bus(String name, int year, boolean fWD, int iD, boolean schoolbus, int seats) {
		super(name, year, fWD, iD);
		this.schoolbus = schoolbus;
		this.seats = seats;
	}
	
	



	public boolean isSchoolbus() {
		return schoolbus;
	}





	public void setSchoolbus(boolean schoolbus) {
		this.schoolbus = schoolbus;
	}





	public int getSeats() {
		return seats;
	}





	public void setSeats(int seats) {
		this.seats = seats;
	}





	@Override
	public float bill() {
		float totalbill = 0;

		if (schoolbus == true) {
			totalbill += 500;
		}
		else {
			totalbill += 5000;
		}
		
		if (seats > 100) {
			totalbill += seats * 100;
		}
		else {
			totalbill += seats * 25;
		}
		
		return totalbill;
	}
	
}
