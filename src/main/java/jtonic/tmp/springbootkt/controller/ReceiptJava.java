package jtonic.tmp.springbootkt.controller;

import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Antonel Ernest Pazargic on 17/07/2017.
 *
 * @author Antonel Ernest Pazargic
 */
@RestController
@RequestMapping("kotlin")
public class ReceiptJava {

  @GetMapping("receipt1")
  public void getReceipt(@RequestParam(name = "ing", required = false) String[] ings) {
    Arrays.asList(ings).forEach(System.out::println);
  }

}
