package ApartmntMngmt.state;

public class ServiceStates {
	State newState;
	State manageStaffState;
	State gardeningState;
	State cleaningState;
	
	State state;

	public ServiceStates() {
		newState= new NewState(this);
		manageStaffState = new ManageStaffState(this);
		gardeningState = new GardeningState(this);
		cleaningState = new CleaningState(this);
		state = newState ;
	}
	
	public void manageStaff() {
		state.manageStaff();
	}
	public void cleaning() {
		state.cleaning();
	}
	public void gardening() {
		state.gardening();
	}
	
	
	
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public State getNewState() {
		return newState;
	}
	public State getManageStaffState() {
		return manageStaffState;
	}
	public State getGardeningState() {
		return gardeningState;
	}
	public State getcleaningState() {
		return cleaningState;
	}
	

	
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("---- Apartment Management ------");

		result.append("\nManagement is in " + state + "\n");

		return result.toString();
	}

}
