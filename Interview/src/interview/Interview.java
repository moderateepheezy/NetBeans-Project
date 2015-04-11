/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author simpumind
 */
public class Interview {

    public static String getLengthLongestString(String[] array)
  {
    int maxLength = 0;
    String longestString = null;
    for (String s : array)
    {
      if (s.length() > maxLength)
      {
        maxLength = s.length();
        longestString = s;
      }
    }
    return longestString;
  }
     public static String getSmallestString(String[] words)
  {
    if (words == null || words.length < 1) {
        return "";
    }
    String smallest = words[0];
    for (int i = 1; i < words.length; i++) {
        if (words[i].length() < smallest.length()) {
            smallest = words[i];
        }
    }
    return smallest;
  }
 
  public static void main(String[] args)
  {
    String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
    String longestString = getLengthLongestString(toppings);
    String smallestString = getSmallestString(toppings);
    System.out.format("longest string: '%s'\n", longestString);
    System.out.format("longest string: '%s'\n", smallestString);
  }
}
