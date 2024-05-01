package springboot.korxona.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Korxona_Mijoz")
@Data
public class Mijoz {

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

    @Column(name = "mijoz_kelgan_vaqt")
    private String date;

    @Column(name = "yashash_manzil")
    private String yashash_manzili;

    @ManyToOne
    private Xodim xodim;
}
