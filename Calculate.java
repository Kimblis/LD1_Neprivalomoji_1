package Task1;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculate
{
    String _SymbolsLine;
    ArrayList _OpeningSymbols;
    ArrayList _ClosingSymbols;

    ArrayList<Integer> _SymbolsWithNegatives = new ArrayList<Integer>();

    public Calculate(String symbolsLine, ArrayList openingSymbols, ArrayList closingSymbols)
    {
        _SymbolsLine = symbolsLine;
        _OpeningSymbols = openingSymbols; // { ( [
        _ClosingSymbols = closingSymbols; // } ) ]
    }

    public boolean Run()
    {
            var items = new ArrayList(Arrays.asList(_SymbolsLine.split("")));
            if (items.size()%2 == 0)
            {
                for(int j = 1;j < items.size()-1;j++)
                {
                    if(_OpeningSymbols.indexOf(items.get(j-1)) == _ClosingSymbols.indexOf(items.get(j)))
                    {
                        items.remove(j-1);
                        items.remove(j-1);
                        j=0;
                    }

                }
                return items.size() == 0 || _OpeningSymbols.indexOf(items.get(0)) == _ClosingSymbols.indexOf(items.get(1));
            }
            return false;
    }
}
