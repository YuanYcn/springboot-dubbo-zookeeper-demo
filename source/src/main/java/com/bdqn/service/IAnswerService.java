package com.bdqn.service;

import com.bdqn.entity.Answer;
import org.springframework.stereotype.Service;

@Service
public interface IAnswerService {

    Integer saveAnswer(Answer answer);
}
