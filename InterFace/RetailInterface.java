package InterFace;

public interface RetailInterface {
    float getTotalCost(float tax, float cost, float number);
    float getTotalExtendedCost(float cosmetics, float perfume, float clothes);
    void getDiscountedCost(float totalCost);
    
}
