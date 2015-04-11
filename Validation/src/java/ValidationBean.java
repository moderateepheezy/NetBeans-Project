/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author simpumind
 */
@ManagedBean
@RequestScoped
public class ValidationBean {

    private String name;
    private String email;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    // returns result for rendering on the client
    public String getResult(){
        if(name != null && email != null && phone != null){
            return "<p style=\"background-color:yellow;width:200px;" +
            "padding:5px\">Name: " + getName() + "<br/>E-Mail: " +
            getEmail() + "<br/>Phone: " + getPhone() + "</p>";
        }
        else{
            return ""; // request has not yet been made
        }
    }
}
