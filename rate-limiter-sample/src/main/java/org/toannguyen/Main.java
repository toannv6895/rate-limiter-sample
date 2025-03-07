package org.toannguyen;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Limiter limiter = new Limiter();

        // Fixed window
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));
        Thread.sleep(1000);
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("fixedWindowRequest: Sent to API Gateway Server? " + (limiter.fixedWindowRequest("1234") ? "Yes" : "No"));

        // Sliding window
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
        Thread.sleep(1000);
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
        System.out.println("slidingWindowRequest: Sent to API Gateway Server? " + (limiter.slidingWindowRequest("1234") ? "Yes" : "No"));
    }
}