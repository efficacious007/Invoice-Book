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
public class sellerData implements Serializable {
                                                            
    public ArrayList <String> name = new ArrayList<>();
    public ArrayList<String> address = new ArrayList<>();
    public ArrayList<String> ph = new ArrayList<>();
    public ArrayList<String> pin = new ArrayList<>();
    public ArrayList <String> state = new ArrayList<>();
    public ArrayList <String> country = new ArrayList<>();
    public ArrayList<String> prefix = new ArrayList<>();
    public ArrayList <Integer> incValue = new ArrayList<>();
    public ArrayList <String> gst = new ArrayList<>();
  File file = new File("src//Seller Data.ser");

    
   public void receiveData(String sname,String sgst,String saddress,String sstate,String spin,String scountry,String sph,String sprefix,int incV,int index){
    
   // sellerData sd = new sellerData();
    //   System.out.println("sname"+sname);
  
        if(index==0){
       //       System.out.print("adding seller data data reading\n");
              if(sname==null)
                  sname="";
               if(saddress==null)
                   saddress="";
               if(sph==null)
                   sph="";
               if(sstate==null)
                   sstate="";
               if(spin==null)
                   spin="";
               if(scountry==null)
                   scountry="";
               if(sprefix==null)
                   sprefix="";
               if(sgst==null)
                   sgst="";
    this.name.add(sname);
    this.address.add(saddress);
    this.ph.add(sph);
    this.state.add(sstate);
    this.pin.add(spin);
    this.country.add(scountry);
    if(!Invoice.quotation)
    this.prefix.add(sprefix);
    this.gst.add(sgst);
    if(!Invoice.quotation)
    this.incValue.add(incV);
    
        //    System.err.println("writting data");
    writeData();    
        
        }
        else{
            index--;
    this.name.set(index,sname);
    this.address.set(index,saddress);
    this.ph.set(index,sph);
    this.state.set(index,sstate);
    this.pin.set(index,spin);
    this.country.set(index,scountry);
    if(!Invoice.quotation)
    this.prefix.set(index,sprefix);
    this.gst.set(index,sgst);
    if(!Invoice.quotation)
    this.incValue.set(index,incV);
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
        }
    
    }
    
  public sellerData readData(){
        try {
           
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
         return (sellerData) ois.readObject();
        } catch (Exception e) {
        //    System.err.println("error "+e);
        return null;
        }
        
    }
  
    public String[] sendData(int index){
 //System.out.println("INDEX"+ index);
        String[] sell=new String [9];
  if(index>0) 
  index=index-1;

        for(int i=0; i<9;i++)
    {   
        sell[i]=new String();
    }
    sell[0]=name.get(index);
  //   System.err.println(sell[0] + " sell 1"+sell[1]);
    sell[1]=gst.get(index);
    sell[2]=address.get(index);
    sell[3]=state.get(index);
    sell[4]=pin.get(index); 
    sell[5]=country.get(index);
    sell[6]=ph.get(index);
     //.err.println("ph + "+sell[6]);
    sell[7]=prefix.get(index);
    if(Invoice.quotation){
        sell[8]=""+(this.incValue.get(index));
    //    this.incValue.set(index, this.incValue.get(index));
        writeData();
    }
    else 
    {   this.incValue.set(index, this.incValue.get(index)+1);
        sell[8]=""+(this.incValue.get(index));
        
        writeData();
    }

    
  
  return sell;  
    }
    
    int returnSellerIndex(String name){
    if(this.name.contains(name))
    {return this.name.indexOf(name);
    }
    else return -1;
    }
    
    void updateIncVal(int SELLERINDEX,int value){
    this.incValue.set(SELLERINDEX, value);
    writeData();
    }
    
}
