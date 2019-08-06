package com.bdqn.dao;

import java.util.List;

import com.bdqn.entity.Question;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionDao {
    /**
     * 获取所有问题带分页
     * @param start
     * @param pageSize
     * @return
     */
    List<Question> getAllQuestion(@Param("start")Integer start, @Param("pageSize")Integer pageSize);
    /**
     * 获取所有问题带分页
     * @return
     */
    Question getAllAnswerOfQuestion(@Param("qid")Integer qid);
    /**
     * 添加问题
     * @param question
     * @return
     */
    Integer saveQuestion(Question question);
    /**
     * 更新count数量
     * @return
     */
    Integer updateQuestionCount(@Param("qid")Integer qid);
    /**
     * 获得所有问题总数
     * @return
     */
    Integer getAllQuestionCount();
}

