'''
2520 is the smallest number that can be divided by each of the numbers from 1
to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20?
'''
__author__ = 'SUN'

def gcd(a, b):
    if b == 0:
        return  a
    else:
        return gcd(b, a % b)

def gcd_1(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def lcm_result(start, end):
    if start > end:
        start, end = end, start
    elif start == end:
        return start
    else:
        return lcm(start, lcm_result(start + 1, end))

if __name__ == '__main__':
    print(pow(2,4) * pow(3, 2) * 5 * 7 * 11 * 13 * 17 * 19)
    print(lcm_result(1, 20))