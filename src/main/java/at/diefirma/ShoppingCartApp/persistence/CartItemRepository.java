package at.diefirma.ShoppingCartApp.persistence;

import at.diefirma.ShoppingCartApp.entity.CartItem;
import at.diefirma.ShoppingCartApp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    List<CartItem> findAllByCustomer(Customer customer);
}
