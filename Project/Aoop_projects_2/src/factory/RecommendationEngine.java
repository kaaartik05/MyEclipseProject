package factory;

import java.util.ArrayList;
import java.util.List;

public class RecommendationEngine {

    public List<String> getRecommendations(User user) {
        List<String> recommendations = new ArrayList<>();

        if (user.getViewingHistory().contains("Action")) {
            recommendations.add("Action Movie");
        }
        if (user.getViewingHistory().contains("Drama")) {
            recommendations.add("Drama Series");
        }

        if (recommendations.isEmpty()) {
            recommendations.add("Comedy Special");
            recommendations.add("Documentary Film");
        }

        return recommendations;
    }
}
