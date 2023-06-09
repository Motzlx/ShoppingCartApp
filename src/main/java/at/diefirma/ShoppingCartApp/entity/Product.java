package at.diefirma.ShoppingCartApp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "productsz")

public class Product extends AbstractPersistable<Integer>  {



    private String manufacturer;
    private String name;
    private float price;
    private Integer quantity;
}
