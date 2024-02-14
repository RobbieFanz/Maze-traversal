public class MazeTraversal {
	
	
	//two dimensional array with outer array as block and inner array as which directions are possible
	final static int[][] maze = {{0,1,0,1}, {1,1,0,0}, {1,1,0,0}, {1,0,0,1}, 
			{0,1,1,0}, {1,1,0,0}, {1,0,0,1}, {0,0,1,1},
			{0,1,0,0}, {1,1,0,1}, {1,1,1,0}, {1,0,1,0},
			{0,1,0,0}, {1,1,1,0}, {1,1,0,0}, {1,0,0,0}};//Left, Right, Up, Down (1 is true 0 is false)
	
	public static int left(int location) {
		if (maze[location][0]==1) {
			return (location-1);
		}else {
			return location;
		}
	}
	public static boolean right(int location) {
		if (maze[location][1]==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean up(int location) {
		if (maze[location][2]==1) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean down(int location) {
		if (maze[location][3]==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String find(int start, int end, int[] visited, int[][] maze) {
		if (up(start)) {
			
		}
	}
	
	public static void main(String[] args) {
		
		
		
		int start = 0;
		int end = 15;
		
		
		

	}

}
