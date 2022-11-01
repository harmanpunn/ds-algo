class Solution:
    
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
    
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        
        self.root = [i for i in range(n)]
        
        for e in edges: 
            if not self.connected(e[0], e[1]):
                self.union(e[0], e[1])
            else: 
                return False
            
        print('root:',self.root)
        
        return all(v == self.root[0] for v in self.root) 
        
        