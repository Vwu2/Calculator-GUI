package java.edu.csc413.calculator;


public class SubtractOperator extends Operator{

    public int priority(){
        return 2;
    }

    public Operand execute(Operand first, Operand second){
        int temp;
        temp = first.value - second.value;
        Operand result = new Operand(temp);
        return result;
    }
}
