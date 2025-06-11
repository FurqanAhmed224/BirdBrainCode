Idea: 
// a way for the robot to sensor if the ball goes in the cup, moves randomly to another position
// if the finch is shaking, means the ball is in the cup, if it dosent shake, stay at that position                         
// if the finch shakes, the finch should move to a random spot

```java
public class cupPongGame{
	public static void main(String[] args){
	Finch f = new Finch();

	System.out.println("Shake the Finch when the ball goes into the cup")

	while(!f.isShaking()) { // while the finch dosent shake, pause it
		f.pause(10);
	}
	System.out.println("Shake detected, Finch should move now" ); //while the finch does shake, start the movement
		f.setMotors(100,100);
		f.pause(1000);
		f.stop();

		//Generate random turn direction
		String direction = "L"; // If less then 0.5, should turn left
		if(Math.random() > 0.5){ 
		   direction = "R"; // if greater then 0.5, should turn right
		}

		
		//Generate random turn angle
		int turnAngle = (int)(Math.random() * 360) + 1;

		// turn randomly
		f.setTurn(direction , turnAngle, 100);
		f.stop();

		//Move forward after turning
		int moveDistance = (int) (Math.random() * 1000) + 500;
		f.setMotors(80,80);
		f.pause(moveDistance);
		f.stop();
		
	}
		
}
```



