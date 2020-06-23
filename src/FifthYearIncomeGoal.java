import java.text.NumberFormat;

public class FifthYearIncomeGoal {
    public static void main(String [] args){
        int currentAnnualIncome = 62000;
        int increaseByNPercent = 10;
        int goalDuration = 5;
        double rateInDecimal = increaseByNPercent/100.0;
        double fifthYearAnnualIncome = currentAnnualIncome * Math.pow((1+rateInDecimal), goalDuration);


        System.out.println("Annual income on the fifth year: " +
                NumberFormat.getCurrencyInstance().format(fifthYearAnnualIncome));


    }
}
