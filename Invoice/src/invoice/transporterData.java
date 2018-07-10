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
public class transporterData implements Serializable {
   public ArrayList<String> transporterName = new ArrayList<>();
   public ArrayList<String> GRNo =  new ArrayList<>();
   public ArrayList<String> GSTIN=new ArrayList<>();
   File file = new File("src//Transporter Data.ser");
      
  public void addData(String name,String Gr,String gst,int index){
 
      if(name!=null && name!="" && name.length()>=2)
      {       if(index==0 && name!="" && name.length()>=2)
          {   
       
                this.transporterName.add(name);
                if(Gr==null)
                    Gr="";
                if(gst==null)
                    gst="";
                this.GRNo.add(Gr);
               this.GSTIN.add(gst);
                writeData();
   }
      else if(name!="" && name.length()>=2) {
          index--; 
          this.GRNo.set(index, Gr);
           this.transporterName.set(index,name);
           this.GSTIN.set(transporterName.indexOf(name),gst);
             writeData();
          } 
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
    
    transporterData readData(){
        try {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //TransporterDetail td = new TransporterDetail();
         return (transporterData) ois.readObject();
        } catch (Exception e) {
            System.err.println("error "+e);
        return null;
        }
        
    }
    
    public String[] sendData(int index){
    --index;
        String[] trans=new String [3];
        
  
    for(int i=0; i<3;i++)
    {   
        trans[i]=new String();
    }
    trans[0]=transporterName.get(index);
    trans[1]=GRNo.get(index);
    trans[2]=GSTIN.get(index);
  return trans;  
    }
    
    int returnTransporterIndex(String name){
        if(this.transporterName.contains(name))
    return this.transporterName.indexOf(name);
        else return -1;
                
    }
    
}
