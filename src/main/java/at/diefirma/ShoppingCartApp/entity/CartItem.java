package at.diefirma.ShoppingCartApp.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.*;

@Entity
@Table(name = "cart_items")
@Data
public class CartItem extends AbstractPersistable<Integer> {

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;




    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private Integer quantity;
}
