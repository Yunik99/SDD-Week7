
public class mainProgram {

	public static void main(String[] args) {
		
		BallSport ballAry[] = new BallSport[2];
		MotorSport motorAry[]	= new MotorSport[2];
		RacketSports racketAry[] = new RacketSports[2];
		Golf golfAry[] = new Golf[2];
		
		ballAry[0] = new BallSport("Football", "Net,Ball", "Pitch", 2, 11, 90);                  
		ballAry[1] = new BallSport("Rugby", "Goal,Ball", "Pitch", 2, 15, 90);
		
		motorAry[0] = new MotorSport("Formula 1", "CAR", "TRACK", 11, 2, 70);          
		motorAry[1] = new MotorSport("Moto GP", "Motorcycle", "TRACK", 13, 3, 80);
		
		racketAry[0] = new RacketSports("Tennis", "Racket","Court", 40);
		racketAry[1] = new RacketSports("Badminton", "Racket","Court", 30);
		
		golfAry[0] = new Golf("GOLF", "GOLF CLUBS", "COURSES");
		
		
		for(int i = 0; i< 2; i++) {
			System.out.println("The sport is "+ballAry[i].objectName+" and the equiment is "+ ballAry[i].equipment+". It is played in a "+ballAry[i].location+" with "+ballAry[i].numberOfTeams+ " teams and "+ballAry[i].playersPerTeam+" per team."+"The time limit is "+ballAry[i].timeLimit);
		}
	}

}
