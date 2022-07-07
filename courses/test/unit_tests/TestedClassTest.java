package unit_tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(TestedClass.class)
public class TestedClassTest {

    private static final String TESTED_STRING = "git-tested-string";

    @Test
    public void getTestedField() {
        TestedClass testedClass = new TestedClass(TESTED_STRING);
        Assert.assertEquals(TESTED_STRING, testedClass.getTestedField());
    }

    @Test
    public void getMockedTestedField() {
        TestedClass testedClass = mock(TestedClass.class);
        when(testedClass.getTestedField()).thenReturn(TESTED_STRING);
        Assert.assertEquals(TESTED_STRING, testedClass.getTestedField());
    }

    @Test
    public void getSpiedTestedField() {
        TestedClass testedClass = Mockito.spy(TestedClass.class);
        testedClass.getTestedField();
        verify(testedClass, times(1)).getTestedField();
    }

    @Test(expected = IllegalStateException.class)
    public void testedMethodTest() {
        TestedClass testedClass = mock(TestedClass.class);
        when(testedClass.getTestedField()).thenThrow(new IllegalStateException());
        testedClass.getTestedField();
    }

    @Test
    public void privateMethodTest() throws Exception {
        TestedClass testedClass = PowerMockito.mock(TestedClass.class);
        PowerMockito.when(testedClass, "privateTest").thenReturn(TESTED_STRING);
        String result = Whitebox.invokeMethod(testedClass, "privateTest");
        Assert.assertEquals(TESTED_STRING, result);
    }
}
