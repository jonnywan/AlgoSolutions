__author__ = 'SUN'

'''
A palindromic number reads the same both ways. The largest palindrome made from
the product of two 2-digit numbers is 9009 = 91 * 99.

Find the largest palindrome made from the product of two 3-digit numbers.
'''
def is_palindrome(x):
    rev, temp = 0, x
    while temp != 0:
        last_digit = temp % 10
        rev = 10 * rev + last_digit
        temp //= 10
    return rev == x

def is_palindrome_1(x):
    return str(x) == str(x)[::-1]

def find_max_palindrome(min, max):
    max_palindrome = 0
    for i in range(min, max + 1):
        for j in range(i + 1, max + 1):
            product = i * j
            if product > max_palindrome and str(product) == str(product)[::-1]:
                max_palindrome = product
    return max_palindrome

def find_max_palindrome_1(min, max):
    max_palindrome = 0
    i = 999
    while i > 99:
        j = 999
        while j >= i:
            product = i * j
            if product > max_palindrome and str(product) == str(product)[::-1]:
                max_palindrome = product
            j -= 1
        i -= 1
    return max_palindrome

if __name__ == '__main__':
    print(find_max_palindrome(100, 999))