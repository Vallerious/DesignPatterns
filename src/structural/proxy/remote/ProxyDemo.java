package structural.proxy.remote;

/**
 * Client
 * 
 * Remote proxy example.
 * We are leaving the safe bounds of our application, i.e. sending a object to another system.
 * We have to protect it!
 * 
 * @author valerivaleriev
 *
 */
public class ProxyDemo {

  public static void main(String[] args) {
    // We can create instances only in the current package, the client cannot
    IATMMachine machine = new ATMMachine();
    
    // We can do that on our safe machines
    machine.getLastTransactions();
    
    // But for the client we will send a proxy
    IATMMachine machineProxy = new ATMProxy(machine);
    
    // Illegal!
    // machineProxy.getLastTransactions();
    
    machineProxy.getATMState();
  }

}
