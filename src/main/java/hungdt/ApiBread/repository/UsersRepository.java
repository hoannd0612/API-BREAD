package hungdt.ApiBread.repository;

import hungdt.ApiBread.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity,Integer> {

    UsersEntity findByUsernameAndPassword(String username,String password);
}
