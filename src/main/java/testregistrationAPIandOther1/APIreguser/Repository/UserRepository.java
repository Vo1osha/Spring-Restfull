package testregistrationAPIandOther1.APIreguser.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testregistrationAPIandOther1.APIreguser.Entity.UserEntity;
// DAO?
public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
