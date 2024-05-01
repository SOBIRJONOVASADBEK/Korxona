package springboot.korxona.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "bolim_korxona")
@Data
public class Bolim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String  name;
}
