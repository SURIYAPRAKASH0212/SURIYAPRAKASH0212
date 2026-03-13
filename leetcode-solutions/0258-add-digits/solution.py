class Solution(object):
    def addDigits(self, num):
        if num<0:
            num=abs(num)
        if num==0:
            num=0
        while num>=10:
            sum=0
            while num!=0:
                sum+=num%10
                num/=10
            num=sum
        return num
