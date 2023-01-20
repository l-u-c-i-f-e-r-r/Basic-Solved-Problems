given_signal=input("Enter a signal: ")
def Stuffed(given_signal):
    arr=list(given_signal)
    for i in range(len(arr)-5):
        if(arr[i]=='1' and arr[i+1]=='1' and arr[i+2]=='1' and arr[i+3]=='1' and arr[i+4]=='1'):
            arr.insert(i+5,'0')
    return(''.join(arr))
def destuff(given_signal):
    arr=list(given_signal)
    for i in range(0,len(arr)-5,5):
        if(arr[i]=='1' and arr[i+1]=='1' and arr[i+2]=='1' and arr[i+3]=='1' and arr[i+4]=='1'):
            arr.pop(i+5)
    return(''.join(arr))
stuffed=Stuffed(given_signal)
print("Stuffed Signal:",stuffed)
destuffed=destuff(stuffed)
print("Destuffed Signal:",destuffed)