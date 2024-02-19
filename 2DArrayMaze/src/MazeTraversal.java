import java.util.Arrays;

public class MazeTraversal {
	
	
	//two dimensional array with outer array as block and inner array as which directions are possible
	final static int[][] maze = {{0,1,0,1}, {1,1,0,0}, {1,1,0,0}, {1,0,0,1}, 
			{0,1,1,0}, {1,1,0,0}, {1,0,0,1}, {0,0,1,1},
			{0,1,0,0}, {1,1,0,1}, {1,1,1,0}, {1,0,1,0},
			{0,1,0,0}, {1,1,1,0}, {1,1,0,0}, {1,0,0,0}};//Left, Right, Up, Down (1 is true 0 is false)
	
	
	public static void find(int location, int end, int[] visited) {
		boolean ends = true;
		int visit[] = new int[16];
		visit = visited.clone();
		visit[location]=1; 
		if (location == end) {
			ends = false;
			for (int i=0; i <visit.length; i++) {
				if(i%4==0) {
					System.out.println();
				}
				System.out.print(visit[i]);
			}
			System.out.println();
		}
		
		if (maze[location][0]==1 && visited[location-1]!=1) {
			find(location-1,end,visit); 
			ends = false;
			
		}
		
		if (maze[location][1]==1 && visited[location+1]!=1) {
			find(location+1,end,visit); 
			ends = false;
		}
		
		if (maze[location][3]==1 && visited[location+4]!=1) {
			find(location+4,end,visit); 
			ends = false;
		}
		
		if (maze[location][2]==1 && visited[location-4]!=1) {
			find(location-4,end,visit);
			ends = false;
		}
		if (ends) {
			for (int i=0; i <visit.length; i++) {
				if(i%4==0) {
					System.out.println();
				}
				System.out.print(visit[i]);
			}
			System.out.println();
			System.out.println("not valid");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		int visited[] = new int[16];
		int start = 0;
		int end = 15;
		
		find(start,end,visited);
		
	}

}
