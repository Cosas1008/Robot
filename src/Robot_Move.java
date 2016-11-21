
public class Robot_Move {
	
	public Robot_Move(int[] tool, int theta, int phi){
		
		//Parameters
		//Header part 
		//Head = [89 69 82 67 32 00 104 00 03 01 00 00 00 00 00 00 57 57 57 57 57 57 57 57]; 
		int[] head = {89,69,82,67,32,00,104,00,03,01,00,00,00,00,00,00,57,57,57,57,57,57,57,57};
		//Sub-header part
		int[] Suh = {138,00,03,00,01,02,00,00};
		//Setting( Speed Coordinate)
		private int speed = 10;
		int[] Setting_rect = {1,0,1,speed*10,17};  
		// Setting of Speed to 1 mm/s and Cartesian Robot coordinate(17)
		int[] Setting_ang  = {1, 0, 2, speed*10, 19};   
		// Setting of Speed to 1 degree/s and Cartesian Tool coordinate(19)
		// Tool(Tool_no Form X Y Z Tx Ty Tz)
		int[] Reserv  =   {0};
		int[] ToolNo  =   {tool[1]};
		int[] Type    =   {tool[2]};
		int[] Ex      =   {0};
		int[] Coor    =   {1};
		int[] Ext     =   {0,0,0,0,0,0,0,0,0,0};
		////
		//Check whether there are placement first
		//if there are changes in placement, the function will stop after change the
		//placement rather than move angular, you would have to call the function
		//again
	}
	//Move to the place first
	public void moveToXYZ(){
		
	}
	public void moveAngle(int theta, int phi){
		
		//Set pitch to 0
		//Set yaw to theta
		//Set pitch to phi
	
	}
	
}
