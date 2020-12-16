package com.example.demo.Test;

import lombok.extern.slf4j.Slf4j;

@org.springframework.stereotype.Service
@Slf4j
public class Service {

    public TestDTO test(TestDTO testDTO) throws CloneNotSupportedException {
        System.out.println(testDTO.id);
        TestDTO testDTO1 = (TestDTO) testDTO.clone();
        testDTO1.id = "after";
        testDTO1.innerTestDTOList.forEach(System.out::println);

        return testDTO1;
    }
}
