package springboot.korxona.controller.statistika;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.korxona.entity.Xodim;
import springboot.korxona.service.statistika.XodimlarYoshiStatistikaService;

import java.util.List;

@RestController
@RequestMapping("/statistika")
public class XodimlarYoshiStatistikaController {
    private final XodimlarYoshiStatistikaService xodimlarYoshiStatistikaService;

    public XodimlarYoshiStatistikaController(XodimlarYoshiStatistikaService xodimlarYoshiStatistikaService) {
        this.xodimlarYoshiStatistikaService = xodimlarYoshiStatistikaService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Xodim>> getAll(){
        return ResponseEntity.ok(xodimlarYoshiStatistikaService.listGet());
    }
}
