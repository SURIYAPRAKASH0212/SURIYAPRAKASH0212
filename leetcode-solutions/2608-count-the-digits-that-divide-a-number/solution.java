class Solution {
    public int countDigits(int num) {
        int n=num,count=0,a=0;
        while(n!=0){
            a=n%10;
            if(num%a==0){
                count++;
            }
            n/=10;
        }
        return count;
    }
}
