ip=input("Enter a IP:")
dic={
    "A":("1.0.0.0-126.255.255.255","255.0.0.0"),
    "B":("128.0.0.0-191.255.255.255","255.255.0.0"),
    "C":("191.0.0.0-223.255.255.255","255.255.255.0"),
    "D":("224.0.0.0-239.255.255.255","Multicasting Address"),
    "E":("240.0.0.0-254.255.255.255","Experimental")
}
f=ip.split('.')
c=int(f[0])

if(c<=126):
    print(dic["A"])
elif(c=="127"):
    print("Loop back address")
elif(c<=191):
    print(dic["B"])
elif(c<=223):
    print(dic["C"])
elif(c<=239):
    print(dic["D"])
elif(c<=254):
    print(dic["E"])
else:
    print("Invalid IP")
