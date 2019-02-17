package java.edu.csc413.calculator.operators;


import java.edu.csc413.calculator.evaluator.Operand;

public class BeginParenOperator extends Operator{

    public int priority(){
        return 1;
    }

    public Operand execute(Operand first, Operand second){
        System.out.println("Error. Should not be here.");
        return null;
    }
}
