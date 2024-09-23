package factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubscriptionManagerTest {

    @Test
    public void testNewSubscription() {
        SubscriptionManager manager = new SubscriptionManager();
        User user = new User("john_doe");
        manager.subscribe(user, "Premium");
        assertTrue(manager.isSubscribed(user), "User should be subscribed.");
        assertEquals("Premium", manager.getSubscriptionType(user), "Subscription type should be Premium.");
    }

    @Test
    public void testCancelSubscription() {
        SubscriptionManager manager = new SubscriptionManager();
        User user = new User("jane_doe");
        manager.subscribe(user, "Basic");
        manager.cancelSubscription(user);
        assertFalse(manager.isSubscribed(user), "Subscription should be canceled.");
    }

    @Test
    public void testRenewSubscription() {
        SubscriptionManager manager = new SubscriptionManager();
        User user = new User("mark_smith");
        manager.subscribe(user, "Standard");
        manager.renewSubscription(user);
        assertTrue(manager.isSubscribed(user), "Subscription should be renewed.");
    }
}
