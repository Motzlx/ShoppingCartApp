package at.diefirma.ShoppingCartApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "cart_items")
@Data
public class CartItem extends AbstractPersistable<Integer> {

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;



    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private Integer quantity;
}
