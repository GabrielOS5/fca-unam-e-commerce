package mx.com.fca.unam.service.onlinecar;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import static mx.com.fca.unam.constants.CommonConstants.ONLINE_CAR_TXT;
import static mx.com.fca.unam.constants.CommonConstants.PIPELINE;
import mx.com.fca.unam.model.OnlineCar;
import mx.com.fca.unam.util.FileECommerceUtil;

public class GetAllOnlineCarService {
    
    private final FileECommerceUtil fileECommerceUtil;

    public GetAllOnlineCarService() {
        fileECommerceUtil = new FileECommerceUtil(ONLINE_CAR_TXT);
    }
    
    public List<OnlineCar> getOnlineCar() {
        List<String> contentFile = fileECommerceUtil.getContent();
        List<OnlineCar> onlineCars = contentFile.stream()
                .filter(value -> Objects.nonNull(value))
                .map(line -> {
                    String[] values = line.split(PIPELINE);
                    return new OnlineCar(values[0], values[1], Double.valueOf(values[2]), Double.valueOf(values[3]), Boolean.parseBoolean(values[4]));
                })
                .filter(OnlineCar::isActive)
                .collect(Collectors.toList());
        return onlineCars;
    }
}
