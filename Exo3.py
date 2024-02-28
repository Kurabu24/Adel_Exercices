def merge(nums1, m, nums2, n):
    m1, n1, p = m - 1, n - 1, m + n - 1
    while m1 >= 0 and n1 >= 0:
        if nums1[m1] > nums2[n1]:
            nums1[p] = nums1[m1]
            m1 -= 1
        else:
            nums1[p] = nums2[n1]
            n1 -= 1
        p -= 1
    while n1 >= 0:
        nums1[p] = nums2[n1]
        n1 -= 1
        p -= 1
    return nums1
print(merge([3,7,8,0,0], 3, [3,7], 2))
