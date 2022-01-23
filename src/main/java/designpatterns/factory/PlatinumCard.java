package designpatterns.factory;

public class PlatinumCard implements CreditCard{
    @Override
    public String createCreditCard() {
        return "Platinum card has been created";
    }


    @Override
    public int getCreditLimit() {
        return 30000;
    }

    @Override
    public int getAnnualCharge() {
        return 150;
    }
}