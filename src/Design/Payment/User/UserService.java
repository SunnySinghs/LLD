package Design.Payment.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public UserDO addUser(UserDO userDO) {
        int id = new Random().nextInt(100);
        User user = new User(id, userDO.getName(), userDO.getEmail());
        userList.add(user);
        return convertUserToUserDO(user);
    }

    public UserDO getUser(int userId) {
        Optional<User> user = userList.stream().filter(u -> u.getUserId() == userId).findFirst();
        if (user.isPresent()) {
            return convertUserToUserDO(user.get());
        }
        return null;
    }

    private UserDO convertUserToUserDO(User user) {
        UserDO userDO = new UserDO();
        userDO.setUserId(user.getUserId());
        userDO.setName(user.getUserName());
        userDO.setEmail(user.getEmail());
        return userDO;
    }
}
