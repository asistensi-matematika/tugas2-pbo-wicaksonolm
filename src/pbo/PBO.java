
package pbo;

import java.util.Date;
import java.util.Scanner;


public class PBO {


    public static void main(String[] args) {
        Date MyObj=new Date();
        Scanner input=new Scanner(System.in);
        DiscountRate diskon=new DiscountRate();
        double harga=982758;
        String a1,a2,a3,a4;
        String M1,M2,M3,M4;
        double total1,total2,total3,total4;
        
      
        
        
        
        System.out.println("masukan nama kostumer1: ");
        a1=input.nextLine();
        System.out.println("masukan member kostumer1: ");
        M1=input.nextLine();
        System.out.println("masukan nama kostumer2: ");
        a2=input.nextLine();
        System.out.println("masukan member kostumer2: ");
        M2=input.nextLine();
        System.out.println("masukan nama kostumer3: ");
        a3=input.nextLine();
        System.out.println("masukan member kostumer3: ");
        M3=input.nextLine();
        System.out.println("masukan nama kostumer4: ");
        a4=input.nextLine();
        System.out.println("masukan member kostumer4: ");
        M4=input.nextLine();
        
        visit kostumer_1=new visit(a1,MyObj);
        kostumer_1.setMember(true);
        kostumer_1.setMemberType(M1);
        kostumer_1.setServiceExpense(harga*diskon.getServiceDiscountRate(kostumer_1.getMember())) ;
        kostumer_1.setProductExpense(harga*diskon.getProductDiscountRate(kostumer_1.getMember()));
        diskon.getServiceDiscountRate(kostumer_1.getMember());
        
        visit kostumer_2=new visit(a2,MyObj);
        kostumer_2.setMember(true);
        kostumer_2.setMemberType(M2);
        kostumer_2.setServiceExpense(harga*diskon.getServiceDiscountRate(kostumer_2.getMember())) ;
        kostumer_2.setProductExpense(harga*diskon.getProductDiscountRate(kostumer_2.getMember()));
        
       
        visit kostumer_3=new visit(a3,MyObj);
        kostumer_3.setMember(true);
        kostumer_3.setMemberType(M3);
        kostumer_3.setServiceExpense(harga*diskon.getServiceDiscountRate(kostumer_3.getMember()));
        kostumer_3.setProductExpense(harga*diskon.getProductDiscountRate(kostumer_3.getMember()));
        diskon.getProductDiscountRate(kostumer_3.getMember());
       
 
        visit kostumer_4=new visit(a4,MyObj);
        kostumer_4.setMember(false);
        kostumer_4.setMemberType(M4);
        kostumer_4.setServiceExpense( harga*diskon.getServiceDiscountRate(kostumer_4.getMember()));
        kostumer_4.setProductExpense( harga*diskon.getProductDiscountRate(kostumer_4.getMember()));
        diskon.getProductDiscountRate(kostumer_3.getMember());
   
   
        
        System.out.println(kostumer_1.toString());
        System.out.println(kostumer_2.toString());
        System.out.println(kostumer_3.toString());
        System.out.println(kostumer_4.toString());
        
        
        
    }
 
    
}
