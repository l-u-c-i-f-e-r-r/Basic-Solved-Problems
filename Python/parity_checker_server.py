import socket
s=socket.socket()
port=8800
s.bind(('localhost',port))
s.listen(5)
print("Waiting for connection....")
c,addr=s.accept()
print("Connected with",addr)
c.send("Thanks for connecting...".encode())
while(1):
    data=c.recv(1024).decode()
    if(data.count('1')%2==0):
        c.send("Accepted".encode())
    else:
        c.send("Rejected".encode())
    break
c.close()
s.close()