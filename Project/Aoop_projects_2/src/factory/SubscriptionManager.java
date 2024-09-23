package factory;

import java.util.HashMap;
import java.util.Map;

public class SubscriptionManager {
    private Map<User, String> subscriptions = new HashMap<>();

    public void subscribe(User user, String subscriptionType) {
        subscriptions.put(user, subscriptionType);
        System.out.println(user.getUsername() + " subscribed to " + subscriptionType);
    }

    public void renewSubscription(User user) {
        if (subscriptions.containsKey(user)) {
            System.out.println("Renewing subscription for " + user.getUsername());
        }
    }

    public void cancelSubscription(User user) {
        subscriptions.remove(user);
        System.out.println("Canceled subscription for " + user.getUsername());
    }

    public boolean isSubscribed(User user) {
        return subscriptions.containsKey(user);
    }

    public String getSubscriptionType(User user) {
        return subscriptions.get(user);
    }
}
