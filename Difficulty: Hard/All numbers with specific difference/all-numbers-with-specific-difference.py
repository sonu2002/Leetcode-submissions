class Solution:
      def getCount(self, n, d):

        def ok(x, d):
            return x - sum(ord(c) - ord('0') for c in str(x)) >= d

        lo, hi = 1, n+1
        while lo < hi:
            mi = lo + (hi - lo) // 2 
            if ok(mi, d):
                hi = mi 
            else:
                lo = mi + 1
        return n - lo + 1
        # code here 
        
        