package Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1
{
    public static void main(String[] args)// { ( [ ] ) }
    {
        ArrayList openingSymbols = new ArrayList(Arrays.asList("{", "(", "["));//WARNING!!! Opening and closing symbols must have the same ID.
        ArrayList closingSymbols = new ArrayList(Arrays.asList("}", ")", "]"));
        ArrayList<String> allTests = new ArrayList<String>();

        allTests.add("{()}[{([])}]");   //true  0
        allTests.add("{)");             //false 1
        allTests.add("{}");             //true  2
        allTests.add("{(})");           //false 3

        allTests.add("}");              //false 4
        allTests.add("{()}{[]}");       //true  5
        allTests.add("[{}}");           //false 6
        allTests.add("{()[{}]}{}");     //true  7
        allTests.add("{(})");           //false 8
        allTests.add("([(]{)})");       //false 9

        _RunAllTests(openingSymbols, closingSymbols, allTests);
    }

    private static void _RunAllTests(ArrayList openingSymbols, ArrayList closingSymbols, ArrayList<String> allTests) {
        for(int j = 0; j < allTests.size(); j++)
        {
            Calculate calculator = new Calculate(allTests.get(j), openingSymbols, closingSymbols);
            boolean value = calculator.Run();
            System.out.println(Integer.toString(j) + ": " + value);
        }


    }
}

