package org.toannguyen;

import java.util.HashMap;
import java.util.Map;

public class Limiter {
    private static final Map<String, FixedWindow> hashMap = new HashMap<>();
    private static final int THRESHOLD = 3;
    private static final int PERIOD = 1000; // Miliseconds

    public boolean request(String userId) {
        FixedWindow window = hashMap.get(userId);
        long now = System.currentTimeMillis();
        if (window == null || now - window.timestamp > PERIOD) {
            hashMap.put(userId, new FixedWindow(1, now));
            return true;
        } else {
            if (window.count < THRESHOLD) {
                hashMap.put(userId, new FixedWindow(window.count + 1, now));
                return true;
            }

            return false;
        }
    }
}
