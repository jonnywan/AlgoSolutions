__author__ = 'SUN'

def sum_square_diff(start, end):
    total = 0
    for i in range(start, end):
        for j in range(i + 1, end + 1):
            total += i * j
    total *= 2
    return total

def sum1(start, end):
    total = 0
    for i in range(start, end + 1):
        total += i * i
    return total

def sum2(start, end):
    return end * end * (end + 1) * (end + 1) // 4 - \
           start * start * (start - 1) * (start - 1) // 4

def sum_square_diff_1(start, end):
    return sum2(start, end) - sum1(start, end)

if __name__ == '__main__':
    print(sum_square_diff_1(1, 100))
    print(sum_square_diff(1, 100))