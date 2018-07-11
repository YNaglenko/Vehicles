package Model;

public abstract class CVehicle {
	private int att; // широта
	private int lon; // долгота
	private int speed; // скорость
	private double price; // цена
	private int yearAssembled; // год выпуска
	private int curID; // счетчикID ТС(текущий)
	private static int id = 0;

	public CVehicle () {
		curID = ++id;
	}

	public CVehicle(int att, int lon, int speed, double price, int yearAssembled) {
		this.att = att;
		this.lon = lon;
		this.speed = speed;
		this.price = price;
		this.yearAssembled = yearAssembled;
		this.curID = ++id;

	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		CVehicle.id = 0;
	}

	public int getAttitude() {
		return att;
	}

	public void setAttitude(int attitude) {
		this.att = attitude;
	}

	public int getLongtitude() {
		return lon;
	}

	public void setLongtitude(int longtitude) {
		this.lon = longtitude;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearAssembled() {
		return yearAssembled;
	}

	public void setYearAssembled(int yearAssembled) {
		this.yearAssembled = yearAssembled;
	}

	public void Move(int att, int lon, int speed) {
		this.setAttitude(att);
		this.setLongtitude(lon);
		this.setSpeed(speed);
	}

	public int getCurID() {
		return curID;
	}

	public CVehicle createVehicle(int type, int att, int lon, int speed, double price, int yearAssembled) {
		CVehicle res = null;
		switch (type) {
		case 1:
			res = new CPlane();
			break;
		case 2:
			res = new CCar();
			break;
		case 3:
			res = new CShip();
			break;
		default: 
			res = new CCar();

		}
		res.setAttitude(att);
		res.setLongtitude(lon);
		res.setSpeed(speed);
		res.setPrice(price);
		res.setYearAssembled(yearAssembled);
		return res;

	}

	@Override
	public String toString() {
		return "CVehicle [att=" + att + ", lon=" + lon + ", speed=" + speed + ", price=" + price + ", yearAssembled="
				+ yearAssembled + ", curID=" + curID + "]";
	}

}
