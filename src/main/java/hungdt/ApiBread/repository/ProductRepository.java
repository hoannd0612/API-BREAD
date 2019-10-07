package hungdt.ApiBread.repository;

import hungdt.ApiBread.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
        List<ProductEntity> findAll();
        ProductEntity findById(int id);

        @Transactional
        @Modifying
        @Query(value = "update product set deleted = 1 where id=:id",nativeQuery = true)
        void deleteById(@Param("id") int id);

}
