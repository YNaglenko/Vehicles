package Model;

public class BatMobile extends CVehicle implements iCanRide, iCanSwim, iCanFly  {
	@Override
	public String toString() {
		return "BatMobile [" + super.toString() + "]";
	}

	private int height;
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public BatMobile () {
		super();
	}
	
	public BatMobile(int att, int lon, int speed, double price, int yearAssembled, int height ) {
		super(att, lon, speed, price, yearAssembled);
	    setHeight(height);
	}
	@Override
	public double getFly() {
		return this.getSpeed()*1.5;
		 
	}

	@Override
	public double getSwim() {
		return this.getSpeed()*0.85;
		
	}

	@Override
	public double getRide() {
		return this.getSpeed()+2;
		
	}

}
