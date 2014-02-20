'''
A polynomial modulo the square of a prime
Problem 457
Let f(n) = n^2 - 3n - 1.
Let p be a prime.
Let R(p) be the smallest positive integer n such that f(n) mod p^2 = 0 if such
an integer n exists, otherwise R(p) = 0.

Let SR(L) be ∑R(p) for all primes not exceeding L.

Find SR(10^7).
'''

__date__ = '14-2-20'
__author__ = 'SUN'

if __name__ == '__main__':
    N = 10000000
    prime = [True] * (N + 1)
    prime[0] = prime[1] = False
    for i in range(2, int(N ** 0.5) + 1):
        if prime[i]:
            for j in range(i ** 2, N + 1, i):
                prime[j] = False

    sr = [0] * (N + 1)
    for i in range(1, N + 1):
        ii = i ** 2 - 3 * i - 1
        for j in range(1, int(ii ** 0.5) + 1):
            if sr[j] == 0 and ii % j ** 2 == 0:
                sr[j] = i

    res = 0
    for i in range(1, N + 1):
        if