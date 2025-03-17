package OnlineStoreWemalpa.com.OnlineStore.service;

import OnlineStoreWemalpa.com.OnlineStore.model.Material;
import OnlineStoreWemalpa.com.OnlineStore.model.User;

import java.util.List;

public interface MaterialService {
    List<Material> findAllMaterial();
    Material saveMaterial(Material material);
    Material updateMaterial(Material material);
    void deleteMaterial(Long id);
    Material findById(Long id);
    boolean existsByName(String name);
}
