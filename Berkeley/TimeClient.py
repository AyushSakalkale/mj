import time, socket, random
from datetime import datetime

HOST = input("Enter server IP: ")
PORT = 9999

c = socket.socket()
c.connect((HOST, PORT))

while True:
    local = time.time() + random.uniform(-5, 5)
    c.send(str(local).encode())
    
    diff = float(c.recv(1024).decode())
    new = local + diff
    
    print("Local Time: ", datetime.fromtimestamp(local).strftime("%H:%M:%S"))
    print("Adjusted Time: ", datetime.fromtimestamp(new).strftime("%H:%M:%S"))
    print("\n")
    
    time.sleep(5)

# // 18 19 20 Implement clock synchronization with Berkeley algorithm with time daemon
# server using two physical machines.


# sudo apt update
# sudo apt install python3
# hostname -I
# ip addr show | grep "inet "
# localhost 
#  127.0.0.1

# disable firewall
# sudo ufw disable or sudo ufw allow 9999


# java -version
# Install Java (if needed):

# bash
# # For Ubuntu/Debian
# sudo apt update
# sudo apt install default-jdk