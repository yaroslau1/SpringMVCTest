package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.Callable;

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
                    Thread.sleep(3000);
                    System.out.println("end sleep");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "login";
            }
        };
        return asyncTask;
    }
}
