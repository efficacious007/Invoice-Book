
package invoice;


import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 

import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment; 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class PdfGenerator {
    
    
    
    PdfGenerator(){
 
 }
    
    PdfGenerator(DynamicFieldAddition dfa[]){
                      try{
                          System.out.println("index SELLER"+InvoiceItemsFrame.indSeller);
                          System.out.println("index BUYER"+InvoiceItemsFrame.indBuyer);
                          System.out.println("index TRANS"+InvoiceItemsFrame.indTrans);
                          System.out.println("index BANK"+InvoiceItemsFrame.indBank);
                          
                String INVOICE = new String("");
                buyerData bd = new buyerData();
                bd= bd.readData();
                String FILENAME;
                sellerData sd = new sellerData();
     
                sd= sd.readData();
              
                File file = new File("Quotation");
                if(!file.exists()){
                file.mkdir();
                } 
                File f;
                
                if(!Invoice.quotation)
                {String str = sd.name.get(InvoiceItemsFrame.indSeller);
                str = str.replaceAll("/", "-");
                str = str.replaceAll("\"", "-");
                
                f  = new File("Tax Invoice Bills\\"+str);
                }
                else 
                {
                    String str = sd.name.get(InvoiceItemsFrame.indSeller);
                str = str.replaceAll("/", "-");
                str = str.replaceAll("\"", "-");
                
                    f =   new File("Quotation\\"+str);
                }
         if(!f.exists())
         f.mkdir();
     
     String str2 = bd.cName.get(InvoiceItemsFrame.indBuyer);
     if(str2==null)
         str2="";
     str2 = str2.replaceAll("\"", "-");
     str2 = str2.replaceAll("/", "-");
     String str3 = bd.address2.get(InvoiceItemsFrame.indBuyer);
     if(str3==null)
         str3="";
     str3 = str3.replaceAll("\"", "-");
     str3 = str3.replaceAll("/","-");
     File f2 = new File(f,str2+" state "+str3);
     if(!f2.exists())
         f2.mkdir();
File f3;
     if(!Invoice.quotation){
       INVOICE =  InvoiceItemsFrame.InvoicePrefix.getText();
       if(INVOICE!=null)
          INVOICE = INVOICE.replaceAll("\"", "-");
       if(INVOICE==null)
           INVOICE="";
       INVOICE =  INVOICE.replaceAll("/", "-");
       String invinc = InvoiceItemsFrame.textFieldInvoiceIncVal.getText();
       if(invinc==null)
           invinc="";
       f3 = new File(f2,INVOICE+invinc+"original for recipient.pdf");
       FILENAME = INVOICE+".pdf" ;
      
     
     }    
     else 
     { String DATE;
     DATE = InvoiceItemsFrame.DATE.getText().replaceAll("/", "-");
     DATE = InvoiceItemsFrame.DATE.getText().replaceAll("\"", "-");
         f3 = new File(f2,sd.name.get(InvoiceItemsFrame.indSeller)+"("+DATE+")"+".pdf");       
     FILENAME = sd.name.get(InvoiceItemsFrame.indSeller)+"("+DATE+")"+".pdf";
         
     if(!f3.createNewFile()){
         int i=1;
     while(!f3.createNewFile()){
     f3 = new File(f2,sd.name.get(InvoiceItemsFrame.indSeller)+"("+InvoiceItemsFrame.DATE.getText()+")"+i+".pdf");       
     FILENAME = sd.name.get(InvoiceItemsFrame.indSeller)+"("+DATE+")"+i+".pdf";
     i++;
     }
     }
     }
         PdfDocument pdfDoc = new PdfDocument(new PdfWriter(new FileOutputStream(f3)));
         Document  doc = new Document(pdfDoc, new PageSize(595, 842));
         
  
      
	        doc.setMargins(20, 20, 20, 20);
                 Paragraph heading;
                if(!Invoice.quotation){
                heading= new Paragraph("TAX INVOICE                                          (original for recipient)");
               
                }
                else
                {heading = new Paragraph("Quotation");
                heading.setTextAlignment(TextAlignment.CENTER);
	        
                }
                
                heading.setFontSize(12);
                Table table = new Table(10);
                table.setHeight(780);
	        table.setMarginTop(0);
	        table.setMarginBottom(0);
                Paragraph p[] = new Paragraph[16];
                Cell cell[] = new Cell[16];
                Cell cell2[] = new Cell[140];
                Paragraph p2[] = new Paragraph [140];
                Cell cell3[] = new Cell[15];
                Paragraph p3 [] = new Paragraph[15];
                Cell cell4 []= new Cell[27];
                Paragraph p4[]= new Paragraph[27];
                int serialItem=1;
      
                                  
             
  
                transporterData td = new transporterData();
                td = td.readData();
                BankData bankdata = new BankData();
                bankdata=bankdata.readData();
                if(bankdata==null)
                {
                bankdata= new BankData();
                }
                if(td==null)
                {
                td = new transporterData();
                }
                for(int i=0; i<16; i++)
                {
                    p[i]=new Paragraph();
                    p[i].setFontSize(9);
                    if(InvoiceItemsFrame.indSeller>=0){
                    if(i==0)
                    {
                    p[i]=new Paragraph(sd.name.get(InvoiceItemsFrame.indSeller));
                    p[i].setFontSize(14);
                    }
                    else if(i==1)
                    {
                    if(InvoiceItemsFrame.InvoicePrefix.getText()==null)
                        System.out.println("Invoice Number null");
                    if(!Invoice.quotation)
                    {   String st = InvoiceItemsFrame.InvoicePrefix.getText();
                 //   st=st.replaceAll("\"", "-");
                   // st=st.replaceAll("/", "-");
                   String num = InvoiceItemsFrame.textFieldInvoiceIncVal.getText();
                   if(num==null)
                       num="";
                    p[i]=new Paragraph("Invoice No:- "+st+num);
                    
                    }else 
                    p[i]=new Paragraph("Quotation");    
                    p[i].setFontSize(10);
                    
                    }
                    else if(i==2){
                        String st = sd.address.get(InvoiceItemsFrame.indSeller);
                    if(sd.address.get(InvoiceItemsFrame.indSeller)==null)    
                    {
                        st="";
              //      System.out.println("seller index null");
                    }
                    p[i]=new Paragraph(st);
                    p[i].setFontSize(10);
                    
                            }
                    else if(i==3){
                        if(InvoiceItemsFrame.DATE.getText()!=null)
                         p[i]=new Paragraph("Date:- "+InvoiceItemsFrame.DATE.getText());
                        else 
                            p[i]=new Paragraph("");//DATE
                    p[i].setFontSize(10);
                    }
                    else if(i==4){
                      if(sd.state.get(InvoiceItemsFrame.indSeller)!=null && sd.pin.get(InvoiceItemsFrame.indSeller)!=null && sd.ph.get(InvoiceItemsFrame.indSeller)!=null)  
                      p[i]=new Paragraph(sd.state.get(InvoiceItemsFrame.indSeller)+" - "+sd.pin.get(InvoiceItemsFrame.indSeller)+" Tel No :- "+sd.ph.get(InvoiceItemsFrame.indSeller));
                      else 
                          p[i]=new Paragraph();
                      p[i].setFontSize(10);
                    }
                    else if(i==5){
                        String DeliverADD;
                        if(InvoiceItemsFrame.DeliveryADD.getText()==null)
                        DeliverADD ="";   
                        else 
                         DeliverADD = InvoiceItemsFrame.DeliveryADD.getText();
                    p[i]=new Paragraph("Delivery At:- "+DeliverADD);
                    p[i].setFontSize(10);
                    }
                    else if(i==6){
                      p[i]=new Paragraph("GSTIN:- "+sd.gst.get(InvoiceItemsFrame.indSeller));
                    p[i].setFontSize(10);
                    }
                 
                    else if(i==7){
                       String DeliveryADD2;
                        if(InvoiceItemsFrame.DeliveryADD2.getText()==null)
                        DeliveryADD2 ="";   
                        else 
                         DeliveryADD2 = InvoiceItemsFrame.DeliveryADD2.getText();
                        p[i]=new Paragraph("PO NO:- "+DeliveryADD2);
                    p[i].setFontSize(10);
                    }
                    }
                    
                    if(InvoiceItemsFrame.indBuyer>=0){
                     if(i==8){
                         if(bd.cName.get(InvoiceItemsFrame.indBuyer)!=null)
                      p[i]=new Paragraph("Buyer Name:- M/s "+bd.cName.get(InvoiceItemsFrame.indBuyer));
                        
                         p[i].setFontSize(10);
                    }
                    else if(i==10){
                        if(bd.address1.get(InvoiceItemsFrame.indBuyer)!=null)
                      p[i]=new Paragraph("Address:- "+bd.address1.get(InvoiceItemsFrame.indBuyer));
                    p[i].setFontSize(10);
                    }
                     else if(i==12){
                         if(bd.address2.get(InvoiceItemsFrame.indBuyer)!=null)
                      p[i]=new Paragraph(bd.address2.get(InvoiceItemsFrame.indBuyer));
                    p[i].setFontSize(10);
                    }
                    else if(i==14){
                        if(bd.gst.get(InvoiceItemsFrame.indBuyer)!=null)
                      p[i]=new Paragraph("GSTIN:- "+bd.gst.get(InvoiceItemsFrame.indBuyer));
                        // System.out.println("no problem from reading");
                      p[i].setFontSize(10);
                    }
                    }
                   if(InvoiceItemsFrame.indTrans>=0){
                   if(i==9){
                       if(td!=null && td.transporterName.get(InvoiceItemsFrame.indTrans)!=null)
                      p[i]=new Paragraph("Transporter Name:- "+td.transporterName.get(InvoiceItemsFrame.indTrans));
                    p[i].setFontSize(10);
                    }
                   if(i==11){
                       if(td!=null && td.GRNo.get(InvoiceItemsFrame.indTrans)!=null)
                      p[i]=new Paragraph("GR No:- "+td.GRNo.get(InvoiceItemsFrame.indTrans));
                      p[i].setFontSize(10);
                    }
                    if(i==15){
                        if(td!=null && td.GSTIN.get(InvoiceItemsFrame.indTrans)!=null)
                      p[i]=new Paragraph("GSTIN:- "+td.GSTIN.get(InvoiceItemsFrame.indTrans));
                      p[i].setFontSize(10);
                    }
                   
                   } 
                   else if(InvoiceItemsFrame.indTrans<0){
                     if(i==9){
                       //if(td!=null && td.transporterName.get(InvoiceItemsFrame.indTrans)!=null)
                      p[i]=new Paragraph("Transporter Name:- ");
                    p[i].setFontSize(10);
                    }
                   if(i==11){
                    //   if(td!=null && td.GRNo.get(InvoiceItemsFrame.indTrans)!=null)
                      p[i]=new Paragraph("GR No:- ");
                      p[i].setFontSize(10);
                    }
                    if(i==15){
                     //   if(td!=null && td.GSTIN.get(InvoiceItemsFrame.indTrans)!=null)
                      p[i]=new Paragraph("GSTIN:- ");
                      p[i].setFontSize(10);
                    }
                   
                   }
                    if(i<16){
                     cell[i]=new Cell(1,6).add(p[i]);
                    }
                    else{
                     cell[i]=new Cell(1,1).add(p[i]);
                    
                    }
                    
                    
                    cell[i].setBorderBottom(null);
                    if(i==0 || i==1 || i==5 || i==8 || i==9)
                    {
                        
                    }
                    else{
                    cell[i].setBorderTop(null);
                    
                    }
                    cell[i].setPaddings(2, 2, 2, 2);
                    table.addCell(cell[i]);
                }
                
                System.out.print("items printing");
                for(int i=0; i<140; i++)
                {
                    p2[i]=new Paragraph("");
                    p2[0]=new Paragraph("Sno");
                    p2[1]=new Paragraph("Description");
                    p2[2]=new Paragraph("HSN");
                    p2[3]=new Paragraph("Qty");
                    p2[4]=new Paragraph("Unit");
                    p2[5]=new Paragraph("Rate in Rs");
                    p2[6]=new Paragraph("Taxable Value in Rs");
                      if(i%7==0 && i!=0)
                    {
                        if(serialItem<=InvoiceItemsFrame.SerialNo)
                    p2[i]=new Paragraph(dfa[serialItem].sn.getText());
                    
                    }
                      else if(i%7==1 && i>7 && serialItem<=InvoiceItemsFrame.SerialNo){
                         if(dfa[serialItem].desc.getText()!=null)
                    p2[i]=new Paragraph(dfa[serialItem].desc.getText());
                     }
                      else if(i%7==2 && i>7 && serialItem<=InvoiceItemsFrame.SerialNo){
                      if(dfa[serialItem].hsn.getText()!=null)    
                      p2[i]=new Paragraph(dfa[serialItem].hsn.getText());
                      } 
                      else if(i%7==3 && i>7 && serialItem<=InvoiceItemsFrame.SerialNo){
                      if(dfa[serialItem].qty.getText()!=null)    
                       p2[i]=new Paragraph(dfa[serialItem].qty.getText());
 
                                       }
                       else if(i%7==4 && i>7 && serialItem<=InvoiceItemsFrame.SerialNo){
                        if(dfa[serialItem].unit.getText()!=null)
                    p2[i]=new Paragraph(dfa[serialItem].unit.getText());
                        }
                       else if(i%7==5 && i>7 && serialItem<=InvoiceItemsFrame.SerialNo){
                           if(dfa[serialItem].rate.getText()!=null)
                    p2[i]=new Paragraph(dfa[serialItem].rate.getText());
                     }
                       else if(i%7==6 && i>7 && serialItem<=InvoiceItemsFrame.SerialNo){
                           if(dfa[serialItem].value.getText()!=null)
                    p2[i]=new Paragraph(dfa[serialItem].value.getText());
                    serialItem++;
                     }
                    p2[i].setFontSize(9);
                    
                   if(i%7==1)
                   {cell2[i]=new Cell(1,4).add(p2[i]);        
                   cell2[i].setWidthPercent(50);
                   
                  
                   }
	        	
	        	else
                   {cell2[i]=new Cell(1,1).add(p2[i]);}
	              // cell2[i].setHeight(15); 	
	          if(i%7==0)
                  { cell2[i].setWidthPercent(4);}
                  
	          else if(i%7==2 || i%7==3)
                  { cell2[i].setWidthPercent(5);}
	          else if(i%7==4)
                  {	  cell2[i].setWidthPercent(6);
                  }
                
                  else if(i%7==5){
                  cell2[i].setWidthPercent(12);
              
                  }
                  else if(i%7==6){
                  cell2[i].setWidthPercent(18);
              
                  }
                  if(i>=0 && i<14){}
                  else{
                   cell2[i].setBorderTop(null);
                  }
                   cell2[i].setBorderBottom(null);
                    
                  
                    
                    
                    cell2[i].setPaddings(2, 2, 2, 2);
                    
                    
                    table.addCell(cell2[i]);
                }
                
            
     String money = InvoiceItemsFrame.moneyInWords2.getText();
     for(int i=0; i<15; i++)
                {
                    p3[i]=new Paragraph("");
                    if(InvoiceItemsFrame.indBank>=0){
                      if(bankdata!=null && bankdata.bankName.get(InvoiceItemsFrame.indBank)!=null)
                    p3[6]= new Paragraph("Bank Details:- "+bankdata.bankName.get(InvoiceItemsFrame.indBank));
                      if(bankdata!=null && bankdata.accNo.get(InvoiceItemsFrame.indBank)!=null && bankdata.ifsc.get(InvoiceItemsFrame.indBank)!=null && bankdata.accType.get(InvoiceItemsFrame.indBank)!=null)
                    p3[9]=new Paragraph("Acc No:- "+bankdata.accNo.get(InvoiceItemsFrame.indBank)+" IFSC:- "+bankdata.ifsc.get(InvoiceItemsFrame.indBank)+" Type:- "+bankdata.accType.get(InvoiceItemsFrame.indBank));
                    }
                    try{
                      if(money!=null)
                      p3[0]=new Paragraph("Total Amount (in words):- "+money);
                      }
                      catch(Exception e){
                      System.out.println("PDFGENERATOR INWORDS MONEY PARAGRAPH"+e);
                      }
                      p3[1]=new Paragraph("Total Taxable Values");
                if(InvoiceItemsFrame.sgstpercent.getText()!=null)
                {  p3[4]=new Paragraph("SGST @"+InvoiceItemsFrame.sgstpercent.getText()+"%");
                }else
                {p3[4]=new Paragraph("SGST @");
                }
                if(InvoiceItemsFrame.cgstpercent.getText()!=null)
                {    
                p3[7]=new Paragraph("CGST @"+InvoiceItemsFrame.cgstpercent.getText()+"%");
                }
                else{
                p3[7]=new Paragraph("CGST @");
                
                }
                if(InvoiceItemsFrame.igstpercent.getText()!=null)
                {p3[10]=new Paragraph("IGST @"+InvoiceItemsFrame.igstpercent.getText()+"%");
                }
                else 
                {p3[10]=new Paragraph("IGST @");
                }   
                p3[12] = new Paragraph("Terms And Condition");
                p3[13]=new Paragraph("Grand Total");
                if(InvoiceItemsFrame.gTotal.getText()!=null)
               p3[14] = new Paragraph("Rs "+InvoiceItemsFrame.gTotal.getText());
               if(InvoiceItemsFrame.igstValue.getText()!=null)
                p3[11] = new Paragraph("Rs "+InvoiceItemsFrame.igstValue.getText());
               else
                   p3[11] = new Paragraph("Rs 0");
                if(InvoiceItemsFrame.cgstValue.getText()!=null)
                 p3[8] = new Paragraph("Rs "+InvoiceItemsFrame.cgstValue.getText());
                else 
                    p3[8]=new Paragraph("Rs 0");
                 if(InvoiceItemsFrame.sgstValue.getText()!=null)
                  p3[5] = new Paragraph("Rs "+InvoiceItemsFrame.sgstValue.getText());
                 else 
                   p3[5]=new Paragraph("Rs 0");
                 if(InvoiceItemsFrame.taxValue.getText()!=null)
                   p3[2] = new Paragraph("Rs "+InvoiceItemsFrame.taxValue.getText());
                   p3[i].setFontSize(9);
               
                    if(i%3==0){
            
                  
                    
               //    p3[i].setFontSize(7); 
                    cell3[i]= new Cell(1,7).add(p3[i]);
                    
                    }
                    else if(i%3==1){
                    cell3[i]=new Cell(1,2).add(p3[i]);
                    }
                    else{
                    cell3[i]=new Cell(1,3).add(p3[i]);
                    
                    }
                     if(i>=3 && i<12 && i!=6)
                     { cell3[i].setBorderTop(null);
                     }
                    
                    cell3[i].setPaddings(2, 2, 2, 2);
                    cell3[i].setBorderBottom(null);
                    table.addCell(cell3[i]);
                }
       //  System.out.println("last loop printing");
                for(int i=0; i<27; i++)
                { p4[i]=new Paragraph("");
                  p4[i].setFontSize(9);
                 if(i%3==1){
                   if(InvoiceItemsFrame.jTextField1.getText()!=null){     
                   p4[1]=new Paragraph(InvoiceItemsFrame.jTextField1.getText());
               //    p4[0]=new Paragraph("1");
                   
                   }
                  
                   if(InvoiceItemsFrame.jTextField2.getText()!=null)
                   {
                   p4[4]=new Paragraph(InvoiceItemsFrame.jTextField2.getText());
                  // p4[3]=new Paragraph("2");
                   }
           
                   if(InvoiceItemsFrame.jTextField3.getText()!=null)
                   {
                   p4[7]=new Paragraph(InvoiceItemsFrame.jTextField3.getText());
                 //  p4[6]=new Paragraph("3");
                   
                   }

                   if(InvoiceItemsFrame.jTextField4.getText()!=null)
                   {
                   p4[10]=new Paragraph(InvoiceItemsFrame.jTextField4.getText());
                //   p4[9]=new Paragraph("4");
                   
                   }
               
                   if(InvoiceItemsFrame.jTextField5.getText()!=null)
                   {
                   p4[13]=new Paragraph(InvoiceItemsFrame.jTextField5.getText());
                //   p4[12]=new Paragraph("5");
                   
                   }
                  
                   if(InvoiceItemsFrame.jTextField6.getText()!=null)
                   {
                   p4[16]=new Paragraph(InvoiceItemsFrame.jTextField6.getText());
                  // p4[15]=new Paragraph("6");
                   
                   }
                  
                   if(InvoiceItemsFrame.jTextField7.getText()!=null)
                   {
                   p4[19]=new Paragraph(InvoiceItemsFrame.jTextField7.getText());
                  // p4[18]=new Paragraph("7");
                       System.out.println( "value"+InvoiceItemsFrame.jTextField7.getText());
                   }
            
                   if(InvoiceItemsFrame.jTextField8.getText()!=null)
                   {
                   p4[22]=new Paragraph(InvoiceItemsFrame.jTextField8.getText());
                 //  p4[21]=new Paragraph("8");
                   
                   }
                
                    
                   p4[i].setFontSize(9); 
                  
                    
                    cell4[i]=new Cell(1,6).add(p4[i]);
                    }
                 else if(i%3==2){
                      if(i==5)
                      { 
                        p4[5]=new Paragraph("For "+sd.name.get(InvoiceItemsFrame.indSeller));
                        p4[5].setTextAlignment(TextAlignment.CENTER);
                      }
                      else if(i==14){
                        p4[14] = new Paragraph("Authorised Signatory");
                        p4[14].setTextAlignment(TextAlignment.CENTER);
                      
                      }
                        p4[i].setFontSize(9);
                        cell4[i] = new Cell(1,5).add(p4[i]);
                    }
                 else if(i%3==0){
                 if(InvoiceItemsFrame.jTextField1.getText().length()>5){     
                   //p4[1]=new Paragraph(TaxInvoice.jTextField1.getText());
                   p4[0]=new Paragraph("1");
                   
                   }
                  else
            p4[0]=new Paragraph("");
                   
                   if(InvoiceItemsFrame.jTextField2.getText().length()>5)
                   {
                   //p4[4]=new Paragraph(TaxInvoice.jTextField2.getText());
                   p4[3]=new Paragraph("2");
                     }
                   else
            p4[3]=new Paragraph("");
                   
                   if(InvoiceItemsFrame.jTextField3.getText().length()>5)
                   {
                  // p4[7]=new Paragraph(TaxInvoice.jTextField3.getText());
                   p4[6]=new Paragraph("3");
                   
                   }
                   else
            p4[6]=new Paragraph("");
                   
                   if(InvoiceItemsFrame.jTextField4.getText().length()>5)
                   {
                  // p4[10]=new Paragraph(TaxInvoice.jTextField4.getText());
                   p4[9]=new Paragraph("4");
                   
                   }
               else
            p4[9]=new Paragraph("");
                   
                   if(InvoiceItemsFrame.jTextField5.getText().length()>5)
                   {
                   //p4[13]=new Paragraph(TaxInvoice.jTextField5.getText());
                   p4[12]=new Paragraph("5");
                   
                   }
                 else
            p4[12]=new Paragraph("");
                    
                   if(InvoiceItemsFrame.jTextField6.getText().length()>5)
                   {
                  // p4[16]=new Paragraph(TaxInvoice.jTextField6.getText());
                   p4[15]=new Paragraph("6");
                   
                   }
                  else
            p4[15]=new Paragraph("");
                   
                   if(InvoiceItemsFrame.jTextField7.getText().length()>5)
                   {
                   //p4[19]=new Paragraph(TaxInvoice.jTextField7.getText());
                   p4[18]=new Paragraph("7");
                   
                   }
                   else
            p4[18]=new Paragraph("");
                   
                   if(InvoiceItemsFrame.jTextField8.getText().length()>5)
                   {
                  // p4[22]=new Paragraph(TaxInvoice.jTextField8.getText());
                   p4[21]=new Paragraph("8");
                   
                   }
                   else 
                   p4[21]=new Paragraph("");
                       
                p4[i].setFontSize(7);
                     cell4[i]=new Cell(1,1).add(p4[i]);
                 cell4[i].setWidthPercent(4);
                    
                 }
                  
                 if(i>2) 
                 {cell4[i].setBorderTop(null);
                 }   
                    
                     
                     if(i<24){
                    cell4[i].setBorderBottom(null);
                     }
                     cell4[i].setPaddings(2, 2, 2, 2);
                     table.addCell(cell4[i]);
                }  
                
                    if(!Invoice.quotation){
                      String invinc = InvoiceItemsFrame.textFieldInvoiceIncVal.getText();
       if(invinc==null)
           invinc="";
             File f32 = new File(f2,INVOICE+invinc+"duplicate for transporter.pdf");
      File f33 = new File(f2,INVOICE+invinc+"office copy.pdf");
     
                     PdfDocument pdfDoc2 = new PdfDocument(new PdfWriter(new FileOutputStream(f32)));
         PdfDocument pdfDoc3 = new PdfDocument(new PdfWriter(new FileOutputStream(f33)));
      
     
        Document doc2 = new Document(pdfDoc2,new PageSize(595, 842));
        Document doc3 = new Document(pdfDoc3,new PageSize(595, 842));
       
         doc2.setMargins(20, 20, 20, 20);
         doc3.setMargins(20, 20, 20, 20);
         Paragraph heading2,heading3;
          heading2 = new Paragraph("TAX INVOICE                                      (duplicate for transporter)");
                heading3 = new Paragraph("TAX INVOICE                                                         (office copy)");
                
                heading.setTextAlignment(TextAlignment.RIGHT);
	        heading2.setTextAlignment(TextAlignment.RIGHT);
	        heading3.setTextAlignment(TextAlignment.RIGHT);
	        
                    doc2.add(heading2);
                    doc2.add(table);
                    doc3.add(heading3);
                    doc3.add(table);
                    doc2.close();
                    doc3.close();
                    }
                    
                    doc.add(heading);
                    doc.add(table);
                    
                    doc.close();
     
    ErrorDisplay ed = new ErrorDisplay(InvoiceItemsFrame.iif, true);
    ed.jLabel1.setText(FILENAME+" pdf generated successfully");
    ed.setVisible(true);
        }
     catch (FileNotFoundException e){
     ErrorDisplay ed = new ErrorDisplay(InvoiceItemsFrame.iif, true);
  ed.jLabel1.setText("FILE OPEN CANNOT REWRITE error in printing data");
    ed.setVisible(true);
   
     }          
     catch (IndexOutOfBoundsException e){
     ErrorDisplay ed = new ErrorDisplay(InvoiceItemsFrame.iif, true);
  ed.jLabel1.setText("INDEX OUT OF BOUNDS error in printing data");
  e.printStackTrace();
    ed.setVisible(true);
   
     }
     
     catch(Exception e){
    ErrorDisplay ed = new ErrorDisplay(InvoiceItemsFrame.iif, true);
  ed.jLabel1.setText("error in printing data");
    ed.setVisible(true);
   
     }
     
     
 }



}
