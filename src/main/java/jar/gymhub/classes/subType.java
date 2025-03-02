
package jar.gymhub.classes;
/**
 *
 * @author diego
 */
public class subType {
    private int idSubType;
    private String description;
    
    //Constructors
    public subType(){}

    public subType(int idSubType, String description) {
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
