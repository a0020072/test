import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testBubbleSort {

    private BubbleSort c;

    @Before

    public void setUp() throws Exception {

        c = new BubbleSort();

    }

    @Test

    public void test1() {

        int a[] = new int[]{1,7,2,2,5};
        int b[]=new int[]{2,5,2,1,1,17};
        int a1[] = new int[]{1,2,2,5,7};
        int b1[]=new int[]{1,1,2,2,5,17};
        assertEquals(Arrays.toString(a1), Arrays.toString(c.BubbleSort(a)));
        assertEquals(Arrays.toString(b1), Arrays.toString(c.BubbleSort(b)));      

    }

    @After

    public void tearDown() throws Exception {

        c = null;

    }
}
