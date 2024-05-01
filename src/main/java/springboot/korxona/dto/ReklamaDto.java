package springboot.korxona.dto;

import lombok.Data;
import springboot.korxona.entity.Xodim;
@Data
public class ReklamaDto {
    private String reklama_turi;

    private Double xarajati;

    private Integer reklama_kuni;

    private Xodim xodim;
}
