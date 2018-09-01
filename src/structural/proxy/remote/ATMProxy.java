package structural.proxy.remote;

import java.util.List;

public class ATMProxy implements IATMMachine {
  
  private IATMMachine atmMachine;
  
  public ATMProxy(IATMMachine atmMachine) {
    this.atmMachine = atmMachine;
  }

  @Override
  public ATMState getATMState() {
    return this.atmMachine.getATMState();
  }

  @Override
  public long getCashInMachine() {
    return this.atmMachine.getCashInMachine();
  }

  @Override
  public List<String> getLastTransactions() {
    return null;
  }

}
