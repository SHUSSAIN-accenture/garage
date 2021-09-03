package garage_ex;

public class Motorbike extends Vehicle {

	private boolean helmet;
	private boolean compartment;
	
	public Motorbike(String name, int year, boolean fWD, int iD, boolean helmet, boolean compartment) {
		super(name, year, fWD, iD);
		this.helmet = helmet;
		this.compartment = compartment;
	}


	public boolean isHelmet() {
		return helmet;
	}


	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}


	public boolean isCompartment() {
		return compartment;
	}


	public void setCompartment(boolean compartment) {
		this.compartment = compartment;
	}


	@Override
	public float bill() {
		// TODO Auto-generated method stub
		float totalbill = 0;
		if (helmet == true) {
			totalbill += 30;
		}
		
		if (compartment == true) {
			totalbill += 50;
		}
		return totalbill;
	}
	
	
	
}
