package com.service.impl;

import com.dao.CourseInfoMapper;
import com.pojo.CourseInfo;
import com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Description:    培训信息服务接口实现类
* @Author:         jieHao
* @CreateDate:     2019/4/10 9:59
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/10 9:59
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseInfoMapper courseInfoMapper;


    /**
    * 方法实现说明 添加课程信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/10 10:00
    */
    @Override
    public int addCourse(CourseInfo courseInfo) {
        return courseInfoMapper.insertSelective(courseInfo);
    }

    /**
    * 方法实现说明 查询课程信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:03
    */
    @Override
    public List<CourseInfo> searchCourse(int start, int limit, CourseInfo courseInfo) {
        return courseInfoMapper.searchCourse(start,limit,courseInfo);
    }

    /**
    * 方法实现说明 查询课程信息总数
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:03
    */
    @Override
    public int searchCourseCount() {
        return courseInfoMapper.searchCourseCount();
    }

    /**
    * 方法实现说明 删除课程信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:03
    */
    @Override
    public int delCourseInfo(Integer courseCode) {
        return courseInfoMapper.deleteByPrimaryKey(courseCode);
    }

    /**
    * 方法实现说明 结课（人工）
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:57
    */
    @Override
    public int endCourse(Integer courseCode) {
        return courseInfoMapper.endCourse(courseCode);
    }


}
