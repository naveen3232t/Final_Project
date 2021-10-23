package ApartmntMngmt.state;

public class ManageStaffState implements State {
	ServiceStates serviceStates;
	public ManageStaffState(ServiceStates serviceStates) {
		this.serviceStates = serviceStates;
	}
	
	@Override
	public void manageStaff() {
		System.out.println("Manage all the staff and schedule works to them");

	}

	@Override
	public void cleaning() {
		System.out.println("assign cleaning work to the staff to clean all the floors");
		serviceStates.setState(serviceStates.getcleaningState());


	}

	@Override
	public void gardening() {
		
		System.out.println("assign gardening work daily to the staff");	

	}

	

	
	public String toString() {
		return " manage staff state";
	}


	@Override
	public void status(Context context) {
		// TODO Auto-generated method stub
		
	}


	
}
