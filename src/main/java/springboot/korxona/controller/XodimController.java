package springboot.korxona.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.korxona.dto.XodimDto;
import springboot.korxona.entity.Xodim;
import springboot.korxona.service.XodimService;

import java.util.List;

@RestController
@RequestMapping("/xodim")
public class XodimController {
    private final XodimService xodimService;

    public XodimController(XodimService xodimService) {
        this.xodimService = xodimService;
    }
    @PostMapping
    public ResponseEntity<Xodim> save(@RequestBody XodimDto xodimDto){
        Xodim xodim=xodimService.save(xodimDto);
        return ResponseEntity.ok(xodim);
    }
    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        return ResponseEntity.ok(xodimService.getByXodim(id));
    }
    @GetMapping
    public ResponseEntity<List<Xodim>> getByXodim(){
        List<Xodim> xodim=xodimService.xodimlar();
        return ResponseEntity.ok(xodim);
    }
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id ,@RequestBody XodimDto xodimDto){
        Xodim xodim=xodimService.update(id,xodimDto);
        return ResponseEntity.ok(xodim);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        xodimService.delete(id);
        return ResponseEntity.ok("Xodim malumotlari o'chirildi");
    }
    
}
