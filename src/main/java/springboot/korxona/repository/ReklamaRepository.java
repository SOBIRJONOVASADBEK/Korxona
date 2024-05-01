package springboot.korxona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.korxona.entity.Reklama;
import springboot.korxona.entity.Xodim;

import java.util.List;

@Repository
public interface ReklamaRepository extends JpaRepository<Reklama,Long> {
    List<Reklama> findByXodim(Xodim xodim);
}
