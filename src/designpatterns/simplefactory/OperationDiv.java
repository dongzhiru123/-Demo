package designpatterns.simplefactory;

public class OperationDiv extends Operation {
    @Override
    public double getResult(double number1, double number2) {
        if (number2 == 0) throw new RuntimeException("除数不可为 0 ！");
        return number1 / number2;
    }
}
