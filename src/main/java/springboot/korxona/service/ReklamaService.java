package springboot.korxona.service;

import org.springframework.stereotype.Service;
import springboot.korxona.dto.ReklamaDto;
import springboot.korxona.entity.Reklama;
import springboot.korxona.entity.Xodim;
import springboot.korxona.repository.ReklamaRepository;
import springboot.korxona.repository.XodimRepository;

import java.util.List;

import static springboot.korxona.mapper.Mapper.MapToReklama;

@Service
public class ReklamaService {
    private final ReklamaRepository repository;
    private final XodimRepository xodimRepository;

    public ReklamaService(ReklamaRepository repository, XodimRepository xodimRepository) {
        this.repository = repository;
        this.xodimRepository = xodimRepository;
    }

    public Reklama save(ReklamaDto reklamaDto){
        Reklama reklama=MapToReklama(reklamaDto);
        return repository.save(reklama);
    }
    public Xodim getByName(String name){
        Xodim xodim=xodimRepository.findByIsmi(name);
        return xodim;
    }
    public List<Reklama> getReklama(String name){
        Xodim xodim=getByName(name);
        List<Reklama> reklama=repository.findByXodim(xodim);
        return reklama;
    }
}
