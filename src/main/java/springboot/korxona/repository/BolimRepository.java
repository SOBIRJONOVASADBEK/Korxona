package springboot.korxona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.korxona.entity.Bolim;

@Repository
public interface BolimRepository extends JpaRepository<Bolim,Long> {
    public Bolim findByName(String name);
}
