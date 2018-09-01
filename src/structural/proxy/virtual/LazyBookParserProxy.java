package structural.proxy.virtual;

/**
 * Virtual Proxy (with Caching)
 * 
 * @author valerivaleriev
 *
 */
public class LazyBookParserProxy implements IBookParser {

  private IBookParser bookParser = null;
  
  private String book;
  
  public LazyBookParserProxy(String book) {
    this.book = book;
  }

  @Override
  public long getNumPages() {
    if (this.bookParser == null) {
      this.bookParser = new BookParser(this.book);
    }
    
    return this.bookParser.getNumPages();
  }
  
}
