
public class MotorSport implements Sport, TeamSport {

	String objectName;
	String equipment;
	String location;
	int numberOfTeams;
	int playersPerTeam;
	int laps;
	
	public MotorSport() {
		
	}
	
	public MotorSport(String objectName, String equipment, String location, int numberOfTeams, int playersPerTeam, int laps) {
		this.objectName = objectName;
		this.equipment = equipment;
		this.location = location;
		this.numberOfTeams = numberOfTeams;
		this.playersPerTeam = playersPerTeam;
		this.laps = laps;
	}
	
	public int getNumberOfTeams() {
		return numberOfTeams;
	}
	public int getPlayersPerTeam() {
		return playersPerTeam;
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
	public int getNumberOfLaps() {
		return laps;
	}
}











