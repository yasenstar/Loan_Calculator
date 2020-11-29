public class FinCalc {
    public static void main(String[] arguments) {
        //Declare the parameters
        double assetPrice, downPaymentPercentage, financingAmount, annualRate;
        double installment;
        int terms;
        String line = "==============================================================================================";

        assetPrice = 635000;
        downPaymentPercentage = 0.3;

        financingAmount = assetPrice * (1 - downPaymentPercentage);

        annualRate = 0.0425;
        terms = 30;

        System.out.println("Asset Selling Price: " + assetPrice);
        System.out.println("Downpayment: " + downPaymentPercentage*100 + "%");
        System.out.println("Financing Amount: " + financingAmount);

        // formula of monthly installment:
        // installment = finance_amount * monthly_rate * (1 + monthly_rate)^term / [(1 + monthly_rate)^n - 1]
        installment = financingAmount * (annualRate/12) * Math.pow(1+annualRate/12, terms) / (Math.pow(1+annualRate/12, terms) - 1);

        System.out.println("Annual Rate: " + annualRate*100 + "%\tTerms: " + terms + " months");
        System.out.printf("Monthly Installment Amount: %10.2f", installment);

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