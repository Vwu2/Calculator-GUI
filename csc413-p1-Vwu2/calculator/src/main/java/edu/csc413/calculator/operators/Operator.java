package java.edu.csc413.calculator.operators;

import java.edu.csc413.calculator.evaluator.Operand;

import java.util.HashMap;

public abstract class Operator {
    // The Operator class should contain an instance of a HashMap
    // This map will use keys as the tokens we're interested in,
    // and values will be instances of the Operators.
    // ALL subclasses of operator MUST be in their own file.
    // Example:
    // Where does this declaration go? What should its access level be?
    // Class or instance variable? Is this the right declaration?
    // HashMap operators = new HashMap();
    // operators.put( "+", new AdditionOperator() );
    // operators.put( "-", new SubtractionOperator() );

    private static HashMap<String,Operator> dataMap = new HashMap<>();

    static{
        dataMap.put("+", new AddOperator());
        dataMap.put("-", new SubtractOperator());
        dataMap.put("*", new MultiplyOperator());
        dataMap.put("/", new DivideOperator());
        dataMap.put("^", new PowerOperator());
        dataMap.put("(", new BeginParenOperator());
        dataMap.put(")", new EndParenOperator());
        dataMap.put("!", new LastOperator());
    }



    public abstract int priority();

    public abstract Operand execute( Operand op1, Operand op2 );



    /**
     * determines if a given token is a valid operator.
     * please do your best to avoid static checks
     * for example token.equals("+") and so on.
     * Think about what happens if we add more operators.
     */
    public static boolean check( String token ) {
        boolean pass = false;

        if(token.matches("[-+*/()^]")){
            pass = true;
        }
        return pass;
    }


    public static Operator getOperator(String token){
        return dataMap.get(token);
    }
}
