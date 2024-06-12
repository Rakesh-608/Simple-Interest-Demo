package com.example.SimpleInterestDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleInterestController {
    @GetMapping("/calculateSimpleInterest")
    public SimpleInterestClass calculateSimpleInterest(
            @RequestParam double principal,
            @RequestParam double rate,
            @RequestParam int time
    ){
        double interest=(principal*rate*time)/100;
        return new SimpleInterestClass(principal, rate, time, interest);
    }

    public static class SimpleInterestClass{
        private double principal;
        private double rate;
        private int time;
        private double interest;

        public SimpleInterestClass(double principal, double rate, int time, double interest) {
            this.principal = principal;
            this.rate = rate;
            this.time = time;
            this.interest = interest;
        }

        public double getPrincipal() {
            return principal;
        }

        public void setPrincipal(double principal) {
            this.principal = principal;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public double getInterest() {
            return interest;
        }

        public void setInterest(double interest) {
            this.interest = interest;
        }
    }
}
