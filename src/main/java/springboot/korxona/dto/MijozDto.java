package springboot.korxona.dto;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import springboot.korxona.entity.Xodim;

import java.util.Date;
@Data
public class MijozDto {

    private String ismi;
    private String   familiyasi;
    private  String  sharifi;
    private Integer yoshi;
    private String passport_seriyasi;
    private Long passport_raqam;
    private String jshshir;
    private String millati;
    private String date;
    private String yashash_manzili;
    private Xodim xodim;
}
