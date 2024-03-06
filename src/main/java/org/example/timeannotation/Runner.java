package org.example.timeannotation;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class Runner {

    private final Calculator calculator;

    public Runner(Calculator calculator) {
        this.calculator = calculator;
    }

    @PostConstruct
    void run() throws InterruptedException {
        calculator.calculate();
    }
}
