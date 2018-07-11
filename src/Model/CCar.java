package Model;

public class CCar extends CVehicle implements iCanRide {

   public CCar () {
		super();
	}
	public CCar(int att, int lon, int speed, double price, int yearAssembled) {
		
		super(att, lon, speed, price, yearAssembled);
		
		}
	@Override
	public String toString() {
		return "CCar [toString()=" + super.toString() + "]";
	}
	@Override
	public double getRide() {
		
		return this.getSpeed()+5;
	}
	
	

}
