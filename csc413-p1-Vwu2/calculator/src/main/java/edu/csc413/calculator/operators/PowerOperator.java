package java.edu.csc413.calculator.operators;


import java.edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator{

    public int priority(){
        return 5;
    }

    public Operand execute(Operand first, Operand second){
        int temp = 1;

        for(int i = 0; i < second.value; i++){
            temp *= first.value;
        }

        Operand result = new Operand(temp);
        return result;
    }
}
