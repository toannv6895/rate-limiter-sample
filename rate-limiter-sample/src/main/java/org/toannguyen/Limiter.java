package org.toannguyen;

import java.util.*;

public class Limiter {
    private static final Map<String, FixedWindow> hashMap = new HashMap<>();
    private static final Map<String, Deque<Long>> hashMap2 = new HashMap<>();
    private static final int THRESHOLD = 3;
    private static final int PERIOD = 1000; // Miliseconds

    public boolean fixedWindowRequest(String userId) {
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

    public boolean slidingWindowRequest(String userId) {
        Deque<Long> deque = hashMap2.get(userId);
        long now = System.currentTimeMillis();
        if (deque == null) {
            deque = new ArrayDeque<>();
            deque.addFirst(now);
            hashMap2.put(userId, deque);
            return true;
        }

        while (!deque.isEmpty() && now - deque.getFirst() > PERIOD) {
            deque.removeFirst();
        }

        if (deque.size() > THRESHOLD) {
            return false;
        }

        deque.addFirst(now);
        return true;
    }
}
