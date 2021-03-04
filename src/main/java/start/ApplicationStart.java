package start;

import entity.User;
import repository.UserRepo;

import java.util.UUID;

public class ApplicationStart {

    public static void main(String[] args) {
        UserRepo ur = new UserRepo();
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("Ana");
        ur.insertNewUser(user);
    }
}
