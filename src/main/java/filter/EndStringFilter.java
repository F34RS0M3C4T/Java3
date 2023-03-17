package filter;

public class EndStringFilter implements Filter{
    private String pattern;
    public EndStringFilter(String pattern){
        if(pattern == null || "".equals(pattern)){
            throw new IllegalArgumentException();
        }
        this.pattern = pattern;
    }

    @Override
    public boolean apply(String string) {
        return string != null && string.endsWith(pattern);
    }
}
