public class FinCalc {
    public static void main(String[] arguments) {
        //Declare the parameters
        double assetPrice, downPaymentPercentage, financingAmount, annualRate;
        double installment;
        int terms;
        String line = "==============================================================================================";

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
        System.out.println(line);
        System.out.println("Term\tBeginning Balance\tInstallment\tInterest\tPrincipal\tEnding Balance");    
        System.out.println(line);

        // Monthly Payment Detail
        double beginningBalance = financingAmount;
        for (int i = 1; i <= terms; i++) {
            double interest = beginningBalance * (annualRate / 12);
            double principal = installment - interest;
            double endingBalance = beginningBalance - principal;
            //System.out.println(i + "\t" + beginningBalance + "\t" + installment 
            //    + "\t" + interest + "\t" + principal + "\t" + endingBalance);
            System.out.printf("%d\t%10.2f\t\t%10.2f\t%10.2f\t%10.2f\t%10.2f\n", i, beginningBalance, installment, interest, principal, endingBalance);
            beginningBalance = endingBalance;
        }

        System.out.println(line);
    }
}