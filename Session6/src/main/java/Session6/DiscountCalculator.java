package Session6;

public class DiscountCalculator {

    public enum MembershipType {SILVER, GOLD, PLATINUM, NONE};


    public double calculateDiscount(double originalPrice, MembershipType membership) {
        if (membership == MembershipType.SILVER && originalPrice > 100) {
            return originalPrice * 0.95;
        } else if (membership == MembershipType.GOLD && originalPrice > 50) {
            return originalPrice * 0.90;
        } else if (membership == MembershipType.PLATINUM) {
            return originalPrice * 0.80;
        } else {
            return originalPrice;
        }
    }

}
