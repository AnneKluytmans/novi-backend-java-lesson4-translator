package composition;

import inheritance.DutchTranslator;
import inheritance.EnglishTranslator;
import inheritance.TranslatorBase;

public class DutchEnglishTranslator {
    public TranslatorBase to;
    public TranslatorBase from;

    public DutchEnglishTranslator() {
        from = new DutchTranslator();
        to = new EnglishTranslator();
    }

    public String translate(int number){
        return to.getText(number);
    }

    public String translate(String numberText){
        var number = from.getNumber(numberText);
        return translate(number);
    }

    public String translateReverse(int number){
        return from.getText(number);
    }

    public String translateReverse(String numberText){
        var number = to.getNumber(numberText);
        return translateReverse(number);
    }
}
