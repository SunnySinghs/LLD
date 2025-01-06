package Design.Payment.User;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public UserDO addUser(UserDO userDO) {
        return userService.addUser(userDO);
    }

    public UserDO getUser(int userId) {
        return userService.getUser(userId);
    }
}
