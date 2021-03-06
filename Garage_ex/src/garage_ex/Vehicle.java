package garage_ex;

public abstract class Vehicle {

	private String name;
	private int year;
	private boolean FWD;
	
	public int ID;

	public Vehicle(String name, int year, boolean fWD, int iD) {
		super();
		this.name = name;
		this.year = year;
		FWD = fWD;
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isFWD() {
		return FWD;
	}

	public void setFWD(boolean fWD) {
		FWD = fWD;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
	public abstract float bill();
}
