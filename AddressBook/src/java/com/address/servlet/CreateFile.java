/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.address.servlet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author simpumind
 */
public class CreateFile {
    
    public static String doCreateFile(String firstname, String middlename, String lastname, 
            String phone, String homeaddress, String company, String comPhone, String comAddress) throws IOException{
        File dir = new File(".");
		String loc = dir.getCanonicalPath() + File.separator + "Code.txt";
 
		FileWriter fstream = new FileWriter(loc, true);
		BufferedWriter out = new BufferedWriter(fstream);
                try{
                    out.write("First Name: " + firstname + "/n");
                    out.write("Middle Name: " + middlename + "/n");
                    out.write("Last Name: " + lastname + "/n" );
                    out.write("Phone Number: " + phone + "/n");
                    out.write("Home Address: " + homeaddress + "/n");
                    out.write("Company Name: " + company + "/n");
                    out.write("Company Phone: " + comPhone + "/n");
                    out.write("Company Address: " + comAddress+ "/n");
                    out.write("*********************************************");

                    out.newLine();
                    out.newLine();
                }
		//close buffer writer
                finally{
                    out.close();
                }
                return loc;
    }
}
