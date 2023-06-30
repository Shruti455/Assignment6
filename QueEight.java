import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class QueEight {
      public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int r1 = mat1.length, c1 = mat1[0].length, c2 = mat2[0].length;
        int[][] res = new int[r1][c2];
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < r1; ++i) {
            for (int j = 0; j < c1; ++j) {
                if (mat1[i][j] != 0) {
                    mp.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                }
            }
        }
        for (int i = 0; i < r1; ++i) {
            for (int j = 0; j < c2; ++j) {
                if (mp.containsKey(i)) {
                    for (int k : mp.get(i)) {
                        res[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [][] mat1 = { { 1 , 0 , 0 } , { -1 , 0 , 3 } , { 0 , 0 , 1} };   
        int [][] mat2 = { { 7 , 0 , 0 } , { -0 , 0 , 0 } , { 0 , 0 , 1} }; 
        System.out.println(java.util.Arrays.deepToString(multiply( mat1 , mat2 ))); 
    }
}
