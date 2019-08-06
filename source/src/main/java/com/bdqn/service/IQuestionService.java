package com.bdqn.service;

import com.bdqn.entity.Page;
import com.bdqn.entity.Question;
import org.springframework.stereotype.Service;

@Service
public interface IQuestionService {
    Page<Question> getAllQuestion(Integer start, Integer pageSize);

    Question getQuestionWithAnswer(Integer qid);

    Integer saveQuestion(Question question);
}
