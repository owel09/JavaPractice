package Fundamentals.Enum;

public enum Operation {
    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE;

    double calculate(double x, double y){
        switch (this){
            /*
            bakit this yung ginamit ko dito sa switch?
             */
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case MULTIPLY:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("unknown operation" + this);
        }
    }
}
