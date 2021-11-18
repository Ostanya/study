package spam;

//TooLongTextAnalyzer должен конструироваться от int'а
//        с максимальной допустимой длиной комментария.
//        Объект этого класса должен сохранять в своем
//        состоянии это число в приватном поле maxLength.

public class TooLongTextAnalyzer implements TextAnalyzer{

    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if(text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
