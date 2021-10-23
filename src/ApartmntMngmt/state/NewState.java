package ApartmntMngmt.state;

public class NewState implements State {
	ServiceStates serviceStates;
	public NewState(ServiceStates serviceStates) {
		this.serviceStates = serviceStates;
	}
	
	@Override
	public void manageStaff() {
		System.out.println("Manage all the staff and schedule works to them");
		serviceStates.setState(serviceStates.getManageStaffState());


	}

	@Override
	public void cleaning() {
		System.out.println("assign cleaning work to the staff to clean all the floors");


	}

	@Override
	public void gardening() {
		
		System.out.println("assign gardening work daily to the staff");	

	}

	

	
	public String toString() {
		return " New state";
	}


	@Override
	public void status(Context context) {
		// TODO Auto-generated method stub
		
	}


	
}










