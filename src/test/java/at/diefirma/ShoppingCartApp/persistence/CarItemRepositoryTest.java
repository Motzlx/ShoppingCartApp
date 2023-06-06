package at.diefirma.ShoppingCartApp.persistence;

import at.diefirma.ShoppingCartApp.entity.CartItem;
import at.diefirma.ShoppingCartApp.entity.Customer;
import at.diefirma.ShoppingCartApp.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class CarItemRepositoryTest  {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testAddOneCartItem() {
        CartItem cartItem = new CartItem();
        Product product = entityManager.find(Product.class, 21);
        Customer customer = entityManager.find(Customer.class,56);

        cartItem.setProduct(product);
        cartItem.setCustomer(customer);
        cartItem.setQuantity(53);

        CartItem cartItem1 = cartItemRepository.save(cartItem);

        assertTrue(cartItem1.getId()!= 0);

    }

}
