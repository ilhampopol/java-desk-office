package Controller;

import Model.LoginModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    public boolean authenticateUser(String inputUsername, String inputPassword) {
        ResultSet resultSet = LoginModel.getUser(inputUsername, inputPassword);

        try {
            return resultSet.next();
        } catch (SQLException e) {
            return false;
        }
    }
}
