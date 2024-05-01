package springboot.korxona.repository.statistika;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.korxona.entity.statistika.XodimlarMaoshiUmumiySummaOylik;

@Repository
public interface XodimlarMaoshiUmumiySummaOylikRepository extends JpaRepository<XodimlarMaoshiUmumiySummaOylik,Long> {
}
