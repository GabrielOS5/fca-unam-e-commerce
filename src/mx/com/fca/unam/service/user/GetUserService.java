package mx.com.fca.unam.service.user;

import java.util.List;
import mx.com.fca.unam.model.User;

public class GetUserService {
    
    private GetAllUserService getAllUserService;
    
    public GetUserService() {
        getAllUserService = new GetAllUserService();
    }
    
    public User getUser(String userName, String password) {
        List<User> users = getAllUserService.getUsers();
        return users.stream()
                .filter(user -> user.getName().equals(userName) && user.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }
    
}
