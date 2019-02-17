package java.edu.csc413.calculator.operators;


import java.edu.csc413.calculator.evaluator.Operand;

public class DivideOperator extends Operator{

    public int priority(){
        return 4;
    }

    public Operand execute(Operand first, Operand second){
        int temp = 0;
        temp = first.value / second.value;
        Operand result = new Operand(temp);
        return result;
    }
}
