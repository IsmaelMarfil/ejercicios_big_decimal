package org.iesvdm.ejercicio4;

import java.time.LocalDate;

public class Test {

    public void testWebAccount() throws Exception{
        Address address1 = new Address("Gran Via", 1, "Madrid", "España");
        Phone phone1 = new Phone("657889900", "987677990");
        Customer customer1 = new Customer("1", address1, phone1, "elpepe@gmail.com");
        WebUser webUser = new WebUser("jose", "1234");
        Account account = new Account("1", address1, false, LocalDate.now());
        customer1.setAccount(account);
        customer1.setWebUser(webUser);
    }

}
