package OnlineStoreWemalpa.com.OnlineStore.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductFormDto {
    private String name;
    private String description;
    private BigDecimal price;
    private String clothingType;
    private List<String> sizes;
    private List<MultipartFile> images;
}
