class Solution:
    def sumMatrix(self, n, q):
        if(q>n*2):
            return 0
        return n-abs(n+1-q)
