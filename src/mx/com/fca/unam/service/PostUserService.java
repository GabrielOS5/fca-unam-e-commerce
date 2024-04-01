package mx.com.fca.unam.service;

import java.util.List;
import mx.com.fca.unam.model.User;
import mx.com.fca.unam.util.FileECommerceUtil;

public class PostUserService {
    
    private FileECommerceUtil fileECommerceUtil;
    private GetAllUserService getAllUserService;
    
    public PostUserService() {
        fileECommerceUtil = new FileECommerceUtil();
        getAllUserService = new GetAllUserService();
    }
    
    public boolean saveUser(String userName, String email, String password, String phone, String entityFederative){
        User user = new User(getLastId() + 1, userName, email, password, phone, entityFederative);
        boolean flag = fileECommerceUtil.saveUser(user);
        return flag;
    }
    
    private Integer getLastId() {
        List<User> users = getAllUserService.getUsers();
        Integer id = 0;
        
        if (!users.isEmpty()) {
            id = users.get(users.size()-1).getId();
        }
        
        return id;
    }
    
}
