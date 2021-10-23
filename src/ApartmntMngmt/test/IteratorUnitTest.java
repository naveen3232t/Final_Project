package ApartmntMngmt.test;

import ApartmntMngmt.*;
import ApartmntMngmt.iterator.FloorMenu;
import ApartmntMngmt.iterator.Iterator;
public class IteratorUnitTest {
	public static void main(String[] args) {
		FloorMenu floorMenu = new FloorMenu();
		Iterator iterator = floorMenu.createIterator();
		if(iterator.hasNext()) {
			System.out.println("Valid Test has next Item");
		}
		else {
			System.err.println("Invalid Call to iterator hasNext");
		}
	}

}
