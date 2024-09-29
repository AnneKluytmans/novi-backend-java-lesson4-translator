package inheritance;

public class EnglishTranslator extends TranslatorBase {
    public EnglishTranslator() {
        super(new String[]{
                        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
                },
                "I don't know");
    }
}
