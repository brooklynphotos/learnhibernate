package photos.brooklyn.learnhibernate.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="ShoppingStore")
public class ShoppingStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Size(max = 100)
    private String name;

    public ShoppingStore(){}
}
