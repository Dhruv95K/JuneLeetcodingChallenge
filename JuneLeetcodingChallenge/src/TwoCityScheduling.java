import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoCityScheduling {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[][] costs = new int[n][2];
		String[] input ;
		
		for(int i = 0;i<n;i++) {
			input = br.readLine().split(",");
			costs[i][0] = Integer.parseInt(input[0]);
			costs[i][1] = Integer.parseInt(input[1]);
		}
		
		System.out.println(twoCitySchedCost(costs));
	}
	
	public static int twoCitySchedCost(int[][] costs) {
        int cost = 0;
        int n = costs.length;
        
        for(int i = 0;i<n;i++)
        	cost += costs[i][0];
        
        int[] diff = new int[n];
        
        for(int i = 0;i<n;i++)
        	diff[i] = costs[i][1] - costs[i][0];
        
        Arrays.sort(diff);
        
        for(int i = 0;i<n/2;i++)
        	cost += diff[i];
        
        return cost;
    }
	 

}
