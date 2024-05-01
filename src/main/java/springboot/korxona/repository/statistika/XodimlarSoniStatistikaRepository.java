package springboot.korxona.repository.statistika;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.korxona.entity.statistika.XodimlarSoniStatistika;

@Repository
public interface XodimlarSoniStatistikaRepository extends JpaRepository<XodimlarSoniStatistika,Long> {
}
