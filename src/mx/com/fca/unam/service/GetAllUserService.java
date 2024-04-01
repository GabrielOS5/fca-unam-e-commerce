package mx.com.fca.unam.service;

import java.util.List;
import java.util.stream.Collectors;
import static mx.com.fca.unam.constants.CommonConstants.PIPELINE;
import mx.com.fca.unam.model.User;
import mx.com.fca.unam.util.FileECommerceUtil;

public class GetAllUserService {
    
    private FileECommerceUtil fileECommerceUtil;
    
    public GetAllUserService() {
        fileECommerceUtil = new FileECommerceUtil();
    }
    
    public List<User> getUsers() {
        List<String> contentFile = fileECommerceUtil.getContent();
        List<User> users = contentFile.stream().map(line -> {
            String[] values = line.split(PIPELINE);
            return new User(Integer.valueOf(values[0]), values[1], values[2], values[3], values[4], values[5]);
        }).collect(Collectors.toList());
        
        return users;
    }
    
}
