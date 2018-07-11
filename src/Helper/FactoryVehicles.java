package Helper;

import Model.Amphibia;
import Model.BatMobile;
import Model.CCar;
import Model.CPlane;
import Model.CShip;
import Model.CVehicle;

public class FactoryVehicles extends AbstractFactoryVehicles {
   final static int COUNT_OF_VEHICLE_TYPE = 5;


public CVehicle randVehicle() {
	
	return getVehicle ((int)(Math.random()*COUNT_OF_VEHICLE_TYPE));
}


public  CVehicle getVehicle(int n) {
	switch (n) {
	case 0: return new CCar(2, 3, 180, 7500, 2018);
	case 1: return new CShip(3,5,50,250000,2017,"Kiev");
	case 2: return new CPlane(0,0,870,350000,2015,0,320);
	case 3: return new BatMobile (0,0,550, 100000, 2021,0);
	case 4: return new Amphibia (0,0,230, 950000, 2018);
	default: return null;
	}
	
	
}
 
}


