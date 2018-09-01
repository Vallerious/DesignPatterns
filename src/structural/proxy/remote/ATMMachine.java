package structural.proxy.remote;

import java.util.List;

class ATMMachine implements IATMMachine {
  
  private ATMState atmState;
  
  private long totalMoney;
  
  private List<String> lastTransactions;
  
  protected ATMMachine() {}

  @Override
  public ATMState getATMState() {
    return this.atmState;
  }

  @Override
  public long getCashInMachine() {
    return this.totalMoney;
  }

  public List<String> getLastTransactions() {
    return lastTransactions;
  }

  public void setLastTransactions(List<String> lastTransactions) {
    /* WOW that is potentially dangerous to be exposed to the client... */
    this.lastTransactions = lastTransactions;
  }

}
