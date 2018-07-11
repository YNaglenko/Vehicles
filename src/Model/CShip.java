package Model;

public class CShip extends CVehicle implements iCanSwim {
	private String Port;
	public CShip() {
    	super();
    	
    }
	public CShip(int att, int lon, int speed, double price, int yearAssembled, String Port) {
		super(att, lon, speed, price, yearAssembled);
		setPort(Port);
	}

public String getPort() {
	return Port;
}

public void setPort(String port) {
	Port = port;
}
@Override
public String toString() {
	return "CShip [Port=" + Port + "," + super.toString() + "]";
}
@Override
public double getSwim() {
	// TODO Auto-generated method stub
	return this.getSpeed()*0.99;
}
}
