**Rename Method**
Problem
The name of a method doesn’t explain what the method does.

Solution
Rename the method.

**Extract Class**
Problem
When one class does the work of two, awkwardness results.

Solution
Instead, create a new class and place the fields and methods responsible for the relevant functionality in it.

**Inline Method**
Problem
When a method body is more obvious than the method itself, use this technique.

Solution
Replace calls to the method with the method’s content and delete the method itself.

**Pull Up Method**
Problem
Your subclasses have methods that perform similar work.

Solution
Make the methods identical and then move them to the relevant superclass.


**Form Template Method**
Problem
Your subclasses implement algorithms that contain similar steps in the same order.

Solution
Move the algorithm structure and identical steps to a superclass, and leave implementation of the different steps in the subclasses.

**Move Method**
Problem
A method is used more in another class than in its own class.

Solution
Create a new method in the class that uses the method the most, then move code from the old method to there. Turn the code of the original method into a reference to the new method in the other class or else remove it entirely.

**Replace Temp with Query**
Problem
You place the result of an expression in a local variable for later use in your code.

Solution
Move the entire expression to a separate method and return the result from it. Query the method instead of using a variable. Incorporate the new method in other methods, if necessary.


https://github.com/gabrieldantasoli/Pr-ticas-direcioadas-T.D.D./tree/main/SISVOOS/src/test

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AeronaveTest {

    private AeronaveController aeronaveController;
    private AeronaveRepository aeronaveRepository;

    @Before
    public void setUp() {
        aeronaveRepository = new AeronaveRepository();
        aeronaveController = new AeronaveController(aeronaveRepository);
    }

    @Test
    public void testAdicionarAeronave() {
        Aeronave aeronave = new Aeronave("Boeing 737", "Exemplo Airlines", 150);
        aeronaveController.adicionarAeronave(aeronave);
        assertNotNull(aeronaveRepository.buscarAeronavePorModelo("Boeing 737"));
    }

    @Test
    public void testRemoverAeronave() {
        Aeronave aeronave = new Aeronave("Boeing 737", "Exemplo Airlines", 150);
        aeronaveController.adicionarAeronave(aeronave);
        aeronaveController.removerAeronave("Boeing 737");
        assertNull(aeronaveRepository.buscarAeronavePorModelo("Boeing 737"));
    }

    @Test
    public void testListarAeronaves() {
        Aeronave aeronave1 = new Aeronave("Boeing 737", "Exemplo Airlines", 150);
        Aeronave aeronave2 = new Aeronave("Airbus A320", "Outra Companhia", 200);
        aeronaveController.adicionarAeronave(aeronave1);
        aeronaveController.adicionarAeronave(aeronave2);
        List<Aeronave> aeronaves = aeronaveController.listarAeronaves();
        assertEquals(2, aeronaves.size());
    }