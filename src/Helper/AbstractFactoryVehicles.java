package Helper;

import Model.CVehicle;

public abstract class AbstractFactoryVehicles {
	public abstract CVehicle randVehicle() ;
	public abstract CVehicle getVehicle(int n) ;
}
