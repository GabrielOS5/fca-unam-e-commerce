package mx.com.fca.unam.service.product;

import java.util.List;
import static mx.com.fca.unam.constants.CommonConstants.PRODUCT_TXT;
import mx.com.fca.unam.model.Product;
import mx.com.fca.unam.util.FileECommerceUtil;

public class PutProductService {
    
    private final FileECommerceUtil fileECommerceUtil;
    
    public PutProductService() {
        fileECommerceUtil = new FileECommerceUtil(PRODUCT_TXT);
    }
    
    public boolean updateProduct(Product oldProduct, Product newProduct) {
        List<String> content = fileECommerceUtil.getContent();
        
        for (int i = 0; i < content.size(); i++) {
            if(content.get(i).contains(oldProduct.getEan())) {
               String line = content.get(i).replace(oldProduct.getDescription(), newProduct.getDescription());
               line = line.replace(oldProduct.getType(), newProduct.getType());
               line = line.replace(String.valueOf(oldProduct.getPrice()), String.valueOf(newProduct.getPrice()));
               line = line.replace(String.valueOf(oldProduct.isActive()), String.valueOf(newProduct.isActive()));
               content.set(i, line);
               break;
            }
        }
        
        return fileECommerceUtil.updateContent(content);
    }
    
}
