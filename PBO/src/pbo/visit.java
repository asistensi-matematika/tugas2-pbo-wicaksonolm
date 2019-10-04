/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Date;


public class visit extends Costumer {
    private Costumer Costumer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    DiscountRate diskon=new DiscountRate();
    public visit(String name,Date date) {
        super(name);
        this.date=date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
     ;
    public double getTotalExpense(){
        return 982758+getProductExpense()-getServiceExpense() ;
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
  
    @Override
    public String toString() {
        return "################\n"+" nama kostumer: "+ super.getName()+"\n"+ ", tipe member=" + super.getMember() +"\n"+ ", tanggal=" + date +"\n"+ ", serviceExpense=" + serviceExpense + "\n"+", productExpense=" + productExpense +"\n"+"total= "+getTotalExpense();
    }

   
    

  
    
    
}
