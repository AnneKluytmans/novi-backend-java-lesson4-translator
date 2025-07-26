package aggregation;

import inheritance.TranslatorBase;

public class LanguageTranslator {
    public TranslatorBase to;
    public TranslatorBase from;

    public LanguageTranslator(TranslatorBase from, TranslatorBase to) {
        this.from = from;
        this.to = to;
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

    public String translateReverse(String numberText) {
        var number = to.getNumber(numberText);
        return translateReverse(number);
    }
}
