/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author DOSAJH
 */
public class FileMaker {
    
    
    public FileMaker(){
     try{
      File file2 =  new File("src");
      if(!file2.exists()){
      file2.mkdir();
      }
     }
     catch (Exception e){
     e.printStackTrace();
     }   
        
        
        
        try {  
            File file = new File("src//Bank Data.ser");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    
         try {  
            File file = new File("src//Transporter Data.ser");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        } 
             try {  
            File file = new File("src//Buyer Data.ser");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        } 
        try {  
            File file = new File("src//Seller Data.ser");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        } 
    }
    
 /*  static void createDirForSeller(){
    
                
           try{
                sellerData sd = new sellerData();
                sd= sd.readData();
               
   File invoicebook = new File(sd.name.get(InvoiceItemsFrame.indSeller));
   if(!invoicebook.exists()){
   invoicebook.mkdir();
   }      
               createDirForBuyer(invoicebook);
              }
           catch(Exception e){
   e.printStackTrace();
           }

    }
 
   static File createDirForBuyer(File file){
    File buyerdir = new File("");
        try{
             buyerData bd = new buyerData();
             bd= bd.readData();
             String name,state;
             if(bd.cName.get(InvoiceItemsFrame.indBuyer)!=null)
             name = bd.cName.get(InvoiceItemsFrame.indBuyer);    
             else
                name ="No name";
             if(bd.address2.get(InvoiceItemsFrame.indBuyer)!=null)
                 state = bd.address2.get(InvoiceItemsFrame.indBuyer);
             else
                 state="No state";
             buyerdir = new File(file+"\\"+name+" STATE "+state);
           
        if(!buyerdir.exists()){
        buyerdir.mkdir();
        }
        return buyerdir;
        }
        catch (Exception e){
        e.printStackTrace();
        return buyerdir;
        }
       
     
    }
    
    */
}
