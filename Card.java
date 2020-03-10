// HOJA DE TRABAJO 6
// UVG - 10 DE MARZO DEL 2020
// MIRKA MONZÓN 18139
// DANIELA VILLAMAR 19086


public class Card {

    private String cardName;
    private String cardType;

    public Card (String cardName, String cardType){
        setCardName(cardName);
        setCardType(cardType);
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String toString(){
        return " Card Name: " + this.cardName +
                " Card Type: " + this.cardType;
    }

}
