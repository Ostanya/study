package spam;

abstract class KeywordAnalyzer implements  TextAnalyzer {
    abstract protected String[] getKeywords();
    abstract protected Label getLabel();

    @Override
    public Label processText(String text) {
        for(String keywords : getKeywords()) {
            if(text.contains(keywords))
                return getLabel();
        }
        return Label.OK;
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        return Label.OK;
    }
}
