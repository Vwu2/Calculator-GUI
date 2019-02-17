package java.edu.csc413.calculator.operators;

import java.edu.csc413.calculator.evaluator.Operand;

public class AddOperator extends Operator {

    public int priority(){
        return 2;
    }

    public Operand execute(Operand first, Operand second){
        int temp;
        temp = first.value + second.value;
        Operand result = new Operand(temp);
        return result;
    }
}
