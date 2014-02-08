'''
Digit factorial chains
Problem 74

The number 145 is well known for the property that the sum of the factorial of
its digits is equal to 145:

1! + 4! + 5! = 1 + 24 + 120 = 145

Perhaps less well known is 169, in that it produces the longest chain of numbers
that link back to 169; it turns out that there are only three such loops that
exist:

      169 → 363601 → 1454 → 169
      871 → 45361 → 871
      872 → 45362 → 872

It is not difficult to prove that EVERY starting number will eventually get
stuck in a loop. For example,

      69 → 363600 → 1454 → 169 → 363601 (→ 1454)
      78 → 45360 → 871 → 45361 (→ 871)
      540 → 145 (→ 145)

Starting with 69 produces a chain of five non-repeating terms, but the longest
non-repeating chain with a starting number below one million is sixty terms.

How many chains, with a starting number below one million, contain exactly sixty
non-repeating terms?
'''
__author__ = 'SUN'

factorial = [1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880]

def next_number(n):
    res = 0
    while n != 0:
        res += factorial[n % 10]
        n //= 10
    return res

if __name__ == '__main__':
    chains = [0] * 1000000
    res = 0
    for i in range(1000000):
        if chains[i] == 0:
            chain = []
            cnt = 0
            nxt = next_number(i)
            while nxt != i:
                cnt += 1
                chain.append(nxt)
                nxt = next_number(nxt)
            if cnt == 60:
                res += len(chain)
            if len(chain) > 0:
                for j in chain:
                    chains[j] = cnt
    print(res)