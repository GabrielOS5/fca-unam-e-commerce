package mx.com.fca.unam.model;

public class User {
    
    private Integer id;
    
    private String name;
    
    private String password;
    
    private String email;
    
    private String federalEntity;
    
    private String phone;
    
    private String type;
    
    public User() {
    }

    public User(String name, String password, String email, String federalEntity, String phone) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.federalEntity = federalEntity;
        this.phone = phone;
    }
    
    public User(Integer id, String name, String email, String password, String phone, String federalEntity, String type) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.federalEntity = federalEntity;
        this.phone = phone;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFederalEntity() {
        return federalEntity;
    }

    public void setFederalEntity(String federalEntity) {
        this.federalEntity = federalEntity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", federalEntity=" + federalEntity + ", phone=" + phone + ", type=" + type + '}';
    }
    
}