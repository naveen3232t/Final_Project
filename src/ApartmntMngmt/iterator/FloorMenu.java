package ApartmntMngmt.iterator;

import ApartmntMngmt.FirstFloor;
import ApartmntMngmt.FloorPlan;
import ApartmntMngmt.GroundFloor;
import ApartmntMngmt.SecondFloor;
import ApartmntMngmt.ThirdFloor;

public class FloorMenu {
	int numberOfItems = 0;
	FloorPlan[] floorMenu;
	
	public FloorMenu() {
		
		floorMenu = new FloorPlan[6];
		
		floorMenu[0] = new GroundFloor();
		floorMenu[1] = new FirstFloor();
		floorMenu[2] = new SecondFloor();
		floorMenu[3] = new ThirdFloor();
	}
	
	public Iterator createIterator() {
		return new FloorMenuIterator(floorMenu);
	}

}



