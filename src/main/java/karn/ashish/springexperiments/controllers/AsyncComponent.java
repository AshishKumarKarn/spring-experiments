package karn.ashish.springexperiments.controllers;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncComponent {
    @Async("threadPoolTaskExecutor")
    public void asyncMethodWithVoidReturnType() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Execute method asynchronously. "
                + Thread.currentThread().getName());
    }
}
