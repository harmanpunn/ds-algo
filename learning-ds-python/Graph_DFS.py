from re import L


class Graph:
    def __init__(self, V) -> None:
        self.V = V # Number of vertices
        self.adj = [[] for i in range(V)]
        self.vis = [False for i in range(self.V)]
        self.pre = [[] for i in range(V)]
        self.post = [[] for i in range(V)]

    def addEdge(self, v, w):
        self.adj[v].append(w) # Adding an edge 
        # self.adj[w].append(v)

    def explore(self, root):
        count = 0
        stack = []
        visited = [False for _ in range(self.V)]
        popped = [False for _ in range(self.V)]

        stack.append(root)

        while len(stack):
            # print('stack', stack)
            el = stack[-1]
            # print("el", el, "visit:", visited[el], 'count:',count)
            # curr = stack.pop()
            if not visited[el]:
                print(el, end=' ')
                visited[el] = True
                count+=1
                self.pre[el] = count
                # print('pre', self.pre)

                for node in self.adj[el]:
                    if not visited[node]:
                        # visited[node] = True
                        stack.append(node)   
            else:
                if not popped[el]:
                    count+=1
                    self.post[el] = count
                    popped[el] = True    
                # print('post', self.post)
                stack.pop()
                           
    def previsit(self):
        print('pre', self.pre)

    def postvisit(self):
        print('post', self.post)


    def explore_rec(self, root):
        self.vis[root] = True
        print(root, end=' ')
        
        for node in self.adj[root]:
            if not self.vis[node]:
                self.explore_rec(node)


    def firstUnique(self,s):
        count = dict()
        for i in range(len(s)):
            count[s[i]] = count.get(s[i], 0) + 1
            # print(count)

        for i in range(len(s)):
            if count.get(s[i]) == 1:
                return i    
        return 0

    def minAndMax(self,matrix, res):
        s = set()
        for i in range(0, len(matrix), 1):
            min_r = -9999999
            for j in range(0, len(matrix[i]), 1):
                min_r = max(min_r, matrix[i][j])
            s.add(min_r)
    
        for j in range(0, len(matrix[0]), 1):
            min_c = 9999999
            for i in range(0, len(matrix), 1):
                min_c = min(min_c, matrix[i][j])

            if (min_c in s):
                res.append(min_c)
    
        return res    

    
        
mat = [[1,2],[3,4]]
ans = []



g = Graph(8); # Total 5 vertices in graph
# print(g.firstUnique("statistics"))
print(g.minAndMax(mat, ans))
print('ans:', ans)
g.addEdge(0, 5)


g.addEdge(0, 1)

g.addEdge(1, 4)
g.addEdge(1, 2)

g.addEdge(2, 3)

g.addEdge(3, 7)
g.addEdge(3, 1)

g.addEdge(4, 6)
g.addEdge(4, 3)


g.addEdge(5, 6)
g.addEdge(5, 4)

g.addEdge(6, 5)
g.addEdge(7, 6)



# g.addEdge('C', 'D');
# g.addEdge('D', 'H');
# g.addEdge('H', 'G');
# g.addEdge('D', 'B');
# g.addEdge('E', 'D');
# g.addEdge('B', 'E');
# g.addEdge('G', 'F');
# g.addEdge('F', 'G');
# g.addEdge('F', 'E');
# g.addEdge('A', 'F');
# g.addEdge('E', 'G');




# g.explore(0)
# print('\n')
# g.previsit()
# print('\n')
# g.postvisit()
# g.explore_rec(0)