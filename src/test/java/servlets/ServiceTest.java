package servlets;


import org.junit.Assert;
import org.junit.Test;


public class ServiceTest {
    Service service = new Service();
    double array[] = {1, 4, 6, 7, 6, 7};


    @Test
    public void gaussianMethodShouldReturn() {

        Assert.assertEquals(service.gaussian(array), "Results: -0.3636363636363638 1.590909090909091 ");
    }


}