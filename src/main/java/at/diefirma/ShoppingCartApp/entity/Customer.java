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
@Table(name = "customers")
public  class Customer extends AbstractPersistable<Integer>  {

    private String firstName;
    private String lastName;

    private String eMail;




}
