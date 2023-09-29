package org.iesvdm.ejercicio4;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWebShop {
@Test
    public void testWebAccount() throws Exception{
        Address address1 = new Address("Gran Via", 1, "Madrid", "España");
        Phone phone1 = new Phone("657889900", "987677990");
        Customer customer1 = new Customer("1", address1, phone1, "elpepe@gmail.com");
        WebUser webUser = new WebUser("jose", "1234");
        Account account = new Account("1", address1, false, LocalDate.now());
        customer1.setAccount(account);
        customer1.setWebUser(webUser);
        Customer customer2 = new Customer("2", new Address("Goya", 12, "Madrid","España"),new Phone("666666666", "999999999"), "paco22@gmail.com");
        WebUser webuser2 = new WebUser("2", "4321");
        Account account2 = new Account("2", new Address("Goya", 12, "Madrid", "España"),false, LocalDate.now() );
        customer2.setAccount(account2);
        customer2.setWebUser(webuser2);
    Assertions.assertEquals("");
}

}
