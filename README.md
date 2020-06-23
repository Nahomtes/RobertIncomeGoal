# RobertIncomeGoal
Assignment:

Robert is working on his 5-year goal : To increase his current $62,000 annual income by 10% each year.

Pseudocode:

    BEGIN
        Set currentAnnualIncome = 62000
        Set increaseByNPercent = 10
        Set goalDuration = 5
        Set rateInDecimal = increaseByNPercent/100
        Set fifthYearAnnualIncome = currentAnnualIncome(1+rateInDecimal)^goalDuration
        
        Set output = "Annual income on the fifth year: $" + fifthYearAnnualIncome
        Display output
    END