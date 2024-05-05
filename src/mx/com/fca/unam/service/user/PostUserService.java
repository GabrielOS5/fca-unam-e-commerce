package mx.com.fca.unam.service.user;

import java.util.List;
import static mx.com.fca.unam.constants.CommonConstants.USER_TXT;
import mx.com.fca.unam.model.User;
import mx.com.fca.unam.util.FileECommerceUtil;

public class PostUserService {
    
    private FileECommerceUtil fileECommerceUtil;
    private GetAllUserService getAllUserService;
    
    public PostUserService() {
        fileECommerceUtil = new FileECommerceUtil(USER_TXT);
        getAllUserService = new GetAllUserService();
    }
    
    public boolean saveUser(String userName, String email, String password, String phone, String entityFederative, String typeUser){
        User user = new User(getLastId() + 1, userName, email, password, phone, entityFederative, typeUser);
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
