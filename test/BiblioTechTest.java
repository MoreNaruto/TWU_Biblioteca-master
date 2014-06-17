import com.twu.biblioteca.BiblioTech;
import com.twu.biblioteca.Library;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BiblioTechTest {

    @Test
    public void shouldRunDisplay(){
        Library library = mock(Library.class);
        BiblioTech biblioTech = new BiblioTech(library);

        biblioTech.go();

        verify(library).displayWelcomeMessage();
    }

    @Test
    public void shouldRunListBooks(){

    }

}
