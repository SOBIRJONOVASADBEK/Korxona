package springboot.korxona.entity.statistika;

import jakarta.persistence.*;
import lombok.Data;
import springboot.korxona.entity.Bolim;
import springboot.korxona.entity.Xodim;

@Entity
@Data
@Table(name = "XodimlarSoniStatistika")
public class XodimlarSoniStatistika {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Bolim bolim;

    private String xodimIsmi;
}
