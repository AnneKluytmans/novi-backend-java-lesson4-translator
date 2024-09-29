import aggregation.LanguageTranslator;
import composition.DutchEnglishTranslator;
import inheritance.*;

public class TranslatorApp {
    public static void main(String[] args) {
        TranslatorBase translator = new DutchTranslator();

        System.out.println(translator.getText(9));
        System.out.println(translator.getNumber("vier33"));

        var translatorProvider = new DutchEnglishTranslator();

        System.out.println(translatorProvider.translate("vijf"));

        LanguageTranslator languageTranslator = new LanguageTranslator(new EnglishTranslator(), new GermanTranslator());

        System.out.println(languageTranslator.translate("five"));

    }
}
