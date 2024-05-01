package springboot.korxona.service.statistika;

import org.springframework.stereotype.Service;
import springboot.korxona.entity.statistika.XodimlarMaoshiUmumiySummaOylik;
import springboot.korxona.entity.Xodim;
import springboot.korxona.repository.XodimRepository;
import springboot.korxona.repository.statistika.XodimlarMaoshiUmumiySummaOylikRepository;

import java.util.List;

@Service
public class XodimlarMaoshiUmumiySummaOylikService {
    private final XodimlarMaoshiUmumiySummaOylikRepository xodimlarMaoshiUmumiySummaOylikRepository;
    private final XodimRepository xodimRepository;

    public XodimlarMaoshiUmumiySummaOylikService(XodimlarMaoshiUmumiySummaOylikRepository xodimlarMaoshiUmumiySummaOylikRepository, XodimRepository xodimRepository) {
        this.xodimlarMaoshiUmumiySummaOylikRepository = xodimlarMaoshiUmumiySummaOylikRepository;
        this.xodimRepository = xodimRepository;
    }
    private Double xodimLarOyligi(){
        List<Xodim> xodimList=xodimRepository.findAll();
        Double sum=0.0;
        for (Xodim xodim:xodimList){
            sum+=xodim.getIsh_xaqqi();
        }
        return sum;
    }
    public XodimlarMaoshiUmumiySummaOylik save(){
        XodimlarMaoshiUmumiySummaOylik xodimlarMaoshiUmumiySummaOylik=new XodimlarMaoshiUmumiySummaOylik();
        xodimlarMaoshiUmumiySummaOylik.setSumma(xodimLarOyligi());
        xodimlarMaoshiUmumiySummaOylikRepository.save(xodimlarMaoshiUmumiySummaOylik);
        return xodimlarMaoshiUmumiySummaOylik;
    }
}
