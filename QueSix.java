import java.util.Arrays;
public class QueSix {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length, j = 0;
          if (n % 2 == 1) return new int[]{};
          int[] ans = new int[n / 2];
          int[] cnt = new int[200005];
          for (int x : changed) cnt[x] += 1;
          for (int i = 0; i < 200005; i++) {
              if (cnt[i] > 0) {
                  cnt[i] -= 1;
                  if (cnt[i * 2] > 0) {
                      cnt[i * 2] -= 1;
                      ans[j++] = i--;
                  } else {
                      return new int[]{};
                  }
              }
          }
          return ans;  
      } 
      public static void main(String[] args) {
        int [] changed = { 1 , 3 , 4 , 2 , 6 , 8};  
        System.out.println(Arrays.toString(findOriginalArray(changed))); 
    }
}
