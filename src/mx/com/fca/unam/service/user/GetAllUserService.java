package mx.com.fca.unam.service.user;

import java.util.List;
import java.util.stream.Collectors;
import static mx.com.fca.unam.constants.CommonConstants.PIPELINE;
import static mx.com.fca.unam.constants.CommonConstants.USER_TXT;
import mx.com.fca.unam.model.User;
import mx.com.fca.unam.util.ECommerceUtil;
import mx.com.fca.unam.util.FileECommerceUtil;

public class GetAllUserService {
    
    private FileECommerceUtil fileECommerceUtil;
    
    public GetAllUserService() {
        fileECommerceUtil = new FileECommerceUtil(USER_TXT);
    }
    
    public List<User> getUsers() {
        List<String> contentFile = fileECommerceUtil.getContent();
        List<User> users = contentFile.stream().map(line -> {
            String[] values = line.split(PIPELINE);
            return new User(Integer.valueOf(values[0]), values[1], values[2], ECommerceUtil.decodePassword(values[3]), values[4], values[5], values[6]);
        }).collect(Collectors.toList());
        return users;
    }
    
}
