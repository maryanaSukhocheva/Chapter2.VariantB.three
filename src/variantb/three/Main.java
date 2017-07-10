package variantb.three;

import java.io.IOException;
import variantb.three.action.InputData;
import variantb.three.action.MathFunction;

/**
 *
 * @author SLAVA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputData inputParametr = new InputData();
        double a = inputParametr.inputParametr("a");
        double b = inputParametr.inputParametr("b");
        double c = inputParametr.inputParametr("c");
        MathFunction.solutionOfSquareEquation(a, b, c);
       
 
    }
}
