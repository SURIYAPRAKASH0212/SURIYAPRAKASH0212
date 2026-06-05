class Solution(object):
    def isPalindrome(self, x):
        n=x
        rev=0
        while n>0:
            digit=n%10
            rev=rev*10+digit
            n//=10
        if rev==x and rev>=0:
            return True
        else:
            return False
