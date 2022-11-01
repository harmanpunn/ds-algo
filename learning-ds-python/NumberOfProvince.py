from collections import defaultdict
class Solution:
    
    def find(self, x):
        if x == self.root[x]:
            return x
        self.root[x] = self.find(self.root[x])
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
    
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        rows = len(isConnected)
        cols = len(isConnected[0])
        graph = defaultdict(list)
        for r in range(0,rows):
            for c in range(0, cols):
                if r!=c and isConnected[r][c] == 1:
                    graph[r].append(c)
                    
        # print('graph:', graph)   
        self.root = [i for i in range(rows)]
        # self.rank = [1] * rows
        
        for key,val in graph.items():
            for v in val:
                self.union(key, v)
                
        return len(set(self.root))  
                
                
                
                