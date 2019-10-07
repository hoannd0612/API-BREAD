package hungdt.ApiBread.service;

import hungdt.ApiBread.entity.ProductEntity;
import hungdt.ApiBread.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<ProductEntity> loadAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity findByID(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteByID(int id) {
        productRepository.deleteById(id);
    }
}
