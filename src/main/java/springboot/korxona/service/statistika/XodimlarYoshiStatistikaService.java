package springboot.korxona.service.statistika;

import org.springframework.stereotype.Service;
import springboot.korxona.entity.Xodim;
import springboot.korxona.entity.statistika.XodimlarYoshiStatistika;
import springboot.korxona.repository.XodimRepository;
import springboot.korxona.repository.statistika.XodimlarYoshiStatistikaRepository;

import java.util.List;

@Service
public class XodimlarYoshiStatistikaService {
    private final XodimRepository xodimRepository;
    private final XodimlarYoshiStatistikaRepository xodimlarYoshiStatistikaRepository;

    public XodimlarYoshiStatistikaService(XodimRepository xodimRepository, XodimlarYoshiStatistikaRepository xodimlarYoshiStatistikaRepository) {
        this.xodimRepository = xodimRepository;
        this.xodimlarYoshiStatistikaRepository = xodimlarYoshiStatistikaRepository;
    }

    public List<Xodim> listGet(){
        return xodimRepository.findAllByOrderByYoshi();
    }

    private void save(){
        XodimlarYoshiStatistika xodimlarYoshiStatistika=new XodimlarYoshiStatistika();
        long a=1;
        List<Xodim> xodims=listGet();
        for (int i = 0; i <xodims.size() ; i++) {
            a+=i;
            Xodim x=xodims.get(i);
            xodimlarYoshiStatistika.setId(a);
            xodimlarYoshiStatistika.setXodim(x);
            xodimlarYoshiStatistikaRepository.save(xodimlarYoshiStatistika);
        }
    }
}
