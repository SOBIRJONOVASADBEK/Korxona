package springboot.korxona.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reklama")
@Data
public class Reklama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reklama_turi")
    private String reklama_turi;

    @Column(name = "reklama_xarajati")
    private Double xarajati;

    @Column(name = "necha_kun_reklamada_bolgani")
    private Integer reklama_kuni;

    @ManyToOne
    private Xodim xodim;
}
