"""
Digit power sum
Problem 119
The number 512 is interesting because it is equal to the sum of its digits
raised to some power: 5 + 1 + 2 = 8, and 83 = 512. Another example of a number
with this property is 614656 = 284.

We shall define an to be the nth term of this sequence and insist that a number
must contain at least two digits to have a sum.

You are given that a2 = 512 and a10 = 614656.

Find a30.
"""
import time

__date__ = '14-4-23'
__author__ = 'SUN'

def digit_sum(n):
	s = 0
	while n > 0:
		s += n % 10
		n //= 10
	return s

def check(n):
	k = digit_sum(n)
	p = k
	if k == 1:
		return False
	while p < n:
		p *= k
	return p == n

if __name__ == '__main__':
	start = time.clock()
	count = 0
	i = 10
	while count < 30:
		if check(i):
			count += 1
			print('count = ', count, ', i = ', i, ', digitsum = ', digit_sum(i))
		i += 1
	print('Runtime is', time.clock() - start)