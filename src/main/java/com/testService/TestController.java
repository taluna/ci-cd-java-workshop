package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * jksdbsjkds.
 */
@RestController
@CrossOrigin
public class TestController {

   /**
   * alksjbajsa.
   * @return kajshakjsa.
    */
    @GetMapping("/home")
   public final String homeRequest() {
     return "Hello World!";
    }
}
