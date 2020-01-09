package AbsoluteNumberCalculator;

public class AbsoluteNumberCalulator {
    public static int findAbsolute(int number){
        //throw new UnsupportedOperationException();
        if (number<0){
            return -number;
        }
        return number;
    }
}
