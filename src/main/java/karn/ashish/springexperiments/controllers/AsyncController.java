package karn.ashish.springexperiments.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    private AsyncComponent asyncComponent;

    //http://localhost:8080/async/hello
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("API invoked");

        //Async method must be in a separate component class
        asyncComponent.asyncMethodWithVoidReturnType();
        return "Hello Ashish";
    }


//    public void testAsyncAnnotationForMethodsWithReturnType()
//            throws InterruptedException, ExecutionException {
//        System.out.println("Invoking an asynchronous method. "
//                + Thread.currentThread().getName());
//        Future<String> future = asyncMethodWithReturnType();
//
//        while (true) {
//            if (future.isDone()) {
//                System.out.println("Result from asynchronous process - " + future.get());
//                break;
//            }
//            System.out.println("Continue doing something else. ");
//            Thread.sleep(1000);
//        }
//    }



    @Async
    public Future<String> asyncMethodWithReturnType() {
        System.out.println("Execute method asynchronously - "
                + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            return new AsyncResult<String>("hello world !!!!");
        } catch (InterruptedException e) {
            //
        }

        return null;
    }
}
