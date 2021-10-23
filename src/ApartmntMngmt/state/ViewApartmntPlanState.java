package ApartmntMngmt.state;

import ApartmntMngmt.factory.MenuFactory;

public class ViewApartmntPlanState implements State{

	@Override
	public void status(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.chooseMenu();
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
