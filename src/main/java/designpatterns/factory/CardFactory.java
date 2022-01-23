package designpatterns.factory;

public class CardFactory {

    public static CreditCard getCreditCard(CardType cardType){
        switch (cardType){
            case SILVER: return new SilverCard();
            case GOLD: return new GoldCard();
            case PLATINUM: return new PlatinumCard();
            default: throw new UnsupportedOperationException();
        }
    }
}
