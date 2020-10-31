package com.kynnnn.jdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kynnnn.jdbc.dao.CourseDao;
import com.kynnnn.jdbc.model.Course;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ShardingSphereJDBCApplicationTests {

    @Autowired
    private CourseDao courseDao;

    @Test
    void addCourse() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCname("Java" + i);
            course.setUserId(100L);
            course.setCstatus("Normal" + i);
            courseDao.insert(course);
        }
    }

    @Test
    void findCourse() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid", 529446518545973249L);
        Course course = courseDao.selectOne(wrapper);
        System.out.println("course = " + course);
    }

}
