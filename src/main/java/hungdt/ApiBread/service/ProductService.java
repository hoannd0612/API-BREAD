package hungdt.ApiBread.service;

import hungdt.ApiBread.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> loadAll();
}
