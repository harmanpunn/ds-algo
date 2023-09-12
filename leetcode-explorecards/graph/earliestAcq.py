from typing import List
class UnionFind:
    def __init__(self, size) -> None:
        self.root = [i for i in range(size)]

    def find(self, x):
        return self.root[x]
    
    def union(self, x, y):
        rootX = self.find(x)
        rootY = self.find(y)

        if rootX != rootY:
            for i in range(len(self.root)):
                if self.root[i] == rootY:
                    self.root[i] = rootX

    def connected(self, x, y):
        return self.find(x) == self.find(y)
    
    def root_length(self):
        return len(set(self.root))
    

def earliestAcq(logs: List[List[int]], n: int) -> int:
    logs = sorted(logs, key = lambda x: x[0])

    uf = UnionFind(n)

    for log in logs:
        if not uf.connected(log[1], log[2]):
            uf.union(log[1], log[2])
            print(log[0], uf.root_length())
        else:
            print(log)
            

        if uf.root_length() == 1:
            return log[0]
    return -1
    

logs = [[20190101,0,1],[20190104,3,4],[20190107,2,3],[20190211,1,5],[20190224,2,4],[20190301,0,3],[20190312,1,2],[20190322,4,5]]
n = 6

print(earliestAcq(logs,n))
