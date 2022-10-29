class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int temp = n;
        while(true){
            int sum=0;
            while(n!=0){
                int s = n%10;
                sum += s*s;
                n/=10;
            }
            if(sum==1){
                return true;
            }else{
                if(set.contains(sum)){
                    return false;
                }else{
                    set.add(sum);
                    n = sum;
                }
            }
        }
    }
}
