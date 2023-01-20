import socket
s=socket.socket()
s.connect(('localhost',8800))
while(1):
    msg=s.recv(1024).decode()
    print(msg)
    msg=str(input("Enter the message:"))
    s.send(msg.encode())
    msg=s.recv(1024).decode()
    print(msg)
    break
s.close()
