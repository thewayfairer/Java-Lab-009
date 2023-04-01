public class User {
    private String username;
    private String passHash;

    // Constructor with 2 parameters: username and passHash
    public User(String username, String passHash) {
        this.username = username;
        this.passHash = passHash;
    }

    // Method getUsername
    public String getUsername() {
        return username;
    }

    // Method getPassHash
    public String getPassHash() {
        return passHash;
    }
}

