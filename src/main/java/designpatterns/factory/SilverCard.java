package designpatterns.factory;

public class SilverCard implements CreditCard{
    @Override
    public String createCreditCard() {
        return "Silver card has been created";
    }

    @Override
    public int getCreditLimit() {
        return 5000;
    }

    @Override
    public int getAnnualCharge() {
        return 50;
    }
}
