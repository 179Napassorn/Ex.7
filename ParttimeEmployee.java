/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceorm;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author liatr
 */
@Entity
public class ParttimeEmployee extends AbstractEmployee implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int HoursWork;

    public int getHoursWork() {
        return HoursWork;
    }

    public void setHoursWork(int HoursWork) {
        this.HoursWork = HoursWork;
    }
    

}
