package ApartmntMngmt.iterator;

import ApartmntMngmt.FloorPlan;

public class PrintFloorPlan {
	FloorMenu floorMenu;
	FloorPlan floorPlan;
	
	public PrintFloorPlan(FloorMenu floorMenu) {
		this.floorMenu = floorMenu;
	}
	
	public void printMenu() {
		Iterator iterateFloorMenu = floorMenu.createIterator();
		printMenu(iterateFloorMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------Floor Management MENU-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			  FloorPlan  floorPlan= (FloorPlan) iterator.next();
			  
			  System.out.print(floorPlan.getFloorName() + "\t");
			  System.out.print(floorPlan.getNumOfFlats()+"\t");
			  System.out.print(floorPlan.getMaintainance()+"\t");

			  System.out.println(floorPlan.getDescription()+"\t");


			
		}
		 
	}
}






