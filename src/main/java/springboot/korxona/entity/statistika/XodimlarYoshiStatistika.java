package springboot.korxona.entity.statistika;

import jakarta.persistence.*;
import lombok.Data;
import springboot.korxona.entity.Xodim;

@Entity
@Data
@Table(name = "XodimlarYoshiStatistika")
public class XodimlarYoshiStatistika {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Xodim xodim;
}
