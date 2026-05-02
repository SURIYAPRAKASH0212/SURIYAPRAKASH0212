class Solution(object):
    def countOperations(self, num1, num2):
        k = 0
        while num1 != 0 and num2 != 0:
            if num2 > num1:
                if num1 > 0:
                    a = num2 - num1
                    if a == 0:
                        k += 1
                        num2 -= num1
                    b1 = a / num1
                    b2 = math.ceil(b1)
                    k += b2
                    num2 -= (b2 * num1)
                else:
                    k += 1
                    num2 -= num1
            else:
                if num1 > 0:
                    a = num1 - num2
                    if a == 0:
                        k += 1
                        num1 -= num2
                    b1 = a / num2
                    b2 = math.ceil(b1)
                    k += b2
                    num1 -= (b2 * num2)
                else:
                    k += 1
                    num1 -= num2
        return int(k)
