package structural.proxy.virtual;

/**
 * Real subject
 * 
 * @author valerivaleriev
 *
 */
public class BookParser implements IBookParser {
  
  private String parsedBook = "";
  
  public BookParser(String book) {
    for (int i = 0; i < 10000; i++) {
      this.parsedBook += book;
    }
  }

  @Override
  public long getNumPages() {
    return this.parsedBook.length();
  }

}
