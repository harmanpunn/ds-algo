# Given an array of intervals, merge all the overlapping intervals and return an array of non-overlapping intervals.

intervals = [[1,3],[2,6],[8,10],[15,18]]

def mergeIntervals(intervals):
    out = []
    intervals.sort(key = lambda x:x[0])
    out.append(intervals[0])

    for interval in intervals[1:]:
        os, oe = out[-1][0], out[-1][1]
        start, end = interval

        if oe >= start:
            out[-1][1] = max(oe, end)

        else:
            out.append(interval)

    return out            

print(mergeIntervals(intervals))    