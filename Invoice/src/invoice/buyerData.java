/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class buyerData implements Serializable{
    ArrayList<String> cName=new ArrayList<>();
    ArrayList<String> gst=new ArrayList<>();
    ArrayList<String> address1 = new ArrayList<>();
    ArrayList<String> address2 = new ArrayList<>();
  File file = new File("src//Buyer Data.ser");
    public void addData(String bname,String bgst,String baddress1,String baddress2,int index){
   
    
    if(index==0){
        if(baddress1==null)
            baddress1="";
        if(baddress2==null)
            baddress2="";
        if(bgst==null)
            bgst="";
        if(bname==null)
            bname="";
    this.address1.add(baddress1);
    this.address2.add(baddress2);
    this.gst.add(bgst);
    this.cName.add(bname);
    
    writeData();
    }
    else{
        index--;
    this.address1.set(index,baddress1);
    this.address2.set(index,baddress2);
    this.gst.set(index,bgst);
    this.cName.set(index,bname);
    writeData();
    }
    
    }
    
   public void writeData(){
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
    
   public buyerData readData(){
        try {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
         return (buyerData) ois.readObject();
        } catch (Exception e) {
           System.err.println("error bd  reading eroor "+e);
            return null;
        }
        
    }
   
    public String[] sendData(int index){
    String[] buy=new String [4];
     
   
     index--;
    buy[0]=cName.get(index);
    buy[1]=gst.get(index);
    buy[2]=address1.get(index);
    buy[3]=address2.get(index);
            
    
    
    
  return buy;  
    }
    
    int returnBuyerIndex(String name, String state){
    int index=-1;    
   // System.out.println("name"+name+" "+state);
    if(cName.contains(name) && address2.contains(state)){
   
        for(int i=0; i<cName.size();i++)
   {
   if(name.equals(cName.get(i)) && state.equals(address2.get(i))){
   index = i;
   break;
   }
   
   }
    }
    return index;
    }
}
