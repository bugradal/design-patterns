package designpatterns.factory;

public class FactoryMain {
    public static void main(String[] args) {
        String silverCard = CardFactory.getCreditCard(CardType.SILVER).createCreditCard();
        String goldCard = CardFactory.getCreditCard(CardType.GOLD).createCreditCard();
        String platinumCard = CardFactory.getCreditCard(CardType.PLATINUM).createCreditCard();

        System.out.println(silverCard);
        System.out.println(goldCard);
        System.out.println(platinumCard);

    }

}
