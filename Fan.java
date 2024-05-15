

/** 
	This class represents a ceiling fan
	@author Cameron Benoite 
*/

public class Fan{
	
	//starting speed = 0 therefore off
	private int speed;
	//starting direction = 0, clockwise
	private int direction;

	public Fan(int speedIn, int directionIn){
		speed = speedIn;
		direction = directionIn;
	}

	public String speedCord(){
		speed ++;
		if (speed == 4){
			speed = 0;
		}
		
		if (speed == 0){
			return "The fan is now off";
		}
		else if(speed == 1){
			return "The fan is on 1 speed. Low speed.";
		}
		else if(speed == 2){
			return "The fan is on 2 speed. Medium speed.";
		}
		else{
			return "The fan is on 3 speed. High speed.";
		}

	}

	public String directionCord(){
		direction++;
		if (direction == 2){
			direction = 0;
		}
		
		if(direction == 0){
			return "The fan is now spinning clockwise.";
		}
		else{
			return "The fan is now spinning counter-clockwise.";
		}

	}



}
