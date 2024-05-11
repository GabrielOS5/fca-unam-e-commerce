package mx.com.fca.unam.service.onlinecar;

import java.util.List;
import static mx.com.fca.unam.constants.CommonConstants.ONLINE_CAR_TXT;
import mx.com.fca.unam.model.OnlineCar;
import mx.com.fca.unam.model.Product;
import mx.com.fca.unam.util.FileECommerceUtil;

public class PutOnlineCarService {
    
    private final FileECommerceUtil fileECommerceUtil;
    
    public PutOnlineCarService() {
        fileECommerceUtil = new FileECommerceUtil(ONLINE_CAR_TXT);
    }
    
    public boolean updateOnlineCar(OnlineCar onlineCar, Product product, boolean isActive) {
        List<String> content = fileECommerceUtil.getContent();
        System.out.println("EMPTY: " + content.isEmpty());
        System.out.println("SIZE: " + content.size());
        for (int i = 0; i < content.size(); i++) {
            
            if(content.get(i).contains(onlineCar.getEan())) {
                if(isActive) {
                    String line = content.get(i).replace(onlineCar.getDescription(), product.getDescription());
                    line = line.replace(String.valueOf(onlineCar.getPrice()), String.valueOf(product.getPrice()));
                    line = line.replace(String.valueOf(onlineCar.isActive()), String.valueOf(product.isActive()));
                    content.set(i, line);
                } else {
                    content.remove(i);
                }
                break;
            }
        }
        
        return fileECommerceUtil.updateContent(content);
    }
    
}
