package mx.com.fca.unam.model;

public class OnlineCar {
    
    private String ean;
    
    private String description;
    
    private Double price;
    
    private Double account;

    public OnlineCar(String ean, String description, Double price, Double account) {
        this.ean = ean;
        this.description = description;
        this.price = price;
        this.account = account;
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
    
    

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "OnlineCar{" + "ean=" + ean + ", description=" + description + ", price=" + price + ", account=" + account + '}';
    }
    
}
