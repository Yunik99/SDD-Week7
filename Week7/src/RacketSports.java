
public class RacketSports implements Sport{

	String objectName;
	String equipment;
	String location;
	int scoreLimit;
	
	public RacketSports() {
		
	}
	
	public RacketSports(String objectName, String equipment, String location, int scoreLimit) {
		this.objectName = objectName;
		this.equipment = equipment;
		this.location = location;
		this.scoreLimit = scoreLimit;
	}
	public String getEquipment() {
		return equipment;
	}


	public String getName() {
		return objectName;
	}

	
	public String getLocation() {
		return location;
	}
	
	public int getScoreLimit() {
		return scoreLimit;
	}
}
