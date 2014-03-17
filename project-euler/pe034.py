'''
Digit factorials
Problem 34
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: as 1! = 1 and 2! = 2 are not sums thetemp are not included.
'''
__date__ = '14-3-17'
__author__ = 'SUN'

def factorial(k):
    f = 1
    for i in range(10, k + 1):
        f *= i
    return f

if __name__ == '__main__':
    n = 1
    f9 = factorial(9)
    while n * f9 >= 10 ** n - 1:
        n += 1
    res = 0
    for x in range(10, 10000000):
        s = 0
        temp = x
        while temp > 0:
            s += factorial(temp % 10)
            temp //= 10
        if s == x:
            print(x)
            res += s
    print(res)