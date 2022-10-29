class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] arr = strs[0].toCharArray();
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        int i = 0,ans = Integer.MAX_VALUE;
        for (int j = 1;j < strs.length;j++){
            for (int k = 0;k < Math.min(strs[j].length(),arr.length);k++){
                if(strs[j].charAt(k) == arr[k]){
                    i++;
                }
                else{
                    break;
                }
            }
            if(i < ans){
                ans = i;
            }
            i = 0;
        }
        String res = "";
        for (int j = 0;j < ans;j++){
            res += arr[j];
        }
        return res;
    }
}
