/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonObject;

import java.util.Scanner;

/**
 *
 * @author simpumind
 */
public class ClassDataApp {
    
    public static void main(String[] args){
        int maxSize = 10;
        ClassDataArray arr = new ClassDataArray(maxSize);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        arr.display();
        
        Scanner input = new Scanner(System.in);
         String searchKey = input.nextLine();
        
       // String searchKey = "Stimson";
        Person found;
        found = arr.find(searchKey);
        if(found != null){
            System.out.println("found!!!");
            found.displayPerson();
        }
        else{
            System.out.printf("Can't find key %s!!!", searchKey);
        }
        
        System.out.println("Deleting smith, Yee, and Creswell");
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");
        
        arr.display();
    }
}
