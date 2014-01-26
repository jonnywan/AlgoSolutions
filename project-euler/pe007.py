'''
10001st prime
Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
'''
__author__ = 'SUN'

if __name__ == '__main__':
    prime = [True] * 200000
    prime[0] = prime[1] = False
    for i in range(2, (int)(200000 ** 0.5)):
        if prime[i]:
            j = i * i;
            while j < 200000:
                prime[j] = False
                j += i;
    cnt = 0;
    for i in range(200000):
        if prime[i]:
            cnt += 1
        if cnt == 10001:
            print(i)
            break