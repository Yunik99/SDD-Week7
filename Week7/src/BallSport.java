
public class BallSport implements Sport, TeamSport {

	String objectName;
	String equipment;
	String location;
	int numberOfTeams;
	int playersPerTeam;
	int timeLimit;

	public BallSport() {
		
	}
	
	public BallSport(String objectName, String equipment, String location, int numberOfTeams, int playersPerTeam, int timeLimit) {
		this.objectName = objectName;
		this.equipment = equipment;
		this.location = location;
		this.numberOfTeams = numberOfTeams;
		this.playersPerTeam = playersPerTeam;
		this.timeLimit = timeLimit;
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
	
	public int getTimeLimit() {
		return timeLimit;
	}

}
