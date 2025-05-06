package com.gymhub.dao;
/**
 *
 * @author diego
 */
import com.gymhub.model.State;
import java.util.ArrayList;
public interface DaoState {
    public void uploadState (State e) throws Exception;
    public void modifyState (State e) throws Exception;
    public ArrayList<State> listOfState() throws Exception;
    public ArrayList<State> searchByState () throws Exception;
}
