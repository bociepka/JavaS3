package kolokwium1.appl;

import kolokwium1.excp.BadInputException;
import kolokwium1.excp.NothingToSubstractFromException;
import kolokwium1.excp.TooBigNumberException;

import java.io.IOException;

public abstract class Calculator {


    abstract void SaveToFile (String filename) throws IOException;
    abstract void Add(String x);

    abstract void Subtract(String x) throws NothingToSubstractFromException, BadInputException;

    abstract void Multiply(int x) throws TooBigNumberException;
}
