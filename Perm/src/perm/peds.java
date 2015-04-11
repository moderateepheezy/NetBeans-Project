/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perm;

/**
 *
 * @author simpumind
 */
public class peds {
    
    void permutateHelperDuplicate(String prefix, String rest){
        int N = 0;
        if(rest!=null)
            N = rest.length();
        if (N==0)
        {
            System.out.println(prefix);
        } 
        else
        {   
            for (int i = 0; i < rest.length(); i++) 
            {
 
 
                //test if rest[i] is unique.
                boolean found = false;
                for (int j = 0; j < i; j++) 
                {
                    if (rest.charAt(j) == rest.charAt(i)) //rest[j]==rest[i]
                        found = true;
                }
                if(found)
                    continue;
                String newPrefix = prefix + rest.charAt(i);
                String newRest = rest.substring(0, i) + rest.substring(i+1,N);  
                permutateHelperDuplicate(newPrefix, newRest);           
            }    
        }
    }
    
    public static void main(String[] args) {
       String alphabet = "aabc";
       String elements = alphabet.substring(0, alphabet.length());
       peds p = new peds();
       p.permutateHelperDuplicate("value: ",elements);
    }
}
