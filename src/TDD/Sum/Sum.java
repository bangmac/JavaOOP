package TDD.Sum;

public class Sum {
    public int Sum(int a, int b){
        //throw new UnsupportedOperationException("out of range");
        if (a/2 + b/2 >= Integer.MAX_VALUE/2){
            throw new UnsupportedOperationException("out of range exception");
        }
        if (a/2 + b/2 <= Integer.MIN_VALUE/2){
            throw new UnsupportedOperationException("out of range exception");
        }
        return a+b;
    }
}
