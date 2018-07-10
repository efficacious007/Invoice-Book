
package invoice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author DOSAJH
 */
public class BankData implements Serializable {    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DOSAJH
 */
   public ArrayList<String> bankName = new ArrayList<>();
   public ArrayList<String> accNo =  new ArrayList<>();
   public ArrayList<String> ifsc=new ArrayList<>();
   public ArrayList<String> accType = new ArrayList<>();
   File file = new File("src//Bank Data.ser");
public void addData(String accNo,String bankName,String ifsc,String accType,int index){
 
          if(index==0 && bankName!=null && bankName.length()>=2)
          {   
                this.accNo.add(accNo);
                this.bankName.add(bankName);
               this.ifsc.add(ifsc);
               this.accType.add(accType);
                writeData();
   }
          else if(bankName!=null && index>0) {
           index--;
           this.bankName.set(index, bankName);
           this.ifsc.set(index, ifsc);
           this.accType.set(index, accType);
           
             writeData();
          } 
  
     }
    void writeData(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(this);
            oos.flush();
            oos.close();
        } 
        catch (Exception e) {
            System.err.println(""+e);
        }
    
    }
    
    BankData readData(){
        try {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //TransporterDetail td = new TransporterDetail();
         return (BankData) ois.readObject();
        } catch (Exception e) {
            System.err.println("error "+e);
        return null;
        }
        
    }
    
    public String[] sendData(int index){
    String[] bank=new String [4];
       
index--;
    bank[0]=this.bankName.get(index);
    bank[1]=this.accNo.get(index);;
    bank[2]=this.ifsc.get(index);
    bank[3]=this.accType.get(index);
    
  return bank;  
    }
    
    int returnBankIndex(String accNo){
        if(this.accNo.contains(accNo))
    return this.accNo.indexOf(accNo);
        else return -1;
                
    }
    
}



