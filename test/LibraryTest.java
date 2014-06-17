import com.twu.biblioteca.Library;
import org.junit.Test;

import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    @Test
    public void shouldReturnWelcome(){
        //ARRANGE
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(printStream);
        //ACTION
        library.displayWelcomeMessage();
        //ASSERT
        verify(printStream).println("Welcome!");
    }

    @Test
    public void shouldListBooks(){
        Library library = new Library(System.out);
        assertEquals("Harry Potter by J.K. Rowling", library.listBooks().get(0));
        assertEquals("1948 by George Orwell", library.listBooks().get(1));

    }

    @Test
    public void shouldDisplayListOfBooks(){
        //ARRANGE
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(printStream);
        //ACTION
        library.displayListOfBooks();
        //ASSERT
        verify(printStream).println("Harry Potter by J.K. Rowling\n1948 by George Orwell");

    }

}
