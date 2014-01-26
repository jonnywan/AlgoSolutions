__author__ = 'SUN'

if __name__ == '__main__':
    for a in range(1, 333):
        for b in range(a + 1, 500):
            c = 1000 - a - b
            if a ** 2 + b ** 2 == c ** 2:
                print("a = ", a, ", b = ", b, ", c = ", c)
                print(a * b * c)