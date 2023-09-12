from typing import List
class UnionFind:
    def __init__(self,size):
        self.root = [i for i in range(size)]
        self.rank = [1] * size

    def find(self, x):
        if x == self.root[x]:
            return x
        self.root[x] = self.find(self.root[x])
        return self.root[x]

    def union(self, x, y):
        rootX = self.find(x)
        rootY = self.find(y)
        if rootX != rootY:
            if self.rank[rootX] > self.rank[rootY]:
                self.root[rootY] = rootX
            if self.rank[rootX] < self.rank[rootY]:      
                self.root[rootX] = rootY
            else:
                self.root[rootY] = rootX
                self.rank[rootX] += 1 
    
    def root_length(self):
        return len(set(self.root))

def findCircleNum(isConnected: List[List[int]]) -> int:
    rows = len(isConnected)
    cols = len(isConnected[0])

    uf = UnionFind(rows)

    for i in range(rows):
        for j in range(cols):
            if i != j and isConnected[i][j] == 1:
                uf.union(i,j)
    
    return uf.root_length()



isConnected = [[1,1,0],[1,1,0],[0,1,1]]
print(findCircleNum(isConnected))