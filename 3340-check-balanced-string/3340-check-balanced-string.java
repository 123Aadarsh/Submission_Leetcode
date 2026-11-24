class Solution {
    public boolean isBalanced(String s) {
        int n = s.length();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum1+=s.charAt(i)-'0';
            }
            else{
                sum2+=s.charAt(i)-'0';
            }
        }
        return (sum1==sum2);
    }
}