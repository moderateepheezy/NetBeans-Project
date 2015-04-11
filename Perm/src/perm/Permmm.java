/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perm;

/**
 *
 * @author simpumind
 */
public class Permmm {
    
    public static void printDuplicates(String str,String prefix)
{
    if(str.length()==0)
    {
        System.out.println(prefix);
    }
    else
    {
        for (int i = 0; i<str.length();i++)
        {
            if(i>0)
            {
                if(str.charAt(i)==str.charAt(i-1))
                {
                    continue;
                }
            }

                printDuplicates(str.substring(0, i)+str.substring(i+1, str.length()),prefix+str.charAt(i));

        }
    }
}
    public String sort(String str){
    // Please Implement the sorting function, I was lazy enough to do so 
    }
public static void main(String [] args)
{
    String test="asdadsa";
    test = sort(test);
    printDuplicates(test,"");
}
}
