
public class JavaRobot {

	Boolean botReady = false;
	RobotAngle targetAngle; 
	// Constructor with no value
	public JavaRobot() {
		this.targetAngle = new RobotAngle(0.0,0.0);
		this.setReady(true);
	}
	// Constructor with theta and phi
	public JavaRobot(double theta_in, double phi_in) {
		this.targetAngle = new RobotAngle(theta_in,phi_in);
		this.setReady(true);
	}


	void setReady(Boolean input) {
		this.botReady = input;
	}
	

	public void moveTo(double theta, double phi) {
		this.setReady(false);
		targetAngle.setTheta(theta);
		targetAngle.setPhi(phi);
	}

	public Boolean isCloseTo(RobotAngle otherAngle) {
		return (Math.abs(otherAngle.getTheta() - targetAngle.getTheta()) < 0.01)
				&& (Math.abs(otherAngle.getPhi() - targetAngle.getPhi()) < 0.01);
	}
	//Inner class of RobotAngle
	//contains yaw and pitch
	class RobotAngle{

		private double theta;
		private double phi;
		
		RobotAngle(double theta, double phi){
			this.theta=theta;
			this.phi=phi;
		}
		// basic void function set and get angle
		public void setTheta(double angle) {
			this.theta = angle;
		}

		public void setPhi(double angle) {
			this.phi = angle;
		}

		public double getTheta() {
			return this.theta;
		}

		public double getPhi() {
			return this.phi;
		}


	}
	//Inner class of Robot Position
	//contains X, Y and Z 
	class RobotPosition{
		private double X;
		private double Y;
		private double Z;
		private double[] robotposi = new double[3];
		RobotPosition(double X, double Y, double Z){
			this.X = X;
			this.Y = Y;
			this.Z = Z;
		}
		//basic void to set and get position
		public void setX(double position){
			this.X = position;
		}
		public void setY(double position){
			this.Y = position;
		}
		public void setZ(double position){
			this.Z = position;
		}
		public double[] getPosition(){
			this.robotposi[1] = X;
			this.robotposi[2] = Y;
			this.robotposi[3] = Z;
			return this.robotposi;
		}
	}
}
