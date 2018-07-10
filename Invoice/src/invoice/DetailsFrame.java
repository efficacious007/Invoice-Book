/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author DOSAJH
 */
public class DetailsFrame extends javax.swing.JFrame {

    String scname,sgst,saddress,sstate,scountry,sprefix; //seller
    String spincode,sphno; //seller
    int sincV;
    String tname,tgr,tgst;
    String bcname,bgst,badd,badd2;
    String sell[],buy[],transporter[],bank[];
    String bankname,bankifsc,bankaccno,banktype;
    static DetailsFrame df;
    int INDEXOPT[];
    public DetailsFrame() {
        initComponents();
    }
    
    public DetailsFrame(String[] option,int [] indoption){
     INDEXOPT = new int [4];
     for(int i=0; i<4; i++)
        INDEXOPT[i] = indoption[i];
    initComponents();
    setVisible(true);
     if(Invoice.quotation)
    { incValue.setVisible(false);
    }
   if(!option[0].equals("Add New") && indoption[0]!=0)
  {
   
     sellerData sdata = new sellerData();
     try{
     sdata = sdata.readData();
     
     }
     catch(Exception e){
     
     }
     String scname,sstate;
      // int ind;
     //ind = option[0].indexOf("state");
    scname = option[0];
 
    if(Invoice.quotation)
    { incValue.setVisible(false);
    }
       sell = sdata.sendData(indoption[0]);
        if(sell[0]!=null) 
       cName.setText(sell[0]);
        if(sell[1]!=null) 
        gstin.setText(sell[1]);
        if(sell[2]!=null) 
        address.setText(sell[2]);
        if(sell[3]!=null) 
        stateTextField.setText(sell[3]);
        if(sell[4]!=null) 
        pinCode.setText(sell[4]);
        if(sell[5]!=null) 
        country.setText(sell[5]);
        if(sell[6]!=null) 
        phNo.setText(sell[6]);
        if(sell[7]!=null && !Invoice.quotation) 
        prefix.setText(sell[7]);
        if(sell[7]!=null && Invoice.quotation)
        prefix.setText("Quotation");    
        if(sell[8]!=null && !Invoice.quotation) 
        incValue.setText(sell[8]);
  }
    if(!option[1].equals("Add New") && indoption[1]!=0){
buyerData bdata = new buyerData();

try{bdata=bdata.readData();
}catch(Exception e){
 //   System.err.println("err"+e);
}

//int ind;
//   ind = option[1].indexOf("state");
 // bcname = option[1].substring(0, ind);
  //badd = option[1].substring(ind+6);
   //   System.out.println(badd);
    //  System.out.println(bcname);
      buy=bdata.sendData(indoption[1]);
      if(buy[0]!=null) 
      jTextField1.setText(buy[0]);
      if(buy[1]!=null) 
      jTextField2.setText(buy[1]);
      if(buy[2]!=null) 
      jTextField3.setText(buy[2]);
      if(buy[3]!=null) 
      jTextField4.setText(buy[3]);
      }
    
    if(!option[2].equals("Add New") && indoption[2]!=0){
transporterData tdata = new transporterData();
try{
tdata=tdata.readData();
}
catch(Exception e){
    System.err.println("err"+e);
}
tname = option[2];

transporter=tdata.sendData(indoption[2]);
if(transporter[0]!=null)
transporterName.setText(transporter[0]);
if(transporter[1]!=null)
grNo.setText(transporter[1]);
if(transporter[2]!=null)
gstin1.setText(transporter[2]);
}
    
    if(!option[3].equals("Add New") && indoption[3]!=0){
BankData bankdata = new BankData();
try{
bankdata=bankdata.readData();
}
catch(Exception e){
    System.err.println("err"+e);
}
bankaccno = option[3];

bank=bankdata.sendData(indoption[3]);
if(bank[0]!=null)
bdname.setText(bank[0]);
if(bank[1]!=null)
bdaccno.setText(bank[1]);
if(bank[2]!=null)
bdifsc.setText(bank[2]);
if(bank[3]!=null)
bdtype.setText(bank[3]);
}
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        saveAndContinue = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        prefix = new javax.swing.JTextField();
        incValue = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        pinCode = new javax.swing.JTextField();
        gstin = new javax.swing.JTextField();
        cName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phNo = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        transporterName = new javax.swing.JTextField();
        grNo = new javax.swing.JTextField();
        gstin1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        bdname = new javax.swing.JTextField();
        bdaccno = new javax.swing.JTextField();
        bdifsc = new javax.swing.JTextField();
        bdtype = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Company Name");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("GSTIN");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Address line 1");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Address Line 2");

