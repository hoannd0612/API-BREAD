package hungdt.ApiBread.repository;

import hungdt.ApiBread.entity.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<BillEntity,Integer> {

}
