package mx.com.fca.unam.model;

import java.util.UUID;

public class User {
    
    private Integer id;
    
    private String name;
    
    private String password;
    
    private String email;
    
    private String federalEntity;
    
    private String phone;
    
    public User() {
    }

    public User(String name, String password, String email, String federalEntity, String phone) {
        //this.id = UUID.randomUUID();
        this.name = name;
        this.password = password;
        this.email = email;
        this.federalEntity = federalEntity;
        this.phone = phone;
    }
    
    public User(Integer id, String name, String email, String password, String phone, String federalEntity) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.federalEntity = federalEntity;
        this.phone = phone;
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
    
}