__author__ = 'SUN'

def distinct_prime_number(n):
    cnt = 0
    start = 2
    end = int(n ** 0.5)
    while start <= end:
        if n % start == 0:
            cnt += 1
            while n % start == 0:
                n //= start
        start += 1
        end = int(n ** 0.5)
    if n > 1:
        cnt += 1
    return cnt

if __name__ == '__main__':
    i = 2
    while not distinct_prime_number(i) == distinct_prime_number(i + 1) == distinct_prime_number(i + 2) == distinct_prime_number(i + 3) == 4:
        i += 1
    print(i)