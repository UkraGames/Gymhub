package jar.gymhub.faces;
/**
 *
 * @author diego
 */
import jar.gymhub.classes.subType;
import java.util.ArrayList;
public interface daoSubType {
    public void uploadSubType(subType e) throws Exception;
    public void modifySubType(subType e) throws Exception;
    public ArrayList<subType> listOfSubType() throws Exception;
    public ArrayList<subType> searchBySubType() throws Exception;
}
