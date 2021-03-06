/*
 * The ListItem class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 * Team members: Gail Lee, Carolyn Murray, Drazen Lucic
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Gail Lee
 */
public class ListItem implements Serializable {
    private String name;
    private int number;

    public ListItem(){}
    
    public ListItem(String _name, int _number) {
        name = _name;
        number = _number;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
