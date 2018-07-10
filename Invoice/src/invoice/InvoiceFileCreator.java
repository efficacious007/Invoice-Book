/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import java.io.File;

/**
 *
 * @author DOSAJH
 */
public class InvoiceFileCreator {
   buyerData bd;
   sellerData sd;
           public InvoiceFileCreator(){
 File file = new File("Tax Invoice Bills");
 if(!file.exists()){
 file.mkdir();
 }
           }
  
}
