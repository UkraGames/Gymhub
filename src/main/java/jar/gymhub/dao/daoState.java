package jar.gymhub.dao;
/**
 *
 * @author diego
 */
import jar.gymhub.classes.State;
import java.util.ArrayList;
public interface daoState {
    public void uploadState (State e) throws Exception;
    public void modifyState (State e) throws Exception;
    public ArrayList<State> listOfState() throws Exception;
    public ArrayList<State> searchByState () throws Exception;
}
