
package sample;
import java.util.regex.*;

public class Sample {

    public static void main(String[] args) {
         final String input="-10+30-20+40+3-10+0";
    final Pattern p = Pattern.compile("[\\d-]\\d*");
    final Matcher m = p.matcher(input);
    while(m.find()){
      System.out.println(m.group());
        }
    }
    
}