        jTextField1.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Seller's Detail");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Transporter Details");

        saveAndContinue.setText("Save And Continue");
        saveAndContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAndContinueActionPerformed(evt);
            }
        });

        jLabel19.setText("            _");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Company Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("GSTIN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Pin Code");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Set Invoice ");

        prefix.setText("Set Prefix");
        prefix.setPreferredSize(new java.awt.Dimension(53, 30));
        prefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefixActionPerformed(evt);
            }
        });

        incValue.setText("INC VAL");
        incValue.setPreferredSize(new java.awt.Dimension(45, 30));
        incValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incValueActionPerformed(evt);
            }
        });

        address.setPreferredSize(new java.awt.Dimension(200, 30));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        pinCode.setPreferredSize(new java.awt.Dimension(6, 30));
        pinCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinCodeActionPerformed(evt);
            }
        });

        gstin.setPreferredSize(new java.awt.Dimension(6, 30));
        gstin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gstinActionPerformed(evt);
            }
        });

        cName.setPreferredSize(new java.awt.Dimension(200, 30));
        cName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("State");
        jLabel7.setPreferredSize(new java.awt.Dimension(6, 14));

        stateTextField.setPreferredSize(new java.awt.Dimension(90, 30));
        stateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Country");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Ph No");

        phNo.setPreferredSize(new java.awt.Dimension(6, 30));
        phNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phNoActionPerformed(evt);
            }
        });

        country.setPreferredSize(new java.awt.Dimension(6, 30));
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(108, 108, 108))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prefix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phNo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(incValue, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(pinCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(gstin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gstin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(phNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(prefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Transporter Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("G/R No");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("GSTIN");

        transporterName.setPreferredSize(new java.awt.Dimension(144, 30));
        transporterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transporterNameActionPerformed(evt);
            }
        });

        grNo.setPreferredSize(new java.awt.Dimension(144, 30));
        grNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grNoActionPerformed(evt);
            }
        });

        gstin1.setPreferredSize(new java.awt.Dimension(6, 30));
        gstin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gstin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transporterName, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(grNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gstin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(transporterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(grNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(gstin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Bank Details");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Bank Name");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Account Number");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("IFSC CODE");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Acc Type");

        bdname.setPreferredSize(new java.awt.Dimension(200, 30));

        bdaccno.setPreferredSize(new java.awt.Dimension(200, 30));
        bdaccno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdaccnoActionPerformed(evt);
            }
        });

        bdifsc.setPreferredSize(new java.awt.Dimension(200, 30));
        bdifsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdifscActionPerformed(evt);
            }
        });

        bdtype.setPreferredSize(new java.awt.Dimension(200, 30));
        bdtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdtypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bdname, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(bdaccno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bdifsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bdtype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(bdname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(bdaccno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(bdifsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(bdtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Buyer's Detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(saveAndContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveAndContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdaccnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdaccnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdaccnoActionPerformed

    private void bdifscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdifscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdifscActionPerformed

    private void bdtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdtypeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        bcname = jTextField1.getText();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        bgst = jTextField2.getText();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        badd = jTextField3.getText();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        badd2 = jTextField4.getText();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void saveAndContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAndContinueActionPerformed
        // TODO add your handling code here:

        try{
            bankaccno= bdaccno.getText();
            bankifsc= bdifsc.getText();
            bankname= bdname.getText();
            banktype= bdtype.getText();
           }
        catch(Exception e){
            System.out.println(e);
           }
        scname=cName.getText();
        try{
            sincV = Integer.parseInt(incValue.getText());
        }
        catch(Exception e){
            System.out.println("ERROR");
        }

        if(bankaccno==null)
        bankaccno="";
        if(bankifsc==null)
        bankifsc="";
        if(banktype==null)
        banktype="";
        if(bankname==null)
        bankname="";

        if(scname==null)
        scname="";
        saddress = address.getText();
        if(saddress==null)
        saddress="";
        sstate=stateTextField.getText();
        sgst=gstin.getText();
        scountry=country.getText();
        if(!Invoice.quotation)
        sprefix=prefix.getText();
        sphno = phNo.getText();
        spincode = pinCode.getText();
        if(spincode==null)
        spincode="";
        if(sphno==null)
        sphno="";
        bcname = jTextField1.getText();
        if(bcname==null)
        bcname="";
        badd = jTextField3.getText();
        if(badd==null)
        badd="";
        bgst=jTextField2.getText();
        badd2=jTextField4.getText();
        tname=transporterName.getText();
        tgst=gstin1.getText();
        tgr = grNo.getText();
        // System.out.println(scname+""+ saddress+"a "+bcname+"t "+badd);

        if(scname.length()<2 || saddress.length()<2 || bcname.length()<2 || badd2.length()<2){
            if(scname==null || scname ==""){
                jLabel19.setText("set Company Name");

            }
            else if(saddress==null || saddress==""){
                jLabel19.setText("set Company Address");
            }

            else if(bcname==null ||  bcname==""){
                jLabel19.setText("fill buyer name");
            }
            else{
                jLabel19.setText("another error");
            }
            //hidden Label

        }
        else{
            //   System.out.print("selller data reading\n");
            sellerData sd = new sellerData();

            if(sgst==null)
            sgst="";
            if(saddress==null)
            saddress="";
            if(sstate==null)
            sstate="";
            if(sphno==null)
            sphno="";
            if(scname==null)
            scname="";
            if(scountry==null)
            scountry="";
            if(sprefix==null)
            sprefix="";
            try{
                sd= sd.readData();
                if(sd==null){
                    sd=new sellerData();
                }
            }
            catch(Exception e){
                System.err.println("sell read");

            }
            //   System.out.println("sstate "+sstate);

            //  System.out.println("saved state will be:"+sstate);
            sd.receiveData(scname, sgst, saddress, sstate, spincode, scountry, sphno, sprefix, sincV,INDEXOPT[0]);
            buyerData bd = new buyerData();
            try{
                //   System.out.print("buyer data reading\n");
                bd= bd.readData();
            }
            catch(Exception e){
                System.err.println("err"+e);
            }
            if(bd==null)
            bd=new buyerData();

            if(bcname==null)
            bcname="";

            if(bgst==null)
            bgst="";
            if(badd==null)
            badd="";
            if(badd2==null)
            badd2="";

            bd.addData(bcname, bgst, badd, badd2,INDEXOPT[1]);

            transporterData td = new transporterData();
            try{
                td= td.readData();
            }
            catch(Exception e){
                System.err.println("err"+e);
            }
            if(td==null)
            td=new transporterData();

            if(tname!=null)
            {
                if(tgr==null)
                tgr="";
                if(tgst==null)
                tgst="";
                td.addData(tname, tgr, tgst,INDEXOPT[2]);}

            BankData bankdata = new BankData();
            try{
                bankdata= bankdata.readData();
            }
            catch(Exception e){
                System.err.println("err"+e);
            }
            if(bankdata==null)
            bankdata = new BankData();
            //  if(bankaccno!=null){
                bankdata.addData(bankaccno,bankname,bankifsc,banktype,INDEXOPT[3]);
                
                int indexSeller = sd.returnSellerIndex(scname);
                int indexBuyer = bd.returnBuyerIndex(bcname,badd2);
                int indexTransporter = td.returnTransporterIndex(tname);
                int indexBank = bankdata.returnBankIndex(bankaccno);
               //JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
               // BILLBOOK.mw.setBounds(0,0,1250,740);
               setVisible(false);
               // pamelInvoiceDetails ti = new pamelInvoiceDetails(prefix.getText()+incValue.getText(),indexSeller,indexBuyer,indexTransporter,indexBank);
                //ti.setBounds(10, 10, 1250, 680);
                //pane.add(ti);
                //setVisible(false);
                //BILLBOOK.mw.remove(this);
                //pane.setBounds(0, 0, 1080,700);
                //BILLBOOK.mw.add(ti);
                 InvoiceItemsFrame.iif = new InvoiceItemsFrame(sprefix,sincV, indexSeller, indexBuyer, indexTransporter, indexBank);
                
            }
    }//GEN-LAST:event_saveAndContinueActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:

        setVisible(false);
       SelectionFrame.sf.setVisible(true);
        // MainWindow.mw.setBounds(150, 150, 470, 320);
    }//GEN-LAST:event_backActionPerformed

    private void prefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefixActionPerformed
        // TODO add your handling code here:
        sprefix = prefix.getText();
    }//GEN-LAST:event_prefixActionPerformed

    private void incValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incValueActionPerformed
        // TODO add your handling code here:
        sincV = Integer.parseInt(incValue.getText());
    }//GEN-LAST:event_incValueActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
        saddress = address.getText();
    }//GEN-LAST:event_addressActionPerformed

    private void pinCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinCodeActionPerformed
        // TODO add your handling code here:
        spincode = pinCode.getText();
    }//GEN-LAST:event_pinCodeActionPerformed

    private void gstinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gstinActionPerformed
        // TODO add your handling code here:
        sgst = gstin.getText();
    }//GEN-LAST:event_gstinActionPerformed

    private void cNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNameActionPerformed
        // TODO add your handling code here:
        scname = cName.getText();
    }//GEN-LAST:event_cNameActionPerformed

    private void stateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTextFieldActionPerformed
        // TODO add your handling code here:
        sstate = stateTextField.getText();
    }//GEN-LAST:event_stateTextFieldActionPerformed

    private void phNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phNoActionPerformed
        // TODO add your handling code here:
        sphno = phNo.getText();
    }//GEN-LAST:event_phNoActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
        scountry = country.getText();
    }//GEN-LAST:event_countryActionPerformed

    private void transporterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transporterNameActionPerformed
        // TODO add your handling code here:
        tname = transporterName.getText();
    }//GEN-LAST:event_transporterNameActionPerformed

    private void grNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grNoActionPerformed
        // TODO add your handling code here:
        tgr = grNo.getText();
    }//GEN-LAST:event_grNoActionPerformed

    private void gstin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gstin1ActionPerformed
        // TODO add your handling code here:
        tgst = gstin1.getText();
    }//GEN-LAST:event_gstin1ActionPerformed

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
            java.util.logging.Logger.getLogger(DetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JTextField bdaccno;
    private javax.swing.JTextField bdifsc;
    private javax.swing.JTextField bdname;
    private javax.swing.JTextField bdtype;
    private javax.swing.JTextField cName;
    private javax.swing.JTextField country;
    private javax.swing.JTextField grNo;
    private javax.swing.JTextField gstin;
    private javax.swing.JTextField gstin1;
    private javax.swing.JTextField incValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField phNo;
    private javax.swing.JTextField pinCode;
    private javax.swing.JTextField prefix;
    private javax.swing.JButton saveAndContinue;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField transporterName;
    // End of variables declaration//GEN-END:variables
}
