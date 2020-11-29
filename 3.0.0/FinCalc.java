public class FinCalc {
    public static void main(String[] arguments) {
        //Declare the parameters
        double assetPrice, downPaymentPercentage, financingAmount, annualRate;
        double installment;
        int terms;

        assetPrice = 1200000;
        downPaymentPercentage = 0.2;

        financingAmount = assetPrice * (1 - downPaymentPercentage);

        annualRate = 0.0499;
        terms = 48;

        System.out.println("Asset Selling Price: " + assetPrice);
        System.out.println("Downpayment: " + downPaymentPercentage*100 + "%");
        System.out.println("Financing Amount: " + financingAmount);

        installment = 22103.77;

        System.out.println("Annual Rate: " + annualRate*100 + "%\tTerms: " + terms + " months");
        System.out.println("Monthly Installment Amount: " + installment);

        System.out.println("\n======Here is the Payment Plan======");

        PaymentPlan(financingAmount, installment, annualRate, terms);

    }
}

public class PaymentPlan(double beginningBalance, double installment, doulbe rate, int terms) {

}