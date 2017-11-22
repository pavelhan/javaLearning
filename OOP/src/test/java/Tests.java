import com.company.Manufacturers;
import com.company.devicesHierarhy.Computers;
import com.company.devicesHierarhy.Laptops;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {

    @Test
    public void CreateNewLapTop(){
        Laptops hp = new Laptops("HP", 220, 256, Manufacturers.Konia);
        assertEquals("HP", hp.getName());
        assertEquals(220, hp.getDDRCapacity());
        assertEquals(256, hp.getPower());
        assertEquals(Manufacturers.Konia, hp.getManufacturer());

    }
}
