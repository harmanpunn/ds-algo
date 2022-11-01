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

    def earliestAcq(self, logs: List[List[int]], n: int) -> int:
        self.root = [i for i in range(n)]
        # print(self.root)
        
        logs_sorted = sorted(logs, key=lambda x: x[0])
        print(logs_sorted)
        
        for log in logs_sorted:
            self.union(log[1], log[2])
            
            if len(set(self.root)) == 1:
                return log[0]
            
            # print(log[0], log[1], log[2])
            
        return -1   
            
        
        
        
        
        
        
        