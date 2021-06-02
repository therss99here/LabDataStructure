public class Calculator implements SimpleCalc{
    private final int operand1;
    private final int operand2;

    private Calculator (int operand1, int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    @Override
    public int add() {
        return operand1+operand2;
    }

    @Override
    public int subtract() {
        if(operand1>operand2) return operand1-operand2;

        return operand2-operand1;
    }

    @Override
    public int product() {
        return operand1*operand2;
    }

    @Override
    public int division() {
        if(operand1>operand2) return operand1/operand2;

        return operand2/operand1;
    }

    // Driver Code
    public static void main(String[] args) {
        final int o1 = 5;
        final int o2 = 10;
        Calculator calculator = new Calculator(o1,o2);
        System.out.println("Sum of given number: " + calculator.add());
        System.out.println("Subtraction of given number: " + calculator.subtract());
        System.out.println("Product of given number: " + calculator.product());
        System.out.println("Division of given number: " + calculator.division());
    }
}
