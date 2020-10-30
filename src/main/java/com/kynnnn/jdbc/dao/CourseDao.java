package com.kynnnn.jdbc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kynnnn.jdbc.model.Course;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Zhudiwei
 */
@Mapper
public interface CourseDao extends BaseMapper<Course> {
}
