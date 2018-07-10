/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import javax.swing.JTextField;

/**
 *
 * @author DOSAJH
 */
public class DynamicFieldAddition {
   public JTextField sn;
   public JTextField desc;
    public JTextField hsn;
    public  JTextField qty;
      public JTextField rate;
       public JTextField unit;
        public JTextField value;
    public DynamicFieldAddition() {
    sn = new JTextField();
    value = new JTextField();
    qty = new JTextField();
    unit = new JTextField();
    rate = new JTextField();
    desc = new JTextField();
    hsn = new JTextField();
    sn.setSize(40,30);
    value.setSize(80,30);
    qty.setSize(40,30);
    unit.setSize(40,30);
    rate.setSize(80,30);
    desc.setSize(300,30);
    hsn.setSize(40,30);
    }

    
}
