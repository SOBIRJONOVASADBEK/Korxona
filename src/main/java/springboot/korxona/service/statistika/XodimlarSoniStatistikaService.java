package springboot.korxona.service.statistika;

import org.springframework.stereotype.Service;
import springboot.korxona.entity.Bolim;
import springboot.korxona.entity.Xodim;
import springboot.korxona.entity.statistika.XodimlarSoniStatistika;
import springboot.korxona.repository.XodimRepository;
import springboot.korxona.repository.statistika.XodimlarSoniStatistikaRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class XodimlarSoniStatistikaService {
    private final XodimRepository xodimRepository;
    private final XodimlarSoniStatistikaRepository xodimlarSoniStatistikaRepository;

    public XodimlarSoniStatistikaService(XodimRepository xodimRepository, XodimlarSoniStatistikaRepository xodimlarSoniStatistikaRepository) {
        this.xodimRepository = xodimRepository;
        this.xodimlarSoniStatistikaRepository = xodimlarSoniStatistikaRepository;
    }
    public List<XodimlarSoniStatistika> get(){
        save();
        List<XodimlarSoniStatistika> xodimlarSoniStatistikas=xodimlarSoniStatistikaRepository.findAll();
        return xodimlarSoniStatistikas;

    }
    public void save(){
        List<XodimlarSoniStatistika> list=new ArrayList<>();
        XodimlarSoniStatistika xodimlarSoniStatistika=new XodimlarSoniStatistika() ;
        List<Xodim> xodimlar=xodimRepository.findAll();
        for (int i = 0; i < xodimlar.size(); i++) {
            Xodim xodim=xodimlar.get(i);
            xodimlarSoniStatistika.setBolim(xodim.getBolim());
            xodimlarSoniStatistika.setXodimIsmi(xodim.getIsmi());
            xodimlarSoniStatistika.setId(xodim.getId());
            xodimlarSoniStatistikaRepository.save(xodimlarSoniStatistika);
        }
    }
}
