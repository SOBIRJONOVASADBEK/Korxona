package springboot.korxona.service;

import org.springframework.stereotype.Service;
import springboot.korxona.dto.MijozDto;
import springboot.korxona.entity.Mijoz;
import springboot.korxona.entity.Xodim;
import springboot.korxona.repository.MijozRepository;
import springboot.korxona.repository.XodimRepository;

import java.util.List;

import static springboot.korxona.mapper.Mapper.mapToMijoz;
import static springboot.korxona.mapper.Mapper.mapToMijozDto;

@Service
public class MijozService {
    private final MijozRepository mijozRepository;
    private final XodimRepository xodimRepository;

    public MijozService(MijozRepository mijozRepository, XodimRepository xodimRepository) {
        this.mijozRepository = mijozRepository;
        this.xodimRepository = xodimRepository;
    }
    public Mijoz save(MijozDto mijozDto){
        Mijoz mijoz=mapToMijoz(mijozDto);
        return mijozRepository.save(mijoz);
    }
    public Mijoz update(Long id,MijozDto mijozDto){
        Mijoz mijoz=mijozRepository.findById(id).get();
        mijoz.setIsmi(mijozDto.getIsmi());
        mijoz.setFamiliyasi(mijozDto.getFamiliyasi());
        mijoz.setSharifi(mijozDto.getSharifi());
        mijoz.setPassport_seriyasi(mijozDto.getPassport_seriyasi());
        mijoz.setPassport_raqam(mijozDto.getPassport_raqam());
        mijoz.setJshshir(mijozDto.getJshshir());
        mijoz.setMillati(mijozDto.getMillati());
        mijoz.setYashash_manzili(mijozDto.getYashash_manzili());
        mijoz.setYoshi(mijozDto.getYoshi());
        mijoz.setXodim(mijozDto.getXodim());
        mijoz.setDate(mijozDto.getDate());
        return mijoz;
    }
    public MijozDto getById(Long id){
        Mijoz mijoz=mijozRepository.findById(id).get();
        MijozDto mijozDto=mapToMijozDto(mijoz);
        return mijozDto;
    }
    public Xodim getByName(String name){
        Xodim xodim=xodimRepository.findByIsmi(name);
        return xodim;
    }
    public List<Mijoz> xodimNameGetMijozLar(String name){
        Xodim xodim=getByName(name);
        List<Mijoz> mijozlar=mijozRepository.findByXodim(xodim);
        return mijozlar;
    }
    public List<Mijoz> getByMijoz(){
        List<Mijoz> mijozlar=mijozRepository.findAll();
        return mijozlar;
    }

}
