package src.final_assignment;

public class Card implements Comparable<Card>{
    private String cardName;
    private String cardColor;
    private ManaCost convertedCost;
    
    public Card(){
        cardName = "Undefined";
        cardColor = "Undefined";
        convertedCost = new ManaCost();
    }
    
    public Card(String name, String color,ManaCost cmc){
        setCardName(name);
        setCardColor(color);
        setCMC(cmc);
    }
    
    public String getCardName(){
        return cardName;
    }

    public void setCardName(String cardName){
        validateName(cardName);
        this.cardName = cardName;
    }

    private void validateName(String name){
        if(name == null || name.equals("")) {
            throw new IllegalArgumentException("Card name is required.");
        }
    }

    public String getCardColor(){
        return cardColor;
    }

    public void setCardColor(String color){
        validateColor(color);
        cardColor = color;
    }

    private void validateColor(String color){
        if(color == null || color.equals("")) {
            throw new IllegalArgumentException("Card color is required.");
        }
    }

    public ManaCost getCMC() {
        return convertedCost;
    }

    public void setCMC(ManaCost CMC) {
        validateCMC(CMC);
        convertedCost = CMC;
    }

    public void validateCMC(ManaCost CMC) {
        if(CMC == null) {
            throw new IllegalArgumentException("Author is required.");
        }
    }
    
    
    @Override
    public int compareTo(Card o) {
        int result = this.cardColor.compareTo(o.cardColor);
        return result;
    }
}
