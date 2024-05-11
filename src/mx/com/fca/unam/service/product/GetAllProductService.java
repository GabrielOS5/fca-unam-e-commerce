package mx.com.fca.unam.service.product;

import java.util.List;
import java.util.stream.Collectors;
import static mx.com.fca.unam.constants.CommonConstants.PIPELINE;
import static mx.com.fca.unam.constants.CommonConstants.PRODUCT_TXT;
import mx.com.fca.unam.model.Product;
import mx.com.fca.unam.util.FileECommerceUtil;

public class GetAllProductService {
    
    private final FileECommerceUtil fileECommerceUtil;

    public GetAllProductService() {
        fileECommerceUtil = new FileECommerceUtil(PRODUCT_TXT);
    }
    
    public List<Product> getProducts() {
        List<String> contentFile = fileECommerceUtil.getContent();
        List<Product> products = contentFile.stream().map(line -> {
            String[] values = line.split(PIPELINE);
            return new Product(Integer.valueOf(values[0]), values[1], values[2], Double.valueOf(values[3]), values[4], Boolean.parseBoolean(values[5]));
        })
                .filter(Product::isActive)
                .collect(Collectors.toList());
        return products;
    }
    
    
}
