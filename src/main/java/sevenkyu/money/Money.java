package sevenkyu.money;

class Money {

    public int calculateYears(double principal, double interest, double tax, double desired) {
        int year = 0;
        double currentMoney = principal;
        while (currentMoney < desired) {
            double profit = currentMoney * interest;
            profit -= profit * tax;
            currentMoney += profit;
            year++;
        }
        return year;
    }
}
