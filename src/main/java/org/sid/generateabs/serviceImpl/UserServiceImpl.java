package org.sid.generateabs.serviceImpl;

import org.sid.generateabs.dbutil.DBUtil;
import org.sid.generateabs.service.UserService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Service
public class UserServiceImpl  implements UserService {
    Connection connection;
    public UserServiceImpl() throws SQLException {
        connection = DBUtil.getConnection();

    }
    @Override
    public int loginValidation(String username, String password) {

        return 0;
    }
}
