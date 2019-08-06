package com.bdqn.dao;

import com.bdqn.entity.Answer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerDao {

    /**
     * 添加回复
     * @param answer
     * @return
     */
    Integer saveAnswer(Answer answer);

    /**
     * 更新问题的回复量
     * @param id
     * @return
     */
    Integer updateQuestionAnswerCount(@Param("id") Integer id);

}
