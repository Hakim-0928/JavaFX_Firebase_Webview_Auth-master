package modelview;

public class UserManager {
    private static UserManager instance = new UserManager();

    private String userName;

    private UserManager() {
        // private constructor to enforce singleton pattern
    }

    public static UserManager getInstance() {
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}