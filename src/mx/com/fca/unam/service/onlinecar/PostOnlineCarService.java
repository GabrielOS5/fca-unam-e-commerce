package mx.com.fca.unam.service.onlinecar;

import static mx.com.fca.unam.constants.CommonConstants.ONLINE_CAR_TXT;
import mx.com.fca.unam.model.OnlineCar;
import mx.com.fca.unam.model.Product;
import mx.com.fca.unam.util.FileECommerceUtil;

public class PostOnlineCarService {
    
    private final FileECommerceUtil fileECommerceUtil;
    
    public PostOnlineCarService() {
        fileECommerceUtil = new FileECommerceUtil(ONLINE_CAR_TXT);
    }
    
    public boolean saveProductToCar(Product product, Double account) {
        OnlineCar onlineCar = new OnlineCar(product.getEan(), product.getDescription(), product.getPrice(), account);
        return fileECommerceUtil.saveOnlineCar(onlineCar);
    }
    
}
