package at.diefirma.ShoppingCartApp.sevice;

import at.diefirma.ShoppingCartApp.entity.CartItem;
import at.diefirma.ShoppingCartApp.entity.Customer;
import at.diefirma.ShoppingCartApp.persistence.CartItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ShoppingCartService {

    @Autowired
    private CartItemRepository repository;

    public List<CartItem> findAllCarItems(Customer customer) {

        return repository.findAllByCustomer(customer);

    }
}
