
import java.util.Arrays;
import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simpumind
 */
public class Sort {
    public static void main(String args[]){
        String str = "hello world";
char[] arr = str.toCharArray();

for(int i = 0; i < arr.length; i++) System.out.print(arr[i]);
System.out.println();

Arrays.sort(arr); // sorted in ascending order

// print them backwards i.e. descending order.
for(int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i]);
System.out.println();
    }
}
