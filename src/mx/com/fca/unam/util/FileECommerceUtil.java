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
import mx.com.fca.unam.model.User;

public class FileECommerceUtil {
    
    private File file;
    
    public FileECommerceUtil() {
        file = new File("${path_file}");
        
        try {
            if (file.exists()) {
               file.createNewFile();
            }
        } catch (Exception e) {
            
        }
    }
    
    public boolean saveUser(User user) {
        try {
            FileWriter fileWrite = new FileWriter(file, true);
            String line = buildInformation(user);
            fileWrite.write(line);
            fileWrite.write(LINE_BREAK);
            fileWrite.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private String buildInformation(User user) {
        StringBuilder line = new StringBuilder();
        line.append(user.getId().toString())
                .append(PIPELINE_INSERT)
                .append(user.getName())
                .append(PIPELINE_INSERT)
                .append(user.getEmail())
                .append(PIPELINE_INSERT)
                .append(user.getPassword())
                .append(PIPELINE_INSERT)
                .append(user.getPhone())
                .append(PIPELINE_INSERT)
                .append(user.getFederalEntity());
        return line.toString();
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
    
}
