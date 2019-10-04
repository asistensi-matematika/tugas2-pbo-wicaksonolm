/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author Asus
 */
public class  DiscountRate {
    private static double ServiceDiscountPremium=0.2;
    private static double ServiceDiscountGold=0.15;
    private static double ServiceDiscountSilver=0.1;
    private static double ServiceDiscountNon=0;
    
    private static double ProductDiscountPremium=0.1;
    private static double ProductDiscountGold=0.1;
    private static double ProductDiscountSilver=0.1;
    private static double ProductDiscountNon=0.1;
   static double getServiceDiscountRate(String type){
        return  (type.equals("premium")) ?  ServiceDiscountPremium: ((type.equals("gold")) ?  ServiceDiscountGold:type.equals("silver")?ServiceDiscountSilver:ServiceDiscountNon);}
   static double getProductDiscountRate(String type){   
        return (type.equals("premium")) ?  ProductDiscountPremium: ((type.equals("gold")) ?  ProductDiscountGold:type.equals("silver")?ProductDiscountSilver:ProductDiscountNon);}
    
}
