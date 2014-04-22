"""
Pandigital Fibonacci ends
Problem 104
The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
It turns out that F541, which contains 113 digits, is the first Fibonacci
number for which the last nine digits are 1-9 pandigital (contain all the
digits 1 to 9, but not necessarily in order). And F2749, which contains 575
digits, is the first Fibonacci number for which the first nine digits are 1-9
pandigital.

Given that Fk is the first Fibonacci number for which the first nine digits
AND the last nine digits are 1-9 pandigital, find k.
__date__ = '14-4-22'
__author__ = 'SUN'
"""
import time


def is_pandigital(n):
	return sorted(str(n)) == ['1', '2', '3', '4', '5', '6', '7', '8', '9']

if __name__ == '__main__':
	start = time.clock()
	k = 2
	f1 = 1
	f2 = 1
	while True:
		if is_pandigital(f2 % 1000000000):
			t = k * 0.20898764024997873 - 0.3494850021680094
			if is_pandigital(10 ** (t - int(t) + 8)):
				print(k)
				print(f2)
		k += 1
		f1, f2 = f2, f1 + f2
	print('Runtime is', time.clock() - start)