package springboot.korxona.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Korxona_Ishchilar")
@Data
public class Xodim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ismi")
    private String ismi;

    @Column(name = "familyasi")
    private String   familiyasi;

    @Column(name = "sharifi")
    private  String  sharifi;

    @Column(name = "yoshi")
    private Integer yoshi;

    @Column(name = "passport_Seria")
    private String passport_seriyasi;

    @Column(name = "passport_raqam")
    private Long passport_raqam;

    @Column(name = "JSHIR")
    private String jshshir;

    @Column(name = "millati")
    private String millati;

    @Column(name = "ish_xaqqi")
    private Double ish_xaqqi;

    @Column(name = "yashash_manzil")
    private String yashash_manzili;

    @OneToOne(fetch = FetchType.LAZY)
    private Bolim bolim;




}
