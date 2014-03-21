'''
Integer right triangles
Problem 39
If p is the perimeter of a right angle triangle with integral length sides, {a,
b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised?
'''
import math
import time

__date__ = '14-3-21'
__author__ = 'SUN'

if __name__ == '__main__':
    start = time.clock()
    res = 0
    cnt = 0
    for k in range(12, 1001):
        n = 0
        for i in range(1, int(k * 0.3)):
            for j in range(int(k * (1 - math.sqrt(2) / 2)), k // 2):
                if i ** 2 + j ** 2 == (k - i - j) ** 2:
                    n += 1
                    print('k = ', k, ', a = ', i, ', b = ', j, ', c = ', k - i - j)
        if cnt < n:
            res = k
            cnt = n
    print('res = ', res, ', cnt = ', cnt)
    print('Runtime is ', time.clock() - start)