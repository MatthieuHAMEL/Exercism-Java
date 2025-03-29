class CalculatorConundrum {
  public String calculate(int operand1, int operand2, String operation) {
    switch (operation) {
        case "+":
          return Integer.toString(operand1) + 
            " + " + 
            Integer.toString(operand2) + 
            " = " +
            Integer.toString(operand1 + operand2);
        case "*":
          return Integer.toString(operand1) + 
            " * " + 
            Integer.toString(operand2) + 
            " = " +
            Integer.toString(operand1 * operand2);
        case "/":
          try {
            return Integer.toString(operand1) + 
              " / " + 
              Integer.toString(operand2) + 
              " = " +
              Integer.toString(operand1 / operand2);
          }
          catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
          }
        case null: // NB: Java 21 !!!
          throw new IllegalArgumentException("Operation cannot be null");
        case "":
          throw new IllegalArgumentException("Operation cannot be empty");
        default:
          throw new IllegalOperationException("Operation '" + operation +"' does not exist");
      }
  }
}
