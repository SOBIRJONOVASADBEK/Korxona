package springboot.korxona.controller.statistika;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.korxona.service.statistika.XodimlarSoniStatistikaService;

@RestController
@RequestMapping("/statistika")
public class XodimlarSoniController {
    private final XodimlarSoniStatistikaService xodimlarSoniStatistikaService;

    public XodimlarSoniController(XodimlarSoniStatistikaService xodimlarSoniStatistikaService) {
        this.xodimlarSoniStatistikaService = xodimlarSoniStatistikaService;
    }
    @GetMapping("/all")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(xodimlarSoniStatistikaService.get());
    }
}
