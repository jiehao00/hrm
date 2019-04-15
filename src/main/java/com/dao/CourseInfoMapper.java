package com.dao;

import com.pojo.CourseInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseInfoMapper {
    int deleteByPrimaryKey(Integer courseCode);

    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);

    CourseInfo selectByPrimaryKey(Integer courseCode);

    int updateByPrimaryKeySelective(CourseInfo record);

    int updateByPrimaryKey(CourseInfo record);


    /**
    * 方法实现说明 查询课程信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:04
    */
    List<CourseInfo>searchCourse(@Param("page")int page,@Param("limit")int limit, @Param("courseInfo")CourseInfo courseInfo);

    /**
    * 方法实现说明 查询课程信息总数
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:05
    */
    int searchCourseCount();
}