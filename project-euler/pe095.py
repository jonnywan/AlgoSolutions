'''
Amicable chains
Problem 95

The proper divisors of a number are all the divisors excluding the number itself.
For example, the proper divisors of 28 are 1, 2, 4, 7, and 14. As the sum of
these divisors is equal to 28, we call it a perfect number.

Interestingly the sum of the proper divisors of 220 is 284 and the sum of the
proper divisors of 284 is 220, forming a chain of two numbers. For this reason,
220 and 284 are called an amicable pair.

Perhaps less well known are longer chains. For example, starting with 12496, we
form a chain of five numbers:

12496 → 14288 → 15472 → 14536 → 14264 (→ 12496 → ...)

Since this chain returns to its starting point, it is called an amicable chain.

Find the smallest member of the longest amicable chain with no element exceeding
one million.
'''

__author__ = 'SUN'

def divisor_sum(n):
    s = 1
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            s += i + n // i
    if int(n ** 0.5) ** 2 == n:
        s -= int(n ** 0.5)
    return s

def chain(n):
    chains = []
    while not chains.__contains__(n):
        chains.append(n)
        n = divisor_sum(n)
        if n > 1000000:
            break
    return chains

if __name__ == '__main__':
    array = []
    for i in range(1000000):
        print(i)
        ch = chain(i)
        if len(array) < len(ch):
            array = ch
            print('array[0] = ', array[0])