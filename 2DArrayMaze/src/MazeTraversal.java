import java.util.Arrays;

public class MazeTraversal {
	
	
	//two dimensional array with outer array as block and inner array as which directions are possible
	final static int[][] maze = {{0,1,0,1}, {1,1,0,0}, {1,1,0,0}, {1,0,0,1}, 
			{0,1,1,0}, {1,1,0,0}, {1,0,0,1}, {0,0,1,1},
			{0,1,0,0}, {1,1,0,1}, {1,1,1,0}, {1,0,1,0},
			{0,1,0,0}, {1,1,1,0}, {1,1,0,0}, {1,0,0,0}};//Left, Right, Up, Down (1 is true 0 is false)
	
	public static boolean left(int location) {
		if (maze[location][0]==1) {
			return true;
		}else {
			return false;
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
	
	public static void find(int location, int end, int[] visited) {
		int visit[] = new int[21];
		visit = visited.clone();
		visit[location]=1; 
		if (location == end) {
			System.out.println(Arrays.toString(visit));
		}
		
		if (left(location) && visited[location-1]!=1) {
			find(location-1,end,visit); 
		}
		
		if (right(location) && visited[location+1]!=1) {
			find(location+1,end,visit); 
		}
		
		if (down(location) && visited[location+4]!=1) {
			find(location+4,end,visit); 
		}
		
		if (up(location) && visited[location-4]!=1) {
			find(location-4,end,visit); 
		}
		
		//System.out.println(Arrays.toString(visited) + "not possible");
	}
	
	
	
	public static void main(String[] args) {
		
		int visited[] = new int[16];
		int start = 0;
		int end = 15;
		
		find(start,end,visited);
		
		
		

	}

}
