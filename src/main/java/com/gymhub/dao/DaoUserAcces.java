package com.gymhub.dao;

import com.gymhub.model.UserAcces;

public interface DaoUserAcces {
    /**
     * Inserta un usuario en la base de datos.
     * Solo se permite ingresar usuarios con id, nombre y password.
     *
     * @param user el objeto UserAcces a insertar
     * @throws Exception si ocurre un error al insertar
     */
    void insertUser(UserAcces user) throws Exception;
}