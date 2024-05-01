package springboot.korxona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.korxona.entity.Mijoz;
import springboot.korxona.entity.Xodim;

import java.util.List;

@Repository
public interface MijozRepository extends JpaRepository<Mijoz,Long> {
    List<Mijoz> findByXodim(Xodim xodim);
}
