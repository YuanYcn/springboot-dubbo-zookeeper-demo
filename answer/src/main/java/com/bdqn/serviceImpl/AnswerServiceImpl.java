package com.bdqn.serviceImpl;

import com.bdqn.dao.AnswerDao;
import com.bdqn.entity.Answer;
import com.bdqn.service.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AnswerServiceImpl implements IAnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Override
    public Integer saveAnswer(Answer answer) {
        answerDao.updateQuestionAnswerCount(answer.getQid());
        return answerDao.saveAnswer(answer);
    }
}
