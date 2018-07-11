package Model;

public class Amphibia extends CVehicle  implements iCanRide, iCanSwim {
     
	@Override
	public String toString() {
		return "Amphibia [=" + super.toString() + "]";
	}

	public Amphibia () {
		super();
	}
	
	public Amphibia(int att, int lon, int speed, double price, int yearAssembled) {
		super(att, lon, speed, price, yearAssembled);
		
	}
	public double getSwim() {
		
		return this.getSpeed()/10;
	}

	@Override
	public double getRide() {
		return this.getSpeed()*0.85;
	
	}
  
	
	
  
  
}
