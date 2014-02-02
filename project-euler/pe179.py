'''
Consecutive positive divisors
Problem 179

Find the number of integers 1 < n < 10^7, for which n and n + 1 have the same
number of positive divisors. For example, 14 has the positive divisors 1, 2, 7,
14 while 15 has 1, 3, 5, 15.
'''

__author__ = 'SUN'

if __name__ == '__main__':
    divisor = [2] * 10000001
    divisor[0], divisor[1] = 0, 1
    for i in range(2, int(10000001 ** 0.5) + 1):
        divisor[i * i] -= 1
        for j in range(i * i, 10000001, i):
            divisor[j] += 2
    res = 0
    for i in range(2, 10000000):
        if divisor[i] == divisor[i + 1]:
            res += 1
    print(res)