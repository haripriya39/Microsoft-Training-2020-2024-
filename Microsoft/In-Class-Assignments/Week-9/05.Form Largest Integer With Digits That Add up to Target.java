class Solution {
    public String largestNumber(int[] cost, int target) {
        
        int len = cost.length;
        String dp[][] = new String[len + 1][target + 1];
        
        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= target; j++) {
                
                if (i == 0 || j == 0) {
                    dp[i][j] = "";
                    continue;
                }
                
                String old = dp[i - 1][j];
                String s = "";
                
                if (j >= cost[i - 1]) {
                    int newj = j - cost[i - 1];
                    if (dp[i][newj].equals("") && newj > 0)
                        s = "";
                    else
                        s = s + String.valueOf(i) + dp[i][newj];
                }
                if (s.length() == old.length())
                    dp[i][j] = s.compareTo(old) > 0 ? s : old;
                if (s.length() != old.length())
                    dp[i][j] = s.length() > old.length() ? s : old;
            }
        }
        return dp[len][target].equals("") ? "0" : dp[len][target];
    }
}
