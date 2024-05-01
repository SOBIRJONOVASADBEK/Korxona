package springboot.korxona.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.korxona.dto.MijozDto;
import springboot.korxona.entity.Mijoz;
import springboot.korxona.service.MijozService;

import java.util.List;

@RestController
@RequestMapping("/mijoz")
public class MijozController {
    private final MijozService mijozService;

    public MijozController(MijozService mijozService) {
        this.mijozService = mijozService;
    }
    @PostMapping
    public ResponseEntity<Mijoz> save(@RequestBody MijozDto mijozDto){
        return ResponseEntity.ok(mijozService.save(mijozDto));
    }
    @PutMapping
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody MijozDto mijozDto){
        return ResponseEntity.ok(mijozService.update(id,mijozDto));
    }
    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        return ResponseEntity.ok(mijozService.getById(id));
    }
    @GetMapping
    public ResponseEntity getAll(){
        return ResponseEntity.ok(mijozService.getByMijoz());
    }
    @GetMapping("/{name}")
    public ResponseEntity<List<Mijoz>> finByMijozlar(@PathVariable String name){
        List<Mijoz> mijozlar=mijozService.xodimNameGetMijozLar(name);
        return ResponseEntity.ok(mijozlar);
    }
}
