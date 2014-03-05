'''
(prime-k) factorial
Problem 381
For a prime p let S(p) = (∑(p-k)!) mod(p) for 1 ≤ k ≤ 5.

For example, if p=7,
(7-1)! + (7-2)! + (7-3)! + (7-4)! + (7-5)! = 6! + 5! + 4! + 3! + 2! = 720+120+24+6+2 = 872.
As 872 mod(7) = 4, S(7) = 4.

It can be verified that ∑S(p) = 480 for 5 ≤ p < 100.

Find ∑S(p) for 5 ≤ p < 10^8.
'''

__date__ = '14-3-5'
__author__ = 'SUN'

def factorial(n):
    f = 1
    for k in range(2, n + 1):
        f *= k
    return f

def s(p):
    #return (factorial(p - 1) + factorial(p - 2) + factorial(p - 3) + factorial(p - 4) + factorial(p - 5)) % p
    return 9 * factorial(p - 5) % p

if __name__ == '__main__':
    print(s(7))
    res = sum(s(x) for x in range(5, 100))
    print(res)