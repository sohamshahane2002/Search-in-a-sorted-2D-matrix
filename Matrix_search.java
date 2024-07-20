//BruteForce Solution
package MatrixSearch;
import java.util.*;
public class Matrix_search {
    public static boolean search(ArrayList<ArrayList<Integer>> matrix, int target){
        int n = matrix.size();
        int m = matrix.get(0).size();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ;j++){
                if(matrix.get(i).get(j)==target){
                    return true;
                }
            }
        }return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        boolean result = search(matrix, 5);
        System.out.println(result ? "true" : "false");
    } 
}
