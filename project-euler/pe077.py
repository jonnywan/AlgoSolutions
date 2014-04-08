"""
Prime summations
Problem 77
It is possible to write ten as the sum of primes in exactly five different
ways:

7 + 3
5 + 5
5 + 3 + 2
3 + 3 + 2 + 2
2 + 2 + 2 + 2 + 2

What is the first value which can be written as the sum of primes in over five
thousand different ways?
"""
__date__ = '14-4-8'
__author__ = 'SUN'

def prime_array(n):
    is_prime = [True] * (n + 1)
    is_prime[0] = is_prime[1] = False
    for i in range(2, int(n ** 0.5) + 1):
        if is_prime[i]:
            for j in range(i ** 2, n + 1, i):
                is_prime[j] = False
    prime = []
    for x in is_prime:
        if x:
            prime.append(x)
    return prime

def ways_of_prime(n):
    ways = [0] * (n + 1)
    ways[0] = 1
    coins = prime_array(n)
    for coin in coins:
        for i in range(coin, n + 1):
            ways[i] += ways[i - coin]
    return ways[n]

if __name__ == '__main__':
    print(ways_of_prime(10))