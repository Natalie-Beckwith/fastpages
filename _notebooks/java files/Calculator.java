import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* In mathematics,
    an expression or mathematical expression is a finite combination of symbols that is well-formed
    according to rules that depend on the context.
   In computers,
    expression can be hard to calculate with precedence rules and user input errors
    to handle computer math we often convert strings into reverse polish notation
    to handle errors we perform try / catch or set default conditions to trap errors
     */
public class Calculator
{
    // Key instance variables
    private final String expression;
    private ArrayList<String> tokens;
    private ArrayList<String> reverse_polish;
    private Double result = 0.0;

    // Helper definition for supported operators
    private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
        OPERATORS.put("^", 4);
    }
    private final Map<Character, Integer> NUMBERS = new HashMap<>();
    {
        // Map<"token", precedence>
        NUMBERS.put('0', 3);
        NUMBERS.put('1', 3);
        NUMBERS.put('2', 3);
        NUMBERS.put('3', 4);
        NUMBERS.put('4', 4);
        NUMBERS.put('5', 4);
        NUMBERS.put('6', 4);
        NUMBERS.put('7', 4);
        NUMBERS.put('8', 4);
        NUMBERS.put('9', 4);
        NUMBERS.put('.', 4);
    }
    

    // Helper definition for supported operators
    private final Map<String, Integer> SEPARATORS = new HashMap<>();
    {
        // Map<"separator", not_used>
        SEPARATORS.put(" ", 0);
        SEPARATORS.put("(", 0);
        SEPARATORS.put(")", 0);
    }

    // Create a 1 argument constructor expecting a mathematical expression
    public Calculator(String expression) throws Exception
    {
        // original input
        this.expression = expression;

        // parse expression into terms
        this.termTokenizer();

        // place terms into reverse polish notation
        this.tokensToReversePolishNotation();

        // calculate reverse polish notation
        this.rpnToResult();
    }

    // Test if token is an operator
    private boolean isOperator(String token)
    {
        // find the token in the hash map
        return OPERATORS.containsKey(token);
    }

        // Test if token is an number
        private boolean isNumber(String token)
        {
            for (int charNum = 0;  charNum < token.length(); charNum++ )
            {
                if (!NUMBERS.containsKey(token.charAt(charNum)))
                {
                    return false;
                }
            }
            return true;
            // find the token in the hash map
   //         return NUMBERS.containsKey(token);
        }
    // Test if token is an separator
    private boolean isSeparator(String token)
    {
        // find the token in the hash map
        return SEPARATORS.containsKey(token);
    }

    // Compare precedence of operators.
    private Boolean isPrecedent(String token1, String token2)
    {
        // token 1 is precedent if it is greater than token 2
        return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0);
    }

    // Term Tokenizer takes original expression and converts it to ArrayList of
    // tokens
    private void termTokenizer()
    {
        // contains final list of tokens
        this.tokens = new ArrayList<>();

        int start = 0; // term split starting index
        StringBuilder multiCharTerm = new StringBuilder(); // term holder
        for (int i = 0; i < this.expression.length(); i++)
        {
            Character c = this.expression.charAt(i);
            if (isOperator(c.toString()) || isSeparator(c.toString()))
            {
                // 1st check for working term and add if it exists
                if (multiCharTerm.length() > 0)
                {
                    tokens.add(this.expression.substring(start, i));
                }
                // Add operator or parenthesis term to list
                if (c != ' ')
                {
                    tokens.add(c.toString());
                }
                // Get ready for next term
                start = i + 1;
                multiCharTerm = new StringBuilder();
            }
            else
            {
                // multi character terms: numbers, functions, perhaps non-supported elements
                // Add next character to working term
                multiCharTerm.append(c);
            }

        }
        // Add last term
        if (multiCharTerm.length() > 0)
        {
            tokens.add(this.expression.substring(start));
        }
    }

    // Takes tokens and converts to Reverse Polish Notation (RPN), this is one where
    // the operator follows its operands.
    private void tokensToReversePolishNotation() throws Exception
    {
        // contains final list of tokens in RPN
        this.reverse_polish = new ArrayList<>();

        // stack is used to reorder for appropriate grouping and precedence
        Stack<String> tokenStack = new Stack<String>();
        int count = 0;
        for (String token : tokens)
        {
            switch (token)
            {
                // If left bracket push token on to stack
                case "(":
                    tokenStack.push(token);
                    count++;
                    break;
                case ")":
                    while (!tokenStack.empty() && tokenStack.peek() != null && !tokenStack.peek().equals("("))
                    {
                        reverse_polish.add(tokenStack.pop());
                        
                    }                    

                    if(!tokenStack.empty())
                    {
                        tokenStack.pop();
                    }
                    count--;
                    break;
                case "+":
                    
                case "-":
                case "*":
                case "/":
                case "^":
                case "%":
                    // While stack
                    // not empty AND stack top element
                    // and is an operator
                    while (tokenStack.size() > 0 && isOperator(tokenStack.peek()))
                    {
                        if (isPrecedent(token, tokenStack.peek()))
                        {
                            reverse_polish.add(tokenStack.pop());
                            continue;
                        }
                        break;
                    }
                    // Push the new operator on the stack
                    tokenStack.push(token);
                    break;
                
                default: // Default should be a number, there could be test here
                    if(!isNumber(token))
                    {
                        Exception e = new Exception("\nThere are an unknown token in your expression: " + token);
                        throw e;
                    }
                    this.reverse_polish.add(token);
            }
        }

        //  Check misatched parenthesis
        if(count != 0)
        {
            //Exception e ("test");
            Exception e = new Exception("\nThere are uneven parenthesis in your expression.\n");
            throw e;
        }

        // Empty remaining tokens
        while (tokenStack.size() > 0)
        {
            reverse_polish.add(tokenStack.pop());
        }

    }

    // Takes RPN and produces a final result
    private void rpnToResult()
    {
        // stack is used to hold operands and each calculation
        Stack<Double> calcStack = new Stack<Double>();

        // RPN is processed, ultimately calcStack has final result
        for (String token : this.reverse_polish)
        {
            // If the token is an operator, calculate
            if (isOperator(token))
            {
                // Pop the two top entries
                Double x1  = calcStack.pop();
                Double x2 = calcStack.pop();

                // Calculate intermediate results
                
                switch (token)
                {
                    case "+":
                    result = calcStack.push(x1 + x2);
                    break;

                    case "-":
                    result = calcStack.push(x2 - x1);
                    break;

                    case "*":
                    result = calcStack.push(x1 * x2);
                    break;

                    case "/":
                    result = calcStack.push(x2 / x1);
                    break;

                    case "^":
                    result = calcStack.push(Math.pow(x2, x1));
                    break;
                }

                // Push intermediate result back onto the stack
                calcStack.push(result);
            }
            // else the token is a number push it onto the stack
            else
            {
                calcStack.push(Double.valueOf(token));
            }
        }
        // Pop final result and set as final result for expression
        this.result = calcStack.pop();
    }

    // Print the expression, terms, and result
    public String toString()
    {
        return ("Original expression: " + this.expression + "\n" + "Tokenized expression: " + this.tokens.toString()
                + "\n" + "Reverse Polish Notation: " + this.reverse_polish.toString() + "\n" + "Final result: "
                + String.format("%.2f", this.result));
    }

    // Tester method
    public static void main(String[] args)
    {
        try
        {
            // Random set of test cases
        Calculator simpleMath = new Calculator("100 + 200  * 3");
        System.out.println("\nSimple Math\n" + simpleMath);

        System.out.println();

        
        Calculator parenthesisMath = new Calculator("((100 + 200)  * 3)");
        System.out.println("Parenthesis Math\n" + parenthesisMath);

        System.out.println();

        Calculator decimalMath = new Calculator("100.2 - 99.3");
        System.out.println("Decimal Math\n" + decimalMath);

        System.out.println();

        Calculator moduloMath = new Calculator("300 % 200");
        System.out.println("Modulo Math\n" + moduloMath);

        System.out.println();

        Calculator divisionMath = new Calculator("300/200");
        System.out.println("Division Math\n" + divisionMath);

        System.out.println();

        Calculator exponentMath = new Calculator("2^3");
        System.out.println("Exponent Math\n" + exponentMath);

        System.out.println();
        
        }
        catch (Exception e) // catches errors
        {
            System.out.printf("Error in calculation\n%s\n", e.getMessage());
        }
        

    }
}
