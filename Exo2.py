def to_root(n):
    low = min(1,n)
    high = max(1,n)
    while low *low * 100 < n :
        low *= 10
    while high *high * 0.01 > n :
        high *= 0.1
    for i in range(100):
        mid = (high + low)/2
        if (mid *mid == n):
            return mid
        if (mid *mid > n) :
            high = mid
        else:
            low = mid
    return int(mid)
print(to_root(15))