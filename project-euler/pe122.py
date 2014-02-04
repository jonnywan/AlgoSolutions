# not completed!

__author__ = 'SUN'

if __name__ == '__main__':
    cnt = 0
    for i in range(10000):
        if i % 2 != 0 and i % 3 != 0:
            cnt += 1
            print(i)
    print("cnt = ", cnt)