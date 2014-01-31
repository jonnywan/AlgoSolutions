__author__ = 'SUN'

if __name__ == '__main__':
    res, m, n = 0, 0, 0
    for i in range(1, int(2000000 ** 0.5)):
        for j in range(i, int(2000000 ** 0.5)):
            s = i * (i + 1) * j * (j + 1) // 4
            if abs(res - 2000000) > abs(s - 2000000):
                res, m, n = s, i, j
    print("m = ", m, ", n = ", n, ", solution = ", res)