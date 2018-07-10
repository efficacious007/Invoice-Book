
package invoice;

import java.util.ArrayList;


/**
 *
 * @author DOSAJH
 */
public class InWords {
    
// Scanner inp = new Scanner(System.in);
  //  float val = inp.nextFloat();
    
    ArrayList<String> word = new ArrayList<>();
 void getValue(Double val){
String intval = new String();    
    intval=""+val;
    int index= intval.indexOf(".");
    int val2,val3=0;
    if(index>=0)
    {  val2 =Integer.parseInt(intval.substring(0, index));
       val3 = Integer.parseInt(intval.substring(index+1,intval.length()));
       if( val3==1 || val3==2 || val3==3 || val3==4 || val3==5 ||  val3==6 || val3==7 || val3==8 || val3==9)
       val3 = val3*10;
    }
    else{
     val2=Integer.parseInt(intval);
    }
//System.out.println(val2);
//System.out.println(val3);
boolean flag=true;  
if(val2!=0){
      inWord(val2,flag);
 }
  if(val3>0){
     
     inWord(val3, false);
  }  
    }    
    
    
    
    
 void inWord(int val,boolean flag){
    if(flag)
        word.add("Rupees");
     if(!flag){
    word.add("And Paise");
    }
    int x=1;
    int q=10000000,y;
    int z;
    while(q!=0){
    x=val/q;
    z= 100000;
    y=1000000;
    if(x>0)
    {
      
    z=x%10;
    y=x/10;
    }
    
    
   if(y==1 && z==0){
       word.add("Ten"); 
      // System.err.print("ten");
    }
    else if(y==1 && z==1){
        word.add("Eleven");
    //    System.err.println("eleven");
    }
    else if(y==1 && z==2){
         word.add("Twelve");
        //System.err.println("twelve");
    }
    else if(y==1 && z==3){
         word.add("Thirteen");
        //System.err.println("thirteen");
    }
    else if(y==1 && z==4){
         word.add("Fourteen");
        //System.err.println("fourteen");
    }
    else if(y==1 && z==5){
         word.add("Fifteen");
        //System.err.println("fifteen");
    }
    else if(y==1 && z==6){
         word.add("Sixteen");
       // System.err.println("sixteen");
    }
    else if(y==1 && z==7){
         word.add("Seventeen");
        //System.err.println("seventeen");
    }
    else if(y==1 && z==8){
         word.add("Eighteen");
        //System.err.println("eighteen");
    }
    else if(y==1 && z==9){
         word.add("Nineteen");
        //System.err.println("nineteen");
    }
    else if(y==2){
         word.add("Twenty");
        //System.err.println("twenty");
    }
    else if(y==3){
         word.add("Thirty");
        //System.err.println("thirty");
    }
    else if(y==4){
         word.add("Fourty");
        //System.err.println("fourty");
    }
    else if(y==5){
         word.add("Fifty");
        //System.err.println("fifty");
    }
    else if(y==6){
         word.add("Sixty");
        //System.err.println("sixty");
    }
    else if(y==7){
         word.add("Seventy");
        //System.er.println("seventy");
    }
    else if(y==8){
         word.add("Eighty");
        //System.err.println("eighty");
    }
    else if(y==9){
         word.add("Ninety");
        //System.err.println("ninety");
    }
    if(z==1 && y!=1){
         word.add("One");
        //System.out.println("one");
    }
    else if(z==2 && y!=1){
         word.add("Two");
        //System.err.println("two");
    }
    else if(z==3 && y!=1){
        word.add("Three");
        //System.err.println("three");
    }
    else if(z==4 && y!=1){
        word.add("Four");
        //System.err.println("four");
    }
    else if(z==5 && y!=1){
        word.add("Five");
        //System.err.println("five");
    }
    else if(z==6&& y!=1){
        word.add("Six");
        //System.err.println("six");
    }
    else if(z==7 && y!=1){
        word.add("Seven");
        //System.err.println("seven");
    }
    else if(z==8 && y!=1){
        word.add("Eight");
        //System.err.println("eight");
    }
    else if(z==9 && y!=1){
        word.add("Nine");
        //System.err.println("nine");
    }
    
   if(q==100 && x>0){
       word.add("Hundred");
        //System.err.println("hundred");
    }
    else if(q==1000 && x>0){
        word.add("Thousand");
        //System.err.println("thousand");
    }
    else if(q==100000 && x>0){
        word.add("Lac");
        //System.err.println("lakh");
    }
    else if(q==10000000 && x>0){
        word.add("Crore");
      //  System.err.println("crore");
    }
     val = val%q;   
     if(q==1000) 
     q=q/10;  
     else
         q=q/100;
   
    }
    if(flag)
    {

        word.add("Only");
         // for(int i=0; i<word.size();i++)
         //   System.out.print(word.get(i)+" ");
    
    }
    else 
    {   // word.add("Only");
    }

}


}