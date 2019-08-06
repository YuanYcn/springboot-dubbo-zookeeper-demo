package com.bdqn.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionDaoTest {
    @Autowired
    private QuestionDao questionDao;
    @Test
    public void test1(){
       System.out.println("测试开始");
       System.out.println(questionDao.getAllQuestion(0,10));
//        Assert.assertEquals(19,questionDao.getAllQuestionCount().longValue());

    }

}