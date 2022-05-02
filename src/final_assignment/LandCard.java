package src.final_assignment;

public class LandCard extends Card{
    private String landType;

    public LandCard(){
        super();
        landType = "Undefined";
    }

    public LandCard(String cardName, String cardColor,ManaCost convertedCost, String landType) {
        super(cardName, cardColor, convertedCost);
        setLandType(landType);
       
    }

    public String getLandType() {
        return landType;
    }

    public void setLandType(String landType) {
        validateLand(landType);
        this.landType = landType;
    }

    public void validateLand(String landType) {
        if(landType == null || landType.equals("")) {
            throw new IllegalArgumentException("Land type is required.");
        }
    }
}
