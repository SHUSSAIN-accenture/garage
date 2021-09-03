package garage_ex;

public class Car extends Vehicle {

	private int doors;
	private boolean tinted;
	
	
	public Car(String name, int year, boolean fWD, int iD, int doors, boolean tinted) {
		super(name, year, fWD, iD);
		this.doors = doors;
		this.tinted = tinted;
	}
	
	

	public int getDoors() {
		return doors;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	public boolean isTinted() {
		return tinted;
	}



	public void setTinted(boolean tinted) {
		this.tinted = tinted;
	}



	@Override
	public float bill() {
		// TODO Auto-generated method stub
		float cost = 0;
		cost += (doors * 50);
		if (tinted == true) {
			cost += 100;
		}
		else {
			cost += 20;
		}
		return cost;
	}

}
