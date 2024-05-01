package springboot.korxona.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.korxona.dto.BolimDto;
import springboot.korxona.entity.Bolim;
import springboot.korxona.service.BolimService;

@RestController
@RequestMapping("/bolim")
public class BolimController {
    private final BolimService bolimService;

    public BolimController(BolimService bolimService) {
        this.bolimService = bolimService;
    }

    @PostMapping
    public ResponseEntity<Bolim> save(@RequestBody BolimDto bolimDto){
        Bolim bolim=bolimService.addBolim(bolimDto);
        return ResponseEntity.ok(bolim);
    }
}
