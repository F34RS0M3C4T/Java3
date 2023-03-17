package filter;

public class LengthStringFilter implements Filter{
    private int length;
    public LengthStringFilter(int length){
        if(length < 0){
            throw new IllegalArgumentException();
        }
        this.length = length;
    }

    @Override
    public boolean apply(String string) {
        return string != null && string.length() == length;
    }
}
