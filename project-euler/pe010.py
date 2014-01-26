'''
Summation of primes
Problem 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
'''
__author__ = 'SUN'

if __name__ == '__main__':
    prime = [True] * 2000000
    prime[0] = prime[1] = False
    for i in range(2, int(2000000 ** 0.5)):
        if prime[i]:
            for j in range(i * i, 2000000, i):
                prime[j] = False

    primeSum = 0
    for i in range(2000000):
        if prime[i]:
            primeSum += i
    print(primeSum)