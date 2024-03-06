package org.example.timeannotation;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @MeasureTime
    @PostConstruct
    static void calculate() throws InterruptedException {
        Thread.sleep(10000);

        System.out.println("dupa");
    }
}
