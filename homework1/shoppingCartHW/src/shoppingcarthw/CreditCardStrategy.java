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
public class CreditCardStrategy implements PaymentStrategy {
    //define credit cart input(name,cartNumber,CVV,dateOfExpiry)
    private String name;
    private String cartNumber;
    private String cvv;
    private String dateOfExpiry;
    //define constructor
    public CreditCardStrategy(String name, String cartNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cartNumber = cartNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    //pay method from PaymentStrategy interface
    @Override
    public void pay(int total) {
        System.out.println(total+" paid with Credit Card");
    }
    
    
}
