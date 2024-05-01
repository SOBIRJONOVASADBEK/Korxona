package springboot.korxona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springboot.korxona.entity.Xodim;

import java.util.List;

@Repository
public interface XodimRepository extends JpaRepository<Xodim,Long> {

    Xodim findByIsmi(String name);
    List<Xodim> findAllByOrderByYoshi();
    




}
