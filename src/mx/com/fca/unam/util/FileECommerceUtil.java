package mx.com.fca.unam.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static mx.com.fca.unam.constants.CommonConstants.LINE_BREAK;
import static mx.com.fca.unam.constants.CommonConstants.PIPELINE_INSERT;
import mx.com.fca.unam.model.OnlineCar;
import mx.com.fca.unam.model.Product;
import mx.com.fca.unam.model.User;

public class FileECommerceUtil {
    
    private File file;
    
    private final String path = "fca-unam-e-commerce\\src\\main\\resource\\%s.txt";
    
    public FileECommerceUtil(final String filaName) {
        
        String pathComplete = String.format(path, filaName);
        
        file = new File(pathComplete);
        
        try {
            if (!file.exists()) {
               file.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("ERROR: Read file. EXCEPTION: " + e.getMessage());
        }
    }
    
    public List<String> getContent() {
        List<String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String value = reader.readLine();
            
            while (Optional.ofNullable(value).isPresent()) {
                lines.add(value);
                value = reader.readLine();
            }
        } catch (Exception e) {
            
        }
        return lines;
    }
    
    // USER
    public boolean saveUser(User user) {
        try {
            FileWriter fileWrite = new FileWriter(file, true);
            String line = buildInformationUser(user);
            fileWrite.write(line);
            fileWrite.write(LINE_BREAK);
            fileWrite.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private String buildInformationUser(User user) {
        StringBuilder line = new StringBuilder();
        line.append(user.getId().toString())
                .append(PIPELINE_INSERT)
                .append(user.getName())
                .append(PIPELINE_INSERT)
                .append(user.getEmail())
                .append(PIPELINE_INSERT)
                .append(ECommerceUtil.encodePassword(user.getPassword()))
                .append(PIPELINE_INSERT)
                .append(user.getPhone())
                .append(PIPELINE_INSERT)
                .append(user.getFederalEntity())
                .append(PIPELINE_INSERT)
                .append(user.getType());
        return line.toString();
    }
    
    // PRODUCT
    public boolean saveProduct(Product product) {
        try {
            FileWriter fileWrite = new FileWriter(file, true);
            String line = buildInformationProduct(product);
            fileWrite.write(line);
            fileWrite.write(LINE_BREAK);
            fileWrite.close();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: Save product. EXCEPTION: " + e.getMessage());
            return false;
        }
    }
    
    private String buildInformationProduct(Product product) {
        StringBuilder line = new StringBuilder();
        line.append(product.getId())
                .append(PIPELINE_INSERT)
                .append(product.getEan())
                .append(PIPELINE_INSERT)
                .append(product.getDescription())
                .append(PIPELINE_INSERT)
                .append(product.getPrice())
                .append(PIPELINE_INSERT)
                .append(product.getType());
        return line.toString();
    }
    
    // ONLINE CAR
    public boolean saveOnlineCar(OnlineCar onlineCar) {
        try {
            FileWriter fileWrite = new FileWriter(file, true);
            String line = buildInformationOnlineCar(onlineCar);
            fileWrite.write(line);
            fileWrite.write(LINE_BREAK);
            fileWrite.close();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: Save online car. EXCEPTION: " + e.getMessage());
            return false;
        }
    }
    
    private String buildInformationOnlineCar(OnlineCar onlineCar) {
        StringBuilder line = new StringBuilder();
        line.append(onlineCar.getEan())
                .append(PIPELINE_INSERT)
                .append(onlineCar.getDescription())
                .append(PIPELINE_INSERT)
                .append(onlineCar.getPrice())
                .append(PIPELINE_INSERT)
                .append(onlineCar.getAccount());
        return line.toString();
    }
    
}
