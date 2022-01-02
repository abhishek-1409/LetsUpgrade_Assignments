import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int [] flowers = new int [n];
        for(int i=0; i<n; i++){
            flowers[i] = kb.nextInt();
        }
        System.out.println(getMinimumCost(flowers,k));
    }
    static int getMinimumCost(int [] c, int k){
        Arrays.sort(c);
        int cost = 0;
        for(int i=c.length-1; i>=0; i--){
            cost += (((c.length-1-i)/k)+1)*c[i];
        }
        return cost;
    }
}
