class Solution:
    def dilema(self, time) -> int:
        c = [0] * 60
        res = 0
        for t in time:
            print('val:', c[-t % 60] )
            res = res + c[-t % 60]
            c[t % 60] += 1
        return res


s = Solution()
# songs = [148,397,434,801,866,293,914,516,139,610,927]
songs = [60,60,60]

print(s.dilema(songs))
