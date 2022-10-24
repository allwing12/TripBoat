package tripboat.tripboat1.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tripboat.tripboat1.User.Domain.SiteUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);
}