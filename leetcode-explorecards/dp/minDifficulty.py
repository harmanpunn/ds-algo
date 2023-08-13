from functools import lru_cache

def minDifficulty(jobDifficulty, d):
    n = len(jobDifficulty)

    if n < d:
        return -1

    hardest_rem_job = [0] * n
    hardest_job = 0

    for i in range(n - 1 , -1, -1):
        hardest_job = max(hardest_job, jobDifficulty[i])
        hardest_rem_job[i] = hardest_job

    @lru_cache(None)
    def dp(i,day):

        if day == d:
            return hardest_rem_job[i]

        hardest = 0
        best = float('inf')
        for j in range(i, n-(d-day)):
            hardest = max(hardest, jobDifficulty[j])
            best = min(best, hardest+dp(j+1, day+1) )

        return best
    return dp(0,1)


jobDifficulty = [7,1,7,1,7,1]
d = 3

print(minDifficulty(jobDifficulty, d))