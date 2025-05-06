
package com.gymhub.model;
/**
 *
 * @author diego
 */
public class SubType {
    private int idSubType;
    private String description;
    
    //Constructors
    public SubType(){}

    public SubType(int idSubType, String description) {
        this.idSubType = idSubType;
        this.description = description;
    }
    
    //Getters and Setters

    public int getIdSubType() {
        return idSubType;
    }

    public void setIdSubType(int idSubType) {
        this.idSubType = idSubType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
