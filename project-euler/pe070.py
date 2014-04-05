"""
Totient permutation
Problem 70
Euler's Totient function, φ(n) [sometimes called the phi function], is used to
determine the number of positive numbers less than or equal to n which are
relatively prime to n. For example, as 1, 2, 4, 5, 7, and 8, are all less than
nine and relatively prime to nine, φ(9)=6.
The number 1 is considered to be relatively prime to every positive number, so
φ(1)=1.

Interestingly, φ(87109)=79180, and it can be seen that 87109 is a permutation
of 79180.

Find the value of n, 1 < n < 10^7, for which φ(n) is a permutation of n and the
ratio n/φ(n) produces a minimum.
"""
__date__ = '14-4-5'
__author__ = 'SUN'

def totient(n):
    phi = 1
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            while n % i == 0:
                phi *= i
                n //= i
            phi = phi // i * (i - 1)
    if n > 1:
        phi *= n - 1
    return phi

if __name__ == '__main__':
    print(totient(87109))
    print(sorted(str(87109)) == sorted(str(totient(87109))))