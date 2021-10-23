package ApartmntMngmt.main;

import ApartmntMngmt.state.Context;
import ApartmntMngmt.state.MainMenuStatus;

public class Home {
	public static void main(String[] args) {
		Context context = new Context();
		
		MainMenuStatus startUp = new MainMenuStatus();
		startUp.status(context);
	}

}
