package Interpreter;

public class BirdLang {

    private Language language;

    public BirdLang() {
        language = Language.BIRD;
    }

    public String translateToEnglish(String word) {
        String[] words = word.split(" ");
        String english = "";
        for (String str : words) {
            String wordInEnglish = convertToEnglish(str);
            english +=  " " + wordInEnglish;
        }
        return english;
    }

    private String convertToEnglish(String str) {
        String wordAdjuster = str;
        String syllable = spell(wordAdjuster);
        String[] syllableList = syllable.split("-");
        String actualWord = findActualWord(syllableList);
        return actualWord;
    }

    private String findActualWord(String[] syllableList) {

        int i = 0;
        String actualWord = "";

        for (String str : syllableList) {
            if (i % 2 == 0)
                actualWord += str;
            i++;
        }

        return actualWord;

    }

    private String spell(String wordAdjuster) {
        String spelledWord = "";
        while (wordAdjuster.length() > 0){
            String syllable = getSyllable(wordAdjuster);
            spelledWord += syllable + "-";
            wordAdjuster.replaceFirst(syllable, "");
        }
        return spelledWord;
    }

    private String getSyllable(String word) {
        int size = language.getPrefix().length();
        if (word.length() < size){
            size = word.length();
        }

        String substr = word.substring(0, size);
        return substr;

    }
}
