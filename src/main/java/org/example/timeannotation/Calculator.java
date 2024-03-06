package org.example.timeannotation;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @MeasureTime
    void calculate() throws InterruptedException {
        Thread.sleep(10000);
    }
}
