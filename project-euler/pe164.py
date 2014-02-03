'''
Problem 164

How many 20 digit numbers n(without any leading zero) exist such that no three
consecutive digits of n have a sum greater than 9?
'''
__author__ = 'SUN'

if __name__ == '__main__':
    cnt = 0
    for i in range(10 ** 20, 10 ** 21):
        for j in range(17):
            