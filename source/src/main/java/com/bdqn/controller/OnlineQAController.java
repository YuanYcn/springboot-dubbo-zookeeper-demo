package com.bdqn.controller;

import com.bdqn.entity.Answer;
import com.bdqn.entity.Question;
import com.bdqn.service.IAnswerService;
import com.bdqn.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class OnlineQAController {
    @Autowired
    private IAnswerService answerService;
    @Autowired
    private IQuestionService questionService;

    @RequestMapping("/index")
    public String goIndexPage(Integer start,Integer pageSize,Model model){
        try{
            if(start==null)start=0;
            if(pageSize==null)pageSize=3;
            model.addAttribute("page",questionService.getAllQuestion(start,pageSize));
        }catch (Exception e){
            System.out.println(123);
            e.printStackTrace();
        }
        return "index";
    }
    @RequestMapping("/que")
    public String goQuestionPage(){
        return "question";
    }
    @RequestMapping("/ans")
    public String goAnswerPage(Integer id,Model model){
        model.addAttribute("que",questionService.getQuestionWithAnswer(id));
        return "answer";
    }
    @RequestMapping("/savea.do")
    @ResponseBody
    public String saveAnswer(Answer answer){
        int num=answerService.saveAnswer(answer);
        if(num==1)
            return "success";
        else
            return "fail";
    }
    @RequestMapping("/saveq.do")
    @ResponseBody
    public String saveQuestion(Question question){
        int num=questionService.saveQuestion(question);
        if(num==1)
            return "success";
        else
            return "fail";
    }
}
