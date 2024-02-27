def binary_addition():
    a = input("enter the first binary number \n")
    b = input("enter the second binary number \n")
    while len(a) != len(b):
        if len(a) > len(b):
            b=b[::-1]
            b+="0"
            b=b[::-1]
        elif len(a) < len(b):
            a=a[::-1]
            a+="0"
            a=a[::-1]
    max = len(a)
    c=0
    result= ""
    for i in range(max-1,-1,-1):
        if int(a[i]) + int(b[i]) +c ==0:
            result += "0"
            c = 0
        elif int(a[i]) + int(b[i]) + c == 1:
            result += "1"
            c=0
        elif int(a[i]) + int(b[i]) + c == 2:
            result += "0"
            c = 1
        elif int(a[i]) + int(b[i]) + c == 3:
            result += "1"
            c = 1
    result =result [::-1]
    return result
print(binary_addition ())