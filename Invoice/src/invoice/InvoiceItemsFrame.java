/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DOSAJH
 */
public class InvoiceItemsFrame extends javax.swing.JFrame implements FocusListener,ItemListener {

    /**
     * Creates new form InvoiceItemsFrame
     */
   static InvoiceItemsFrame iif;
          static int SerialNo;
    DynamicFieldAddition dfa[];
    int x1,x2,x3,x4,x5,x6,x7,y;
   int WIDTH=1320,HEIGHT=690;
     JPanel jScrollPane1;
   static int indSeller,indBuyer,indTrans;
   static int indBank;
   static String INVOICENO;
 //  JScrollPane scroll;
    public InvoiceItemsFrame() {
        initComponents();
        setVisible(true);
    }
    
     public InvoiceItemsFrame(String invoice,int INCVAL,int indexSeller,int indexBuyer,int indexTransporter,int indexbank){
         initComponents();
jToggleButton1.addItemListener(this);
       
setVisible(true);
          y=80;                       
          x1=5;
          x2=x1+55; x3=x2+315; x4=x3+55; x5=x4+55; x6=x5+55; x7 =x6+95;
        SerialNo=1;
        String text = ""+SerialNo;
        dfa = new DynamicFieldAddition[141];
        for(int i=1 ; i<141 ; i++)
        {
        dfa[i]=new DynamicFieldAddition();
        }
        dfa[SerialNo].sn.setText(text);
        dfa[SerialNo].sn.setBounds(x1, y+35, 40, 30);
       
        dfa[SerialNo].desc.setBounds(x2, y+35, 300, 30);
        dfa[SerialNo].hsn.setBounds(x3, y+35, 40, 30);
        dfa[SerialNo].qty.setBounds(x4,y+35,40,30);
        dfa[SerialNo].unit.setBounds(x5,y+35,40,30);
        dfa[SerialNo].rate.setBounds(x6,y+35,80,30);
        dfa[SerialNo].value.setBounds(x7,y+35,80,30);
        dfa[SerialNo].qty.setText("");
      
        JLabel jsn = new JLabel("SNo");
        jsn.setBounds(x1, y, 40, 20);
        JLabel jdesc = new JLabel("Description");
        jdesc.setBounds(x2, y, 300, 20);
        JLabel jhsn = new JLabel("HSN");
        jhsn.setBounds(x3, y, 40, 20);
        JLabel jqty = new JLabel("Qty");
        jqty.setBounds(x4, y, 40, 20);
        JLabel junit = new JLabel("Unit");
        junit.setBounds(x5, y, 40, 20);
        JLabel jrate = new JLabel("Rate");
        jrate.setBounds(x6,y,80,20);
        JLabel jvalue = new JLabel("Taxable Value");
        jvalue.setBounds(x7, y, 80, 20);
       add(jsn);
       add(jdesc);
        add(jhsn);
        add(jqty);
       add(junit);
        add(jrate);
        add(jvalue);
        add(dfa[SerialNo].sn);
        add(dfa[SerialNo].desc);
       add(dfa[SerialNo].hsn);
        add(dfa[SerialNo].qty);
        add(dfa[SerialNo].unit);
        add(dfa[SerialNo].rate);
      add(dfa[SerialNo].value);
      jsn.setVisible(true);
        jdesc.setVisible(true);
          jhsn.setVisible(true);
        dfa[SerialNo].value.addFocusListener(this);
        taxValue.addFocusListener(this);
        sgstValue.addFocusListener(this);
         cgstValue.addFocusListener(this);
          igstValue.addFocusListener(this);
          gTotal.addFocusListener(this);
          if(!Invoice.quotation)
          {   InvoicePrefix.setText(invoice);
              textFieldInvoiceIncVal.setText(""+INCVAL);
          }
          else
          InvoicePrefix.setText("Quotation");
              
          indSeller = indexSeller;
          indBuyer = indexBuyer;
          indTrans = indexTransporter;
          indBank = indexbank;
          if(!Invoice.quotation)
          INVOICENO = invoice;
          else
           INVOICENO  ="Quotation";   
          moneyInWords2.addFocusListener(this);
          y=120;        
         InvoiceFileCreator ifc = new InvoiceFileCreator();
         
         textFieldInvoiceIncVal.addFocusListener(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sgstValue = new javax.swing.JTextField();
        igst = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        cgstpercent = new javax.swing.JTextField();
        gTotal = new javax.swing.JTextField();
        sgstpercent = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        generatePdf = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        InvoicePrefix = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DeliveryADD = new javax.swing.JTextField();
        DeliveryADD2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        cgstValue = new javax.swing.JTextField();
        sgst = new javax.swing.JLabel();
        DATE = new javax.swing.JTextField();
        cgst = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        additem = new javax.swing.JButton();
        taxValue = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        igstpercent = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        igstValue = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        moneyInWords2 = new javax.swing.JTextArea();
        textFieldInvoiceIncVal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sgstValue.setPreferredSize(new java.awt.Dimension(6, 30));
        sgstValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgstValueActionPerformed(evt);
            }
        });

        igst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        igst.setText("IGST");

        jTextField7.setPreferredSize(new java.awt.Dimension(6, 25));

        jTextField5.setPreferredSize(new java.awt.Dimension(6, 25));

        cgstpercent.setPreferredSize(new java.awt.Dimension(6, 30));

        gTotal.setPreferredSize(new java.awt.Dimension(6, 30));

        sgstpercent.setPreferredSize(new java.awt.Dimension(6, 30));
        sgstpercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgstpercentActionPerformed(evt);
            }
        });

        jLabel15.setText("%");

        jTextField6.setPreferredSize(new java.awt.Dimension(6, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("G.Total");

        generatePdf.setText("Generate PDF");
        generatePdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePdfActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Invoice No");

        InvoicePrefix.setText("jTextField13");
        InvoicePrefix.setPreferredSize(new java.awt.Dimension(65, 25));
        InvoicePrefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoicePrefixActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("DELIVERY AT");

        DeliveryADD.setPreferredSize(new java.awt.Dimension(6, 30));

        DeliveryADD2.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("TERMS AND CONDITION");

        jTextField1.setPreferredSize(new java.awt.Dimension(6, 25));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField8.setPreferredSize(new java.awt.Dimension(6, 25));

        jTextField2.setPreferredSize(new java.awt.Dimension(6, 25));

        cgstValue.setPreferredSize(new java.awt.Dimension(6, 30));

        sgst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sgst.setText("SGST");

        DATE.setPreferredSize(new java.awt.Dimension(6, 30));
        DATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATEActionPerformed(evt);
            }
        });

        cgst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cgst.setText("CGST");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Total Taxable Value");

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Date");

        additem.setText("Add Item");
        additem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemActionPerformed(evt);
            }
        });

        taxValue.setPreferredSize(new java.awt.Dimension(6, 30));
        taxValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxValueActionPerformed(evt);
            }
        });

        jButton3.setText("Remove Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("%");

        jTextField3.setPreferredSize(new java.awt.Dimension(6, 25));

        igstpercent.setPreferredSize(new java.awt.Dimension(6, 25));

        jTextField4.setPreferredSize(new java.awt.Dimension(6, 25));

        jLabel14.setText("%");

        igstValue.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Rupees in words");

        jToggleButton1.setText("T&C");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        moneyInWords2.setColumns(20);
        moneyInWords2.setRows(5);
        moneyInWords2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(moneyInWords2);

        textFieldInvoiceIncVal.setText("jTextField9");

        jLabel4.setText("PO NO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(additem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generatePdf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InvoicePrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldInvoiceIncVal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(cgst)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addGap(25, 25, 25)
                                        .addComponent(cgstpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(7, 7, 7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(igst)
                                                .addGap(18, 18, 18)))
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(igstpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(igstValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(cgstValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sgst)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(sgstpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(taxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sgstValue, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(DeliveryADD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(DeliveryADD2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taxValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(back)
                                .addComponent(jButton3)
                                .addComponent(additem)
                                .addComponent(generatePdf)
                                .addComponent(jLabel7)
                                .addComponent(InvoicePrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textFieldInvoiceIncVal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sgst)
                            .addComponent(jLabel11)
                            .addComponent(sgstpercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sgstValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cgstValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cgstpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cgst)
                                .addComponent(jLabel14)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(igstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(igstpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(igst)
                                .addComponent(jLabel15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeliveryADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeliveryADD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jToggleButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sgstValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgstValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sgstValueActionPerformed

    private void sgstpercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgstpercentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sgstpercentActionPerformed

    private void generatePdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePdfActionPerformed
        // TODO add your handling code here:
        PdfGenerator pd = new PdfGenerator(dfa);
    }//GEN-LAST:event_generatePdfActionPerformed

    private void DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DATEActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        SelectionFrame.sf = new SelectionFrame();
           
    }//GEN-LAST:event_backActionPerformed

    private void additemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemActionPerformed
        // TODO add your handling code here:
        if(SerialNo<=18){
            SerialNo++;
            String text = ""+SerialNo;
            dfa[SerialNo].sn.setText(text);
            y=y+30;
            dfa[SerialNo].sn.setBounds(x1, y, 40, 30);

            dfa[SerialNo].desc.setBounds(x2, y, 300, 30);
            dfa[SerialNo].hsn.setBounds(x3, y, 40, 30);
            dfa[SerialNo].qty.setBounds(x4,y,40,30);
            dfa[SerialNo].unit.setBounds(x5,y,40,30);
            dfa[SerialNo].rate.setBounds(x6,y,80,30);
            dfa[SerialNo].value.setBounds(x7,y,80,30);
            dfa[SerialNo].qty.setText("0");
            add(dfa[SerialNo].sn);
            add(dfa[SerialNo].desc);
            add(dfa[SerialNo].hsn);

            add(dfa[SerialNo].qty);
            add(dfa[SerialNo].unit);
            add(dfa[SerialNo].rate);
            add(dfa[SerialNo].value);
            HEIGHT=HEIGHT+3;
            setSize(WIDTH,HEIGHT);

            dfa[SerialNo].value.addFocusListener(this);


        }
    }//GEN-LAST:event_additemActionPerformed

   @Override
      public void itemStateChanged(ItemEvent eve) {  
   //    System.out.println("IM HERE");
          if (jToggleButton1.isSelected() && Invoice.quotation)  
        {  jToggleButton1.setText("Spare Parts");
jTextField1.setText("Prices are ex-works Delhi");
jTextField2.setText("PAYMENTS :- 100% Advance with PO");
jTextField3.setText("Rs 4000.00 plus Boarding/Lodging/To and Fro fare will be charged extra for installation if required and any tools/spares/labour etc required at site will be provided by you free of charge");
jTextField4.setText("Buyer undertake to submit prescribed ST declaration to seller on demand");
jTextField5.setText("Goods once sold will not be taken back or exchanged");
jTextField6.setText("Interest @18% p.a will be charged for the payment not sent within 7 days of Invoice");
jTextField7.setText("Seller is not responsible for loss or damage of goods in transit");
jTextField8.setText("Disputes if any will be subject to Delhi court jurisdiction");
        
        }
          
          else if (jToggleButton1.isSelected() && !Invoice.quotation)  
        {  jToggleButton1.setText("Spare Parts");
jTextField1.setText("Prices are ex-works Delhi");
jTextField2.setText("PAYMENTS :- 100% Advance with PO");
jTextField3.setText("Rs 4000.00 plus Boarding/Lodging/To and Fro fare will be charged extra for installation if required and any tools/spares/labour etc required at site will be provided by you free of charge");
jTextField4.setText("Buyer undertake to submit prescribed ST declaration to seller on demand");
jTextField5.setText("Goods once sold will not be taken back or exchanged");
jTextField6.setText("Interest @18% p.a will be charged for the payment not sent within 7 days of Invoice");
jTextField7.setText("Seller is not responsible for loss or damage of goods in transit");
jTextField8.setText("Disputes if any will be subject to Delhi court jurisdiction");
        
        }   
        else
        {jToggleButton1.setText("Service Charges"); 
        jTextField1.setText("Prices are ex-works Delhi");
jTextField2.setText("PAYMENTS :- 100% Advance with PO");
jTextField3.setText("Rs 4000.00 plus Boarding/Lodging/To and Fro fare will be charged extra for installation if required and any tools/spares/labour etc required at site will be provided by you free of charge");
jTextField4.setText("Buyer undertake to submit prescribed ST declaration to seller on demand");
jTextField5.setText("Goods once sold will not be taken back or exchanged");
jTextField6.setText("Interest @18% p.a will be charged for the payment not sent within 7 days of Invoice");
jTextField7.setText("Seller is not responsible for loss or damage of goods in transit");
jTextField8.setText("Disputes if any will be subject to Delhi court jurisdiction");
        
        }
        
    }  
    
    @Override
    public void focusGained(FocusEvent e) {
        Double tv = new Double(0);
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
        //decimalFormat.setGroupingUsed(true);
        //decimalFormat.setGroupingSize(3);
          
       if(e.getSource()==taxValue){
           
    for(int i=1;i<=SerialNo;i++)
    {
    tv = Double.parseDouble(dfa[i].value.getText())+tv;
    }
    
    taxValue.setText(""+decimalFormat.format(tv));
    
    }
       else if(e.getSource()==sgstValue){
           Double val =(Double.parseDouble(sgstpercent.getText())/100)*(Double.parseDouble(taxValue.getText()));
           sgstValue.setText(""+decimalFormat.format(val));
       } 
       else if(e.getSource()==cgstValue){
           Double val =((Double.parseDouble(cgstpercent.getText()))/100)*(Double.parseDouble(taxValue.getText()));
           cgstValue.setText(decimalFormat.format(val));
       } 
      else if(e.getSource()==igstValue){
           Double val =((Double.parseDouble(igstpercent.getText()))/100)*(Double.parseDouble(taxValue.getText()));
          
          igstValue.setText(decimalFormat.format(val));
       } 
       else if(e.getSource()==gTotal){
           Double val = Double.parseDouble(taxValue.getText())+Double.parseDouble(sgstValue.getText())+Double.parseDouble(cgstValue.getText())+Double.parseDouble(igstValue.getText());
  
           gTotal.setText(decimalFormat.format(val));
       }
       for(int i=1; i<=19;i++)
        if(e.getSource()==dfa[i].value){
      Double val;
      val = Double.parseDouble(dfa[SerialNo].qty.getText())*Double.parseDouble(dfa[SerialNo].rate.getText());
         dfa[SerialNo].value.setText(decimalFormat.format(val));
      }
       
        
        if(e.getSource()==moneyInWords2){
               InWords iword = new InWords();
        try{
        iword.getValue(Double.parseDouble(gTotal.getText()));
        String str="";
        for(int i=0; i<iword.word.size();i++)
        str=str+" "+iword.word.get(i);
        moneyInWords2.setText(str);
        }
        catch(Exception e2){
        System.out.println("TAX INVOICE INWORDS FOCUS GAINED ERROR");
        }

       } 
    }

    @Override
    public void focusLost(FocusEvent e) {
   
        if(e.getSource()==textFieldInvoiceIncVal && !Invoice.quotation){
        sellerData sd = new sellerData();
        sd = sd.readData();
        String str = textFieldInvoiceIncVal.getText();
        if(str!=null)
        sd.updateIncVal(indSeller, Integer.parseInt(str));
        String pref = InvoicePrefix.getText();
        if(pref==null)
            pref="";
        String iv = textFieldInvoiceIncVal.getText();
        if(iv==null)
            iv="";
        INVOICENO = pref+iv;
        }
        
    }
    
    
    private void taxValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxValueActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(SerialNo>1)
        {
            remove(dfa[SerialNo].sn);
            remove(dfa[SerialNo].desc);
            remove(dfa[SerialNo].hsn);
            remove(dfa[SerialNo].qty);
            remove(dfa[SerialNo].unit);
            remove(dfa[SerialNo].rate);
            remove(dfa[SerialNo].value);
            y=y-30;
            SerialNo--;
            HEIGHT=HEIGHT-3;
            setSize(WIDTH, HEIGHT);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void InvoicePrefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoicePrefixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoicePrefixActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceItemsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceItemsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceItemsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceItemsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceItemsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField DATE;
    public static javax.swing.JTextField DeliveryADD;
    public static javax.swing.JTextField DeliveryADD2;
    public static javax.swing.JTextField InvoicePrefix;
    private javax.swing.JButton additem;
    private javax.swing.JButton back;
    private javax.swing.JLabel cgst;
    public static javax.swing.JTextField cgstValue;
    public static javax.swing.JTextField cgstpercent;
    public static javax.swing.JTextField gTotal;
    private javax.swing.JButton generatePdf;
    private javax.swing.JLabel igst;
    public static javax.swing.JTextField igstValue;
    public static javax.swing.JTextField igstpercent;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JTextArea moneyInWords2;
    private javax.swing.JLabel sgst;
    public static javax.swing.JTextField sgstValue;
    public static javax.swing.JTextField sgstpercent;
    public static javax.swing.JTextField taxValue;
    public static javax.swing.JTextField textFieldInvoiceIncVal;
    // End of variables declaration//GEN-END:variables
}
