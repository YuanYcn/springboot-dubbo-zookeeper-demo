package com.bdqn.serviceImpl;

import com.bdqn.dao.QuestionDao;
import com.bdqn.entity.Page;
import com.bdqn.entity.Question;
import com.bdqn.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class QuestionServiceImpl implements IQuestionService {
    @Autowired
    private QuestionDao questionDao;
    @Autowired
    private Page<Question> page;
    @Override
    public Page<Question> getAllQuestion(Integer start, Integer pageSize) {
        page.setList(questionDao.getAllQuestion(start,pageSize));
        page.setCount(questionDao.getAllQuestionCount());
        page.setStart(start);
        return page;
    }

    @Override
    public Question getQuestionWithAnswer(Integer qid) {
        return questionDao.getAllAnswerOfQuestion(qid);
    }

    @Override
    public Integer saveQuestion(Question question) {
        return questionDao.saveQuestion(question);
    }
}
