import java.rmi.*;
import java.rmi.server.*;

public class AdditionImpl extends UnicastRemoteObject implements Addition {
    public AdditionImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        System.out.println("Client request received: " + a + " and " + b);
        return a + b;
    }
}

// Step 1: Find the Server's IP Address
// On the machine you want to use as the Server, open the terminal and find its
// local IP address.

// On Mac/Linux: ipconfig getifaddr en0 or hostname -I
// Step 2: Commands for MACHINE A (SERVER)
// Compile all files:
// bash
// javac *.java
// Start the RMI Registry (in a separate terminal or background):
// bash
// rmiregistry
// Run the Server (You MUST set the java.rmi.server.hostname property so the
// client knows how to connect back):
// bash
// java -Djava.rmi.server.hostname=192.168.1.10

// Step 3: Commands for MACHINE B (CLIENT)
// Copy the compiled .class files from the Server to the Client machine (at
// least Subtract.class and SubtractClient.class).
// Compile (if you copied .java files):
// bash
// javac *.java
// Run the Client (Provide the Server's IP address):
// bash
// java SubtractClient 192.168.1.10

//
// sudo ufw disable
//
// sudo ufw disable