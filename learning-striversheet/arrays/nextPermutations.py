store = []
flag = False
def permute(a, l, r, inp, flag):
    if l == r:
        print( a)
        if flag:
            print(a)
            return a
        if a == inp:
            flag = True
    else:
        for i in range(l, r):
            a[l], a[i] =  a[i], a[l]
            permute(a, l+1, r, inp, flag)
            a[l], a[i] =  a[i], a[l]

def reverseSegment(inp, start):
    i = start
    j = len(inp) - 1
    while i < j:
        inp[i], inp[j] = inp[j], inp[i]
        i+=1
        j-=1



def nextPermutation(inp):
    i = len(inp) - 2 
    while i>=0 and inp[i+1] <= inp[i]:
        i-=1
    if i >= 0:
        j = len(inp) - 1
        while inp[j] <= inp[i]:
            j-=1
        inp[j], inp[i] = inp[i], inp[j]

    reverseSegment(inp, i+1)                

inp = [1,3,2]
nextPermutation(inp)
print(inp)