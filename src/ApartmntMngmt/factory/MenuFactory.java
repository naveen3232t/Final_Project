package ApartmntMngmt.factory;

import java.util.Scanner;

import ApartmntMngmt.iterator.FloorMenu;
import ApartmntMngmt.iterator.LeaseMenu;
import ApartmntMngmt.iterator.PrintFloorPlan;
import ApartmntMngmt.state.Context;
import ApartmntMngmt.state.MainMenuStatus;
import ApartmntMngmt.state.ServiceStates;

public class MenuFactory {
	public void chooseMenu() {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) New Lease Office and Floors Plan Menu\n"+
		
		"2) Apartment Management\n"+

		"3) Home Screen" );
		
		
		int menuChoice = usrInpt.nextInt();
		if(menuChoice ==1) {
			LeaseMenu leaseMenu = new LeaseMenu();
			leaseMenu.leaseOffice();
			
			FloorMenu floormenu = new FloorMenu();
			PrintFloorPlan prntpmnu = new PrintFloorPlan(floormenu);
			
			prntpmnu.printMenu();
		}
			if(menuChoice ==2) {
			
			ServiceStates states = new ServiceStates();

			System.out.println(states);
			states.manageStaff();
			System.out.println(states);
			states.cleaning();
			System.out.println(states);
			states.gardening();
			System.out.println(states);

				
		}
			
			
		
		else {
			Context context = new Context();
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.status(context);
		}
		Context context = new Context();
		
		
	}
	}










