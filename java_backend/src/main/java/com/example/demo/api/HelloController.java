package com.example.demo.api;

import java.text.MessageFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

  public static final String PING_SUCCESSFUL = "Ping Successful";

  @GetMapping("/ping")
  public String ping(@RequestParam String id) {
    System.out.println(MessageFormat.format("The request id is {0}", id));
    int i = Integer.parseInt(id);
    long now = System.currentTimeMillis();
    long period = 5000L;
    long later = System.currentTimeMillis();
    if (i % 2 == 1) {
      while (later - now <= period) {
        later = System.currentTimeMillis();
      }
    }
    return PING_SUCCESSFUL;
  }
}
