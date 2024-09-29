package normal;

public class GermanTranslator {
    public String[] writtenNumbers = {
            "null", "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn",
            "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzehn", "neunzehn"
    };

    public String unknown = "Weiß ich nicht";

    public String getText(int number) {
        if (number >= 0 && number < writtenNumbers.length) {
            return writtenNumbers[number];
        }
        return unknown;
    }

    public int getNumber(String numberText) {
        for (int i = 0; i < writtenNumbers.length; i++) {
            if (writtenNumbers[i].equals(numberText)) {
                return i;
            }
        }
        return -1;
    }
}
