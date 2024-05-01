package springboot.korxona.service;

import org.springframework.stereotype.Service;
import springboot.korxona.dto.XodimDto;
import springboot.korxona.entity.Xodim;
import springboot.korxona.repository.XodimRepository;

import java.util.List;

import static springboot.korxona.mapper.Mapper.mapToXodim;
import static springboot.korxona.mapper.Mapper.mapToXodimDto;


@Service
public class XodimService {
    private final XodimRepository xodimRepository;

    public XodimService(XodimRepository xodimRepository) {
        this.xodimRepository = xodimRepository;
    }
    public Xodim save(XodimDto xodimDto){
        Xodim xodim=mapToXodim(xodimDto);
        return xodimRepository.save(xodim);
    }
    public Xodim getByXodim(Long id){
        Xodim xodim=xodimRepository.findById(id).get();
        return xodim;
    }
    public List<Xodim> xodimlar(){
        List<Xodim> xodim=xodimRepository.findAll();
        return xodim;
    }
    public Xodim update(Long id,XodimDto xodimDto){
       Xodim xodim=xodimRepository.findById(id).get();
        xodim.setIsmi(xodimDto.getIsmi());
        xodim.setFamiliyasi(xodimDto.getFamiliyasi());
        xodim.setSharifi(xodimDto.getSharifi());
        xodim.setIsh_xaqqi(xodimDto.getIsh_xaqqi());
        xodim.setJshshir(xodimDto.getJshshir());
        xodim.setPassport_raqam(xodimDto.getPassport_raqam());
        xodim.setMillati(xodimDto.getMillati());
        xodim.setYashash_manzili(xodimDto.getYashash_manzili());
        xodim.setPassport_seriyasi(xodimDto.getPassport_seriyasi());
        xodim.setYoshi(xodimDto.getYoshi());
       return xodim;
    }
    public void  delete(Long id){
        xodimRepository.deleteById(id);
    }
}
