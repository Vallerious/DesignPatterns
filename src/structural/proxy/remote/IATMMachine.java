package structural.proxy.remote;

import java.util.List;

/**
 * Real Subject
 * 
 * @author valerivaleriev
 *
 */
public interface IATMMachine {

  public ATMState getATMState();
  
  public long getCashInMachine();
  
  public List<String> getLastTransactions();

}
