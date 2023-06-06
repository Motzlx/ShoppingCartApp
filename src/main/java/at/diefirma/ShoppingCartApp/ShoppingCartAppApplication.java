package at.diefirma.ShoppingCartApp;

import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCartAppApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartAppApplication.class, args);
	}

}
