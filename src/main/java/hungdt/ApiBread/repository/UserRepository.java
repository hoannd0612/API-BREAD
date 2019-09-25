package hungdt.ApiBread.repository;

import hungdt.ApiBread.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity, String> {

    UsersEntity findByIdAndPassword(String id, String password);


   @Transactional
    @Modifying
    @Query(value = "update Users set is_delete = 'true' where id = :id",nativeQuery = true)
     void deleteUser(String id);


}
