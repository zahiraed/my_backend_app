package org.sid.generateabs.service;


import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    // in the service we just make the signature and we put uimplimentation on the doc of implimentation
    //cette methode if faut quelle appel ce qui est en service impl
    public int loginValidation(String username,String password);
}
