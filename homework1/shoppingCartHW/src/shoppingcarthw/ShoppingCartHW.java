/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcarthw;

/**
 *
 * @author Lenovo
 */
public class ShoppingCartHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define shoppingCart 
        ShoppingCart cart = new ShoppingCart();
        //create 2 Item 
        Item item1 = new Item("Food can", 50);
        Item item2 = new Item("jack in the box", 250);
        //add 2 Item
        cart.addItem(item1);
        cart.addItem(item2);

        //pay with Paypal
        cart.pay(new PaypalStrategy("tianwit.js@mail.kmutt.ac.th", "goodcodenotBUG10"));

        //pay with CreditCard
        cart.pay(new CreditCardStrategy("Tianwit Moungoycharoen", "61130500214", "144", "20/24"));
    }

}
