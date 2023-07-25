class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        adjLst = collections.defaultdict(list)

        for edge in edges:
            x = edge[0]
            y = edge[1]
            adjLst[x].append(y)
            adjLst[y].append(x)
        
        visited = [False for i in range(n)]

        queue = []
        queue.append(source)
        visited[source] = True
        if source == destination:
            return True
        while len(queue) != 0:
            curr = queue[0]
            queue.pop(0)
            
            for i in range(len(adjLst[curr])):
                if not visited[adjLst[curr][i]]:
                    queue.append(adjLst[curr][i])
                    visited[adjLst[curr][i]] = True
                    
                    if adjLst[curr][i] == destination:
                        return True
        return False             
        