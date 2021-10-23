package ApartmntMngmt.iterator;

import ApartmntMngmt.FloorPlan;

public class FloorMenuIterator implements Iterator {
	FloorPlan[] floorMenu;
	int position;
	
	public FloorMenuIterator(FloorPlan[] floorMenu) {
		this.floorMenu = floorMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > floorMenu.length || floorMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public FloorPlan next() {
		
		FloorPlan productMenuPos = (FloorPlan) floorMenu[position];
		position = position +1;
		
		return productMenuPos;
	}

}


	