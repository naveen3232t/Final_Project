package ApartmntMngmt.state;

import java.util.Scanner;


public class MainMenuStatus implements State {

	@Override
	public void status(Context context) {
Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("--------Apartment Office Management System-----\n" + 
		"1) Apartment Management \n" + 
		"2) Log Out\n");
		
		System.out.print("");

		int userInpt = usrInpt.nextInt();
		
		if(userInpt ==1) {
			ViewApartmntPlanState viewTickets = new ViewApartmntPlanState();
			viewTickets.status(context);
		}
		
		
		else {
			System.exit(0);
		}
	context.setState(this);
	}

	@Override
	public void manageStaff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cleaning() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gardening() {
		// TODO Auto-generated method stub
		
	}
		
}


