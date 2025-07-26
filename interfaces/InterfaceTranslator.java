package interfaces;

public class InterfaceTranslator {
    private final TextToNumberTranslator from;
    private final NumberToTextTranslator to;

    public InterfaceTranslator(TextToNumberTranslator from, NumberToTextTranslator to) {
        this.from = from;
        this.to = to;
    }

    public String translate(int number){
        return to.getText(number);
    }

    public String translate(String numberText){
        int number = from.getNumber(numberText);
        return translate(number);
    }
}
