package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //hello/goodbye
    @GetMapping("goodbye")

    public String goodbye(){

        return "Goodbye";
    }

    //create handler request from /hello?name=Launched

    @RequestMapping(method={RequestMethod.GET,RequestMethod.POST})

    public String helloWithQueryParam(@RequestParam String name){

        return "Hello, " + name + " !";
    }

    //Handles request from hello/Launchcode

    @GetMapping("/{name}")

    public String helloPathParam(@PathVariable String name){

        return "Hello, " + name + " !";
    }


    @GetMapping("form")

    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action= 'hello' method='post'>" + // submit a request to hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }



}

