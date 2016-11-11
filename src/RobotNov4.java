import java.util.Random;
import java.util.concurrent.Callable;

public class RobotNov4 implements Callable<byte[]> {
	
	private final int sleepTime;
	private final String taskName;
	private final static Random generator = new Random();
	
	//constructor
	public RobotNov4(String name){
		taskName = name;
		sleepTime = generator.nextInt(5000);//milliseconds
		// ====================main function here==================
		//
		JavaRobot robot = new JavaRobot();// Angels type variable		
		robot.moveTo(0.0,100.0);
		
	}
	
	public byte[] call(){
		try{
			System.out.printf("%s is going to sleep for %d milliseconds.", taskName, sleepTime);
			Thread.sleep(sleepTime);
			byte[] command = {1,2,3,4};
			return command;
		}catch(InterruptedException exception){
			System.out.printf("%s %s\n", taskName, " terminated prematurely due to interruption.");
			return null;
		}//end catch
	}
	
}
