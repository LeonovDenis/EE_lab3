/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

import javax.ejb.Local;

/**
 *
 * @author denleo
 */
@Local
public interface EJBDemoLocal {

    String getMassage(String local);

    Boolean login(String login, String psw);
    
}
