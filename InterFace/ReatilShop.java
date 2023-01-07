package InterFace;

import java.util.Scanner;

public class ReatilShop implements RetailInterface {
   
    @Override
    public float getTotalCost(float tax, float cost, float number) {
        // TODO Auto-generated method stub
        float totalCost= (cost*(1 +(tax/100)))*number;
        System.out.println("Total cost of items:", +totalCost);
        return totalCost;
    }

    @Override
    public float getTotalExtendedCost(float cosmetics, float perfume, float clothes) {
        // TODO Auto-generated method stub
        float totalExtendedCost= cosmetics+perfume+clothes;
        System.out.println("Total extended cost is:", +totalExtendedCost);
        return totalExtendedCost;
    }

    @Override
    public void getDiscountedCost(float totalCost) {
        // TODO Auto-generated method stub
        float discountedCost=  (float) (totalCost*(0.98));
        System.out.println("The Discounted price is:", +discountedCost);
   
    }

    public static void public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to the shop");
        System.out.println("enter the amount of cosmetics:");
        float cosmetics=sc.nextFloat();
        System.out.println("Enter the amount of perfume:");
        float perfume=sc.nextFloat();
        System.out.println("Enter the amount of clothes:");
        float clothes=sc.nextFloat();

        ReatilShop r1 = new ReatilShop();
        float cost1 = r1.getTotalCost(7, 100000,cosmetics);
        System.out.println("Total cost of cosmetics:", +cost1);
        float cost2= r1.getTotalCost(12, 5000, perfume);
        System.out.println("Total cost of perfume:", +perfume);
        float cost3= r1.getTotalCost(4, 7000, clothes);
        System.out.println("Total cost of clothes:", +clothes);

        float totalCost= r1.getTotalExtendedCost(cost1, cost2, cost3);

        r1.getDiscountedCost(totalCost);
        
    }
    
}
