package tipoftheday.tip2;

public class StringUtils {

  public int countValid(String source){
    if(source == null)
      return -1;
    return source.trim().length();
  }
}
