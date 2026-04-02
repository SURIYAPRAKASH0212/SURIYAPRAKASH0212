class Solution(object):
    def sumOfTheDigitsOfHarshadNumber(self, x):
        sum_number=0
        temp=x
        while temp>0:
            sum_number+=temp%10
            temp//=10
        if x%sum_number==0:
            return sum_number
        return -1
