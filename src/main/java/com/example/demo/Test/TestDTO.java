package com.example.demo.Test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class TestDTO implements Cloneable{
    String id;
    String svc;
    String prod;
    List<InnerTestDTO> innerTestDTOList;

//    public TestDTO(String id, String svc, String prod) {
//        this.id = id;
//        this.svc=svc;
//        this.prod = prod;
//    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
