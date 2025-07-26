package interfaces;

public class GermanTranslator extends TranslatorBase {
    public GermanTranslator() {
        super(new String[]{
                        "null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn",
                        "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzehn", "neunzehn"},
                "Weiß ich nicht");
    }
}
