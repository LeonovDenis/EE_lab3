/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

import javax.ejb.Stateful;

/**
 *
 * @author denleo
 */
@Stateful
public class EJBDemo implements EJBDemoLocal {

    @Override
    public String getMassage(String local) {
        return "Hello";
    }

    @Override
    public Boolean login(String login, String psw) {
        return null;
    }

    
}
