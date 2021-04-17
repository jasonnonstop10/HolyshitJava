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
public class PaypalStrategy implements PaymentStrategy  {
    //define paypal input(emailID,passwordID)
    private String emailid;
    private String password;
    //define constructor
    public PaypalStrategy(String emailid, String password) {
        this.emailid = emailid;
        this.password = password;
    }
   //pay method from PaymentStrategy interface
    @Override
     public void pay(int total) {
        System.out.println(total+" paid with Paypal");
    }
}
