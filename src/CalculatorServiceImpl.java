public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int sum(int x, int y) {
       return x+y;
    }

    @Override
    public int prod(int x, int y) {
     return x*y;
    }
}
