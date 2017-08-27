package testcdi;

import static org.junit.Assert.*;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RestaurantTest1 {

    private static String TOMATO_SOUP = "Tomato Soup";
    private EJBContainer container;

    @EJB
    private Waiter joe;

    @Before
    public void startContainer() throws Exception {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
    }

    @Test
    public void orderSoup(){
        String someSoup = joe.orderSoup(TOMATO_SOUP);
        assertEquals(TOMATO_SOUP, someSoup);

        String sameSoup = joe.orderWhatTheOtherGuyHad();
        assertEquals(TOMATO_SOUP, sameSoup);
    }

    @After
    public void closeContainer() throws Exception {
        container.close();
    }
}
