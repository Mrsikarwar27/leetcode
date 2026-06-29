class Solution {
    public boolean isPalindrome(int x) {
        int num = x, rem_num =0;
        while(num>0){
            rem_num =rem_num*10 + num%10;
            num =num/10;
        }
        return rem_num==x;
    }
}
