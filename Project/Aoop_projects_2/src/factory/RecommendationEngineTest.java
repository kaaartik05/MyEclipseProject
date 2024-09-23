package factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class RecommendationEngineTest {

    @Test
    public void testRecommendationsBasedOnHistory() {
        RecommendationEngine engine = new RecommendationEngine();
        User user = new User("anna_jones");
        user.addViewingHistory("Action");
        user.addViewingHistory("Drama");

        List<String> recommendations = engine.getRecommendations(user);
        
        assertTrue(recommendations.contains("Action Movie"), "Recommended content should include Action Movie.");
        assertTrue(recommendations.contains("Drama Series"), "Recommended content should include Drama Series.");
    }

    @Test
    public void testRecommendationsWithNoHistory() {
        RecommendationEngine engine = new RecommendationEngine();
        User user = new User("new_user");

        List<String> recommendations = engine.getRecommendations(user);

        assertNotNull(recommendations, "Recommendations should not be null.");
        assertFalse(recommendations.isEmpty(), "Recommendations should not be empty.");
        assertTrue(recommendations.contains("Comedy Special"), "Recommended content should include Comedy Special.");
    }
}
