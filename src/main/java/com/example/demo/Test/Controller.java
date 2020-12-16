package com.example.demo.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    @Autowired
    Service service;

    @GetMapping("/dto")
    public String test() throws CloneNotSupportedException {
        InnerTestDTO innerTestDTO = new InnerTestDTO("innerId","LRZ0000001");
        InnerTestDTO innerTestDTO1 = new InnerTestDTO("innerId1","LRZ0000001");
        InnerTestDTO innerTestDTO2 = new InnerTestDTO("innerId2","LRZ0000001");
        InnerTestDTO innerTestDTO3 = new InnerTestDTO("innerId3","LRZ0000001");
        InnerTestDTO innerTestDTO4 = new InnerTestDTO("innerId4","LRZ0000001");

        List<InnerTestDTO> innerTestDTOList = new ArrayList<>();

        innerTestDTOList.add(innerTestDTO );
        innerTestDTOList.add(innerTestDTO1);
        innerTestDTOList.add(innerTestDTO2);
        innerTestDTOList.add(innerTestDTO3);
        innerTestDTOList.add(innerTestDTO4);

        TestDTO testDTO = new TestDTO("id", "svc","prod", innerTestDTOList);

        testDTO.innerTestDTOList.forEach(System.out::println);

        TestDTO testDTO1 = service.test(testDTO);
        System.out.println("testDTO.id : " + testDTO.id);
        System.out.println("testDTO1.id : " +testDTO1.id);
        System.out.println("===============================");
        testDTO1.innerTestDTOList.forEach(System.out::println);
        return testDTO1.id;
    }


}
