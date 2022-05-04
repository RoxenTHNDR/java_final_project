package src.final_assignment;

public class ManaCost {
    int red;
    int black;
    int blue;
    int white;
    int green;
    int colorless;

    public ManaCost(){
        red = 0;
        black = 0;
        blue = 0;
        white = 0;
        green = 0;
        colorless = 0;
    }

    public ManaCost(int red, int black, int blue, int white, int green, int colorless){
        validate(red);
        validate(black);
        validate(blue);
        validate(white);
        validate(green);
        validate(colorless);
        
        this.red = red;
        this.black = black;
        this.blue = blue;
        this.white = white;
        this.green = green;
        this.colorless = colorless;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        validate(red);
        this.red = red;
    }

    public int getBlack() {
        return black;
    }

    public void setBlack(int black) {
        validate(black);
        this.black = black;
    }

    
    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        validate(blue);
        this.blue = blue;
    }

    public int getWhite() {
        return white;
    }

    public void setWhite(int white) {
        validate(white);
        this.white = white;
    }
    
    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        validate(green);
        this.green = green;
    }

    public int getColorless() {
        return colorless;
    }

    public void setColorless(int colorless) {
        validate(colorless);
        this.colorless = colorless;
    }

    public String toString(){
        return "Red: " + red + "\nBlack: " + black + "\nBlue: " + blue + "\nWhite: " + white + "\nGreen: " + green + "\nFill: " + colorless;
    }

    private void validate(int color){
        if(color < 0) {
            throw new IllegalArgumentException("Mana cost cannot be negitive");
        }
    }

    public int getTotalCost(){
        return red + blue + black + white + green + colorless;
    }

}

