
public class Golf implements Sport{

	String objectName;
	String equipment;
	String location;
	
	public Golf() {
		
	}
	
	public Golf(String objectName, String equipment, String location) {
		this.objectName = objectName;
		this.equipment = equipment;
		this.location = location;
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
}
