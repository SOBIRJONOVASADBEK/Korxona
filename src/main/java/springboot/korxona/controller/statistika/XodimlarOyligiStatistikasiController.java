package springboot.korxona.controller.statistika;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.korxona.entity.statistika.XodimlarMaoshiUmumiySummaOylik;
import springboot.korxona.service.statistika.XodimlarMaoshiUmumiySummaOylikService;

@RestController
@RequestMapping("/statistika")
public class XodimlarOyligiStatistikasiController {
    private final XodimlarMaoshiUmumiySummaOylikService xodimlarMaoshiUmumiySummaOylikService;

    public XodimlarOyligiStatistikasiController(XodimlarMaoshiUmumiySummaOylikService xodimlarMaoshiUmumiySummaOylikService) {
        this.xodimlarMaoshiUmumiySummaOylikService = xodimlarMaoshiUmumiySummaOylikService;
    }

    @GetMapping("/oyligi")
    public ResponseEntity getOyligi(){
        return ResponseEntity.ok(xodimlarMaoshiUmumiySummaOylikService.save());
    }
}
