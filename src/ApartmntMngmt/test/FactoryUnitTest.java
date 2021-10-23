package ApartmntMngmt.test;

import ApartmntMngmt.*;
import ApartmntMngmt.factory.MenuFactory;
import ApartmntMngmt.state.Context;

public class FactoryUnitTest {
	public static void main(String[] args) {
		Context context = new Context();
		MenuFactory testFactory = new MenuFactory();
		testFactory.chooseMenu();

}
}
