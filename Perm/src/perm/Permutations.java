/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author simpumind
 */
public class Permutations {
    static ArrayList<String> x = new ArrayList<String>();
    // print N! permutation of the characters of the string s (in order)
    public  static void perm1(String s) {
        perm1("", s); 
    }
    private static void perm1(String prefix, String s) {
        int N = s.length();
        if (N == 0){
            x.add(prefix);
            System.out.println(prefix);
        }
        else {
            for (int i = 0; i < N; i++)
               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
        }

    }

public static void combString(String s) {
        int numberOfPermutations = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < s.length(); k++) {
                    for (int z = 0; z < s.length(); z++) {
                        if (i != j && j != k && i != k && i != z && j != z && k != z) {
                            System.out.format("%c%c%c%c%n", s.charAt(i), s.charAt(j),
                                    s.charAt(k), s.charAt(z));
                            numberOfPermutations++;
                        }
                    }
                }
            }
        }
        System.out.println(numberOfPermutations);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
       String alphabet = "abc";
       String elements = alphabet.substring(0, alphabet.length());
       System.out.println("1: Excercise 1");     
       System.out.println("2: Excercise 2");
       System.out.println("3: Excercise 3");
       System.out.println("4: Excercise 4");
       t = input.nextInt();
       System.out.println();
       if(t == 1){
           System.out.println("Number of possible arrangement is: " + x.size());
       }
       else if(t == 2){
           perm1(elements);
       }
       else if(t == 3){
           
       }
       else if(t == 4){
           combString(alphabet);
       }
    }
}
