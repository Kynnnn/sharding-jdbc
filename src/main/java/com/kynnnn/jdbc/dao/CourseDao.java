package com.kynnnn.jdbc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kynnnn.jdbc.model.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Zhudiwei
 */
@Mapper
@Repository
public interface CourseDao extends BaseMapper<Course> {
}
