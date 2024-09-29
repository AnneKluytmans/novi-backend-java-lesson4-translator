package normal;

public class DutchTranslator {
    public String[] writtenNumbers = {
            "nul", "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien",
            "elf", "twaalf", "dertien", "veertien", "vijftien", "zestien", "zeventien", "achttien", "negentien"
    };

    public String unknown = "ik weet het niet";

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
        return -10;
    }

}

