package org.example.timeannotation;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @MeasureTime
    void calculate() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
    }
}
