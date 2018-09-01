package structural.proxy.virtual;

/**
 * Client
 * 
 * Virtual proxy pattern.
 * 
 * We are using the proxy pattern to implement caching.
 * 
 * @author valerivaleriev
 *
 */
public class VirtualProxyDemo {
  
  public static void main(String[] args) {
    IBookParser parser = new LazyBookParserProxy("my book - once upon a beer...");
    
    System.out.println("Slow the first time...");
    System.out.println(parser.getNumPages());
    System.out.println("Fast the second time...");
    System.out.println(parser.getNumPages());
  }
  
}
