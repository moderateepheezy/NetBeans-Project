/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author simpumind
 */
@ManagedBean(name="selectionsBean")
@RequestScoped
public class SelectionBean {

    //map of topics  to book titles
    private static final HashMap<String, String> booksMap = new HashMap<>();
    
    static{
        booksMap.put( "java", "Java How to Program" );
        booksMap.put( "cpp", "C++ How to Program" );
        booksMap.put( "iphone",
        "iPhone for Programmers: An App-Driven Approach" );
        booksMap.put( "android",
        "Android for Programmers: An App-Driven Approach" );
    }
    
    // stores individual user's selections
    private Set< String > selections = new TreeSet< String >();
    private String selection; //store current selection
    
    //return number of selections
    public int getNumberOfSelections(){
        return selections.size();
    }
    
    //return current selection
    public String getSelection(){
        return selection;
    }
    
    // store user's selection
    public void setSelection( String topic ){
        selection = booksMap.get( topic );
        selections.add( selection );
    } // end method setSelection
    
    // return the Set of selections
    public String[] getSelections(){
        return selections.toArray(new String[selections.size()]);
    }
    
    
}
