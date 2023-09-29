package org.iesvdm.ejercicio4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        WebUser webuser2 = new WebUser("paco", "4321");
        Account account2 = new Account("2", new Address("Goya", 12, "Madrid", "España"),false, LocalDate.now() );
        customer2.setAccount(account2);
        customer2.setWebUser(webuser2);
        Supplier s1 = new Supplier("A667865", "Fruteria Garcia");
        Product p1 = new Product("1", "Naranja", s1);
        Product p2 = new Product("2", "Banana", s1);
        ShoppingCart sc1 = new ShoppingCart(LocalDate.now());
        ShoppingCart sc2 = new ShoppingCart(LocalDate.now());
        webUser.setShoppingCart(sc1);
        webuser2.setShoppingCart(sc2);
        account.setShoppingCart(sc1);
        account2.setShoppingCart(sc2);
        LineItem li1 = new LineItem(1, new Price(BigDecimal.TWO, BigDecimal.ONE));
        li1.setProduct(p1);
        LineItem li2 = new LineItem(1, new Price(BigDecimal.TWO, BigDecimal.ONE));
        li2.setProduct(p2);
        List<LineItem>sli1 = new ArrayList<>();
        List<LineItem> sli2 = new ArrayList<>();
        sli1.add(li1);
        sli2.add(li2);
        sc1.setLineItemSet(sli1);
        sc2.setLineItemSet(sli2);
        Order order = new Order("1", LocalDate.now(), LocalDate.now(), address1, new BigDecimal(45.61));
        Payment payment = new Payment("1", LocalDate.now(), new BigDecimal(33.33), "Pagado con tarjeta");
        List<Payment> paymentList = new ArrayList<>();
        paymentList.add(payment);
        order.setPaymentList(paymentList);
        order.setLineItemList(sli1);
        Assertions.assertEquals("jose", webUser.getLogin_id());
        Assertions.assertEquals("paco", webuser2.getLogin_id());
        Assertions.assertEquals("1", p1.getId());
        Assertions.assertEquals("2", p2.getId());
        Assertions.assertEquals("1", sc1.getLineItemSet().get(0).getProduct().getId());
        Assertions.assertEquals("2", sc2.getLineItemSet().get(0).getProduct().getId());
        Assertions.assertEquals("1", order.getLineItemList().get(0).getProduct().getId());
        }

}
