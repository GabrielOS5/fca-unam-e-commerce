package mx.com.fca.unam.service.product;

import java.util.List;
import mx.com.fca.unam.util.FileECommerceUtil;
import static mx.com.fca.unam.constants.CommonConstants.PRODUCT_TXT;
import mx.com.fca.unam.model.Product;

public class PostProductService {
    
    private FileECommerceUtil fileECommerceUtil;
    
    private GetAllProductService getAllProductService;

    public PostProductService() {
        fileECommerceUtil = new FileECommerceUtil(PRODUCT_TXT);
        getAllProductService = new GetAllProductService();
    }
    
    public boolean saveProduct(String ean, String description, Double price, String type) {
        Product product = new Product(this.getLastId() + 1, ean, description, price, type);
        return fileECommerceUtil.saveProduct(product);
    }
    
    private Integer getLastId() {
        List<Product> products = getAllProductService.getProducts();
        Integer id = 0;
        
        if (!products.isEmpty()) {
            id = products.get(products.size()-1).getId();
        }
        
        return id;
    }
    
}
