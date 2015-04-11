/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perm;

/**
 *
 * @author simpumind
 */
public class Perm {

    
    public static void permutation(String str) { 
    permutation("", str); 
}

private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
        permutation( "abcde");
    }
}
