package normal;

public class EnglishTranslator {
    public String[] writtenNumbers = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    public String unknown = "I don't know";

    public String getText(int number){
        if(number >= 0 && number < writtenNumbers.length) {
            return writtenNumbers[number];
        }
        return unknown;
    }

    public int getNumber(String numberText){
        for (int i = 0; i < writtenNumbers.length; i++) {
            if(writtenNumbers[i].equals(numberText)){
                return i;
            }
        }
        return -10;
    }
}

