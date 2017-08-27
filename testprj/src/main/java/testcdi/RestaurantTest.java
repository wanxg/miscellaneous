package testcdi;

import static org.junit.Assert.*;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RestaurantTest {

    private static String TOMATO_SOUP = "Tomato Soup";
    private static String POTATO_SOUP = "Potato Soup";
    private EJBContainer container;

    @EJB
    private Waiter joe;
    
    @EJB
    private Waiter john;
    
    
    @Before
    public void startContainer() throws Exception {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
    }

    @Test
    public void orderSoup(){
        String soup = joe.orderSoup(TOMATO_SOUP);
        System.out.println(soup);
        assertEquals(TOMATO_SOUP, soup);
        soup = joe.orderSoup(POTATO_SOUP);
        System.out.println(soup);
        assertEquals(POTATO_SOUP, soup);
        
        String soup1 = john.orderSoup(TOMATO_SOUP);
        System.out.println(soup1);
        assertEquals(TOMATO_SOUP, soup1);
        soup1 = john.orderSoup(POTATO_SOUP);
        System.out.println(soup1);
        assertEquals(POTATO_SOUP, soup1);
    }
    
    @After
    public void closeContainer() throws Exception {
        container.close();
    }
}