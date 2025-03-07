package org.toannguyen;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Limiter limiter = new Limiter();
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
        Thread.sleep(1000);
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
        System.out.println("Sent to API Gateway Server? " + (limiter.request("1234") ? "Yes" : "No"));
    }
}