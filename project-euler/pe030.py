__author__ = 'SUN'

if __name__ == '__main__':
    res = 0
    for i in range(2, 1000000):
        digitSum = 0
        j = i
        while j > 0:
            digitSum += (j % 10) ** 5
            j //= 10
        if digitSum == i:
            res += i
    print(res)
