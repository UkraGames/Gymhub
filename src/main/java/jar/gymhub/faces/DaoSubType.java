package jar.gymhub.faces;
/**
 *
 * @author diego
 */
import jar.gymhub.classes.SubType;
import java.util.ArrayList;
public interface DaoSubType {
    public void uploadSubType(SubType e) throws Exception;
    public void modifySubType(SubType e) throws Exception;
    public void deleteSubType(SubType e) throws Exception;
    public ArrayList<SubType> listOfSubType() throws Exception;
    public ArrayList<SubType> searchBySubType() throws Exception;
}
