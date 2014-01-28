'''
Lattice paths
Problem 15
Starting in the top left corner of a 2×2 grid, and only being able to move to
the right and down, there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
'''

__author__ = 'SUN'

if __name__ == '__main__':
    res = 1
    for i in range(1, 21):
        res = res * (41 - i) // i
    print(res)