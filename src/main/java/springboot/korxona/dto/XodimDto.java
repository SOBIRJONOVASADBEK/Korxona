package springboot.korxona.dto;

import jakarta.persistence.Column;
import lombok.Data;
import springboot.korxona.entity.Bolim;

@Data
public class XodimDto {

    private String ismi;

    private String   familiyasi;

    private  String  sharifi;

    private Integer yoshi;

    private String passport_seriyasi;

    private Long passport_raqam;

    private String jshshir;

    private String millati;


    private Double ish_xaqqi;

    private String yashash_manzili;

    private Bolim bolim;


}
