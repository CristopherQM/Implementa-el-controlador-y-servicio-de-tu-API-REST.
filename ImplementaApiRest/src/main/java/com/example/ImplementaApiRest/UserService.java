import com.example.integration_project.model.User;
import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(String userId);

    List<User> getAllUsers();

    User updateUser(String userId, User user);

    void deleteUser(String userId);
}
