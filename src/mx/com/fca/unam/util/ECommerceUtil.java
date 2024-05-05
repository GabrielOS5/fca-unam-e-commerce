package mx.com.fca.unam.util;

import java.util.Base64;

public class ECommerceUtil {
    
    public static String encodePassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }
    
    public static String decodePassword(String encodePassword) {
        return new String(Base64.getDecoder().decode(encodePassword.getBytes()));
    }
    
}
