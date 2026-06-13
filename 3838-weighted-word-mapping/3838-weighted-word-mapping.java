import java.util.*;

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < words.length; i++) {
            map.putIfAbsent(words[i], weights[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(entry.getKey())
              .append(":")
              .append(entry.getValue());
        }

        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna