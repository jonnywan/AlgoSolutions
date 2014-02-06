__author__ = 'SUN'

if __name__ == '__main__':
    N = 1000
    ways = [0] * (N + 1)
    ways[0] = 1
    for i in range(N):
        for j in range(i + 1, N + 1):
            ways[j] += ways[j - i - 1]
    for i in range(1, len(ways)):
        print('ways[', i, '] = ', ways[i])