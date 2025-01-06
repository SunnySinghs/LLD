package Design.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserController {
    private List<User> users;

    public UserController(List userList) {
        this.users = userList;
    }

    //add user
    public void addUser(User user){
        users.add(user);
    }

    //remove user
    public void removeUser(User user){
        users.remove(user);
    }

    //get particular user
    public User getUser(int userId){
        Optional<User> user = users.stream().filter(u -> u.getId() == userId).findFirst();
        if (user.isPresent()) {
            return user.get();
        }
        return null;
    }

}
