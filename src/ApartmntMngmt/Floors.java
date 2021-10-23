package ApartmntMngmt;

public abstract class Floors {
	String FloorName;
	String NumOfFlats;
	public String getFloorName() {
		return FloorName;
	}
	public void setFloorName(String floorName) {
		FloorName = floorName;
	}
	public String getNumOfFlats() {
		return NumOfFlats;
	}
	public void setNumOfFlats(String numOfFlats) {
		NumOfFlats = numOfFlats;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	String description;

}
