import connection.ConnectionManager;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

/**
 * Created by Denis Areshkevich on 28.05.2017.
 */
public class UserDao {

    public Optional<User> getUserById(int id) {
        try (Connection connection = ConnectionManager.getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM `user`" +
                    " WHERE id = ?")) {
                statement.setInt(1, id);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return Optional.of(new User(id, resultSet.getString("first_name"),
                                resultSet.getString("second_name"),
                                resultSet.getString("password"),
                                resultSet.getString("gender"),
                                resultSet.getString("phone_number"),
                                resultSet.getString("place_of_residence")));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
