import entity.User;

import java.util.Optional;

/**
 * Created by Denis Areshkevich on 28.05.2017.
 */
public class UserService {

    public Optional<User> getUserById(int id) {
        return new UserDao().getUserById(id);

    }
}
