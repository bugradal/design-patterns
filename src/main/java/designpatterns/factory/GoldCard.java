package designpatterns.factory;

public class GoldCard implements CreditCard{
    @Override
    public String createCreditCard() {
        return "Gold card has been created";
    }

    @Override
    public int getCreditLimit() {
        return 15000;
    }

    @Override
    public int getAnnualCharge() {
        return 100;
    }
}
