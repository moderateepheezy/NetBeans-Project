/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetofile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author simpumind
 */
public class WriteToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
                File dir = new File(".");
		String loc = dir.getCanonicalPath() + File.separator + "Code.txt";
 
		FileWriter fstream = new FileWriter(loc, true);
		BufferedWriter out = new BufferedWriter(fstream);
 
		out.write("First Name: ");
                out.write("Middle Name: ");
                out.write("Last Name: " );
                out.write("Phone Number: " );
                out.write("Home Address: " );
                out.write("Company Name: " );
                out.write("Company Phone: " );
                out.write("Company Address: " );
                out.write("*********************************************");

		out.newLine();
                out.newLine();
 
		//close buffer writer
		out.close();
}
    
}
