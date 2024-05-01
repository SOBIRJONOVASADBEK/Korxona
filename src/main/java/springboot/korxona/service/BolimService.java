package springboot.korxona.service;

import org.springframework.stereotype.Service;
import springboot.korxona.dto.BolimDto;
import springboot.korxona.entity.Bolim;
import springboot.korxona.repository.BolimRepository;

import static springboot.korxona.mapper.Mapper.mapToBolim;

@Service
public class BolimService {
    private final BolimRepository bolimRepository;

    public BolimService(BolimRepository bolimRepository) {
        this.bolimRepository = bolimRepository;
    }
    public Bolim addBolim(BolimDto bolimDto){
        Bolim bolim=mapToBolim(bolimDto);
        return bolimRepository.save(bolim);
    }
}
