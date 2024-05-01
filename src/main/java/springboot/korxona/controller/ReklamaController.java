package springboot.korxona.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.korxona.dto.ReklamaDto;
import springboot.korxona.entity.Reklama;
import springboot.korxona.service.ReklamaService;

import java.util.List;

@RestController
@RequestMapping("/reklama")
public class ReklamaController {
    private final ReklamaService reklamaService;

    public ReklamaController(ReklamaService reklamaService) {
        this.reklamaService = reklamaService;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody ReklamaDto reklamaDto){
        return ResponseEntity.ok(reklamaService.save(reklamaDto));
    }
    @GetMapping("/{name}")
    public ResponseEntity<List<Reklama>> getReklama(@PathVariable String name){
        return ResponseEntity.ok(reklamaService.getReklama(name));
    }
}
