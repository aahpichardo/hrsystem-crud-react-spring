package gm.rh.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity //para que se cree la tabla con los atributos
@Data //para crear getters y setters
@NoArgsConstructor //para hacer constructor sin argumentos
@AllArgsConstructor //Constructor con todos los atributos
@ToString

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Generar automáticamente llave primaria con valor autoincrementable
    Integer idEmpleado;
    String nombre;
    String departamento;
    Double sueldo;
}
