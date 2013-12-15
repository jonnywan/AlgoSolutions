__author__ = 'SUN'

'''
A palindromic number reads the same both ways. The largest palindrome made from
the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
'''

def is_palindrome(x):
    rev, temp = 0, x
    while temp != 0:
        last_digit = temp % 10
        rev = 10 * rev + last_digit
        temp //= 10
    return rev == x

if __name__ == '__main__':
    max_palindrome = 0
    for i in range(100,1000):
        for j in range(i, 1000):
            if is_palindrome(i * j) and i * j > max_palindrome:
                max_palindrome = i * j
    print(max_palindrome)

for i in range(1, 100):
    print("11 *", i, "=", 11 * i)