package at.diefirma.ShoppingCartApp.presentation.web;

import at.diefirma.ShoppingCartApp.entity.CartItem;
import at.diefirma.ShoppingCartApp.entity.Customer;
import at.diefirma.ShoppingCartApp.sevice.CustomerService;
import at.diefirma.ShoppingCartApp.sevice.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private CustomerService customerService;


    @GetMapping("/cart")
    public String showShoppingCart(Model model,  Customer customer) {

        List<CartItem> items = shoppingCartService.findAllCarItems(customer);

        model.addAttribute("cartItems", items);

        return "shopping_cart";

    }

}
