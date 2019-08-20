package mx.vitol.back.application.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Guests")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Usrs implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Id
    @Column(name = "Nombre Completo")
    private String name;

    @Column(name = "Empresa")
    private String empresa;

    @Column(name = "Giro")
    private String giro;

    @Column(name = "Puesto")
    private String puesto;

    @Column(name = "Correo electronico")
    private String email;

    @Column(name = "Celular")
    private String celular;

}