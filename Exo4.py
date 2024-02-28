import string
def palindrum(S: str):
    # a letter is always a palindrum
    if len(S) <= 1:
        return True
    #get String in uppercase for a better treatmentof the string
    S = S.upper()
    #initialasing the new string with no non-alphaetic characters
    newS = ""
    for j in range(len(S)):
        if S[j]  in string.ascii_uppercase :
            newS += S[j]
    print(newS)
    #palindrum_tester :
    for i in range(len(newS)):
        if newS[i]!= newS[len(newS)-1 -i]:
            return False
    return True
print(palindrum(""))