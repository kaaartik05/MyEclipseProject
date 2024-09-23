package factory;

public class StreamingPlatform {

    public static void main(String[] args) {
        User user = new User("john_doe");

   
        SubscriptionManager subscriptionManager = new SubscriptionManager();
        subscriptionManager.subscribe(user, "Premium");
        System.out.println("Is user subscribed? " + subscriptionManager.isSubscribed(user));
        System.out.println("Subscription type: " + subscriptionManager.getSubscriptionType(user));

 
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play("action-movie.mp4");
        videoPlayer.pause();
        videoPlayer.play("action-movie.mp4");
        videoPlayer.stop();

        user.addViewingHistory("Action");
        user.addViewingHistory("Drama");

        RecommendationEngine recommendationEngine = new RecommendationEngine();
        System.out.println("Recommendations: " + recommendationEngine.getRecommendations(user));

        subscriptionManager.renewSubscription(user);

        subscriptionManager.cancelSubscription(user);
        System.out.println("Is user subscribed after cancellation? " + subscriptionManager.isSubscribed(user));
    }
}

