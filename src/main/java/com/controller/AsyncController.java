package com.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.Callable;

@Async
@Controller
public class AsyncController {

    @RequestMapping("/helloAsync")
    public Callable<String> sayHelloAsync() {
        System.out.println("in servlet");

        Callable<String> asyncTask = new Callable<String>() {

            @Override
            public String call() throws Exception {
                try {
                    System.out.println("start sleep");
                    System.out.println("////////////////////////////////////////////////////////");
                    System.out.println("////////////////////////////////////////////////////////");
                    System.out.println("////////////////////////////////////////////////////////");
                    System.out.println("////////////////////////////////////////////////////////");
                    System.out.println("////////////////////////////////////////////////////////");
                    System.out.println("////////////////////////////////////////////////////////");
                    System.out.println("////////////////////////////////////////////////////////");
                    System.out.println("////////////////////////////////////////////////////////");
                    Thread.sleep(5000);
                    System.out.println("end sleep");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "hello";
            }
        };
        System.out.println("out servlet");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("****************************");
        return asyncTask;
    }
}
