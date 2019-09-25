package hungdt.ApiBread.service;

import hungdt.ApiBread.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> loadAllProduct();
    ProductEntity findByID(int id);
    ProductEntity createProduct(ProductEntity productEntity);
    void deleteByID(int id);
}
