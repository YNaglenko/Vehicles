package Helper;

import java.util.Comparator;
import Model.CVehicle;



	class VehicleSortbySpeed implements Comparator<CVehicle> {

		public int compare(CVehicle v1, CVehicle v2) {
			return v1.getSpeed() - v2.getSpeed();
		}
	}

	class VehicleSortbyPrice implements Comparator<CVehicle> {
		public int compare(CVehicle v1, CVehicle v2) {
			return (int) (v1.getPrice() - v2.getPrice());

		}
	}

	class VehicleSortbyYear implements Comparator<CVehicle> {
		public int compare(CVehicle v1, CVehicle v2) {
			return v1.getYearAssembled() - v2.getYearAssembled();

		}
	}
