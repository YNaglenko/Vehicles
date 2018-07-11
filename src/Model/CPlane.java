package Model;

public class CPlane extends CVehicle implements iCanFly {
	private int height; // высота
	private int qntypass; // кол-во пассажиров
	
	public CPlane() {
	  super();
  }
	
	public CPlane(int att, int lon, int speed, double price, int yearAssembled, int height, int qntypass) {
		super(att, lon, speed, price, yearAssembled);
		setHeight(height);
		setQntypass(qntypass);
	}


public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getQntypass() {
	return qntypass;
}
public void setQntypass(int qntypass) {
	this.qntypass = qntypass;
}

public void Move (int att, int lon, int speed, int height) {
	 this.setAttitude(att);
	 this.setLongtitude(lon);
	 this.setSpeed(speed);
	 this.setHeight(height);}
 
@Override
public String toString() {
	return "CPlane [height=" + height + ", qntypass=" + qntypass + ", " + super.toString() + "]";
}

@Override
public double getFly() {
	
	return this.getSpeed()*1.3;
}


}
