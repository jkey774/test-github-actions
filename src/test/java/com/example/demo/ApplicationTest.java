package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ApplicationTest {


   @Test
   public void exampleTestSuccess() {
      Assert.assertTrue(true);
   }

//   @Test
//   public void exampleTestFailure() {
//      Assert.assertTrue(false);
//   }

}
