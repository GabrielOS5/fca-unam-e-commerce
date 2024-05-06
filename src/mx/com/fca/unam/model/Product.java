package mx.com.fca.unam.model;

public class Product implements Comparable<Product> {
    
    private Integer id;
    
    private String ean;
    
    private String description;
    
    private Double price;
    
    private String type;
    
    public Product() {
        
    }

    public Product(Integer id, String ean, String description, Double price, String type) {
        this.id = id;
        this.ean = ean;
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Product product) {
        return description.compareTo(product.description);
    } 

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", ean=" + ean + ", description=" + description + ", price=" + price + ", type=" + type + '}';
    }
    
}
