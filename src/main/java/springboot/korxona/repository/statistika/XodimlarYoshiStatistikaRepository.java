package springboot.korxona.repository.statistika;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.korxona.entity.statistika.XodimlarYoshiStatistika;

@Repository
public interface XodimlarYoshiStatistikaRepository extends JpaRepository<XodimlarYoshiStatistika,Long> {

}
