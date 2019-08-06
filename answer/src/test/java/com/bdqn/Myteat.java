package com.bdqn;

import com.bdqn.service.IAnswerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Myteat {
    @Autowired
    private IAnswerService answerService;
    @Test
    public void test1(){
        System.out.println(answerService);
        //System.out.println(answerService.saveAnswer(new Answer(null, "123", 1, null)));
    }
}
