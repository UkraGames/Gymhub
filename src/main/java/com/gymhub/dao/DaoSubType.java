package com.gymhub.dao;
/**
 *
 * @author diego
 */
import com.gymhub.model.SubType;
import java.util.ArrayList;
public interface DaoSubType {
    public void uploadSubType(SubType e) throws Exception;
    public void modifySubType(SubType e) throws Exception;
    public void deleteSubType(SubType e) throws Exception;
    public ArrayList<SubType> listOfSubType() throws Exception;
    public ArrayList<SubType> searchBySubType() throws Exception;
}
